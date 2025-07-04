
package ticketbooking;

import ticketbooking.entities.Ticket;
import ticketbooking.entities.Train;
import ticketbooking.entities.User;
import ticketbooking.services.UserBookingService;
import ticketbooking.util.UserServiceUtil;

import java.io.IOException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;

public class App {

    public static void main(String[] args) {
        System.out.println("Running Train Booking System");
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        UserBookingService userBookingService;
        try{
            userBookingService = new UserBookingService();
        }catch(IOException ex){
            System.out.println("There is something wrong");
            ex.printStackTrace();
            return;
        }
        Train trainSelectedForBooking = null;
        while(option!=7){
            System.out.println("Choose option");
            System.out.println("1. Sign up");
            System.out.println("2. Login");
            System.out.println("3. Fetch Bookings");
            System.out.println("4. Search Trains");
            System.out.println("5. Book a Seat");
            System.out.println("6. Cancel my Booking");
            System.out.println("7. Exit the App");
            option = scanner.nextInt();
            trainSelectedForBooking = new Train();
            switch (option){
                case 1:
                    System.out.println("Enter the username to signup");
                    String nameToSignUp = scanner.next();
                    System.out.println("Enter the password to signup");
                    String passwordToSignUp = scanner.next();
                    User userToSignup = new User(nameToSignUp, passwordToSignUp, UserServiceUtil.hashPassword(passwordToSignUp), new ArrayList<>(), UUID.randomUUID().toString());
                    userBookingService.signUp(userToSignup);
                    break;
                case 2:
                    System.out.println("Enter the username to Login");
                    String nameToLogin = scanner.next();
                    System.out.println("Enter the password to signup");
                    String passwordToLogin = scanner.next();
                    User userToLogin = new User(nameToLogin, passwordToLogin, UserServiceUtil.hashPassword(passwordToLogin), new ArrayList<>(), UUID.randomUUID().toString());
                    try{
                        userBookingService = new UserBookingService(userToLogin);
                        if (!userBookingService.loginUser()) {
                            System.out.println("Login failed. Please try again.");
                        }
                    }catch (IOException ex){
                        return;
                    }
                    break;
                case 3:
                    System.out.println("Fetching your bookings");
                    userBookingService.fetchBookings();
                    break;
                case 4:
                    System.out.println("Type your source station");
                    String source = scanner.next();
                    System.out.println("Type your destination station");
                    String dest = scanner.next();
                    List<Train> trains = userBookingService.getTrains(source, dest);
                    int index = 1;
                    for (Train t: trains){
                        System.out.println(index+" Train id : "+t.getTrainId());
                        for (Map.Entry<String, String> entry: t.getStationTimes().entrySet()){
                            System.out.println("station "+entry.getKey()+" time: "+entry.getValue());
                        }
                    }
                    System.out.println("Select a train by typing 1,2,3...");
                    for (int i = 0; i < trains.size(); i++) {
                        Train t = trains.get(i);
                        System.out.println((i + 1) + ". Train ID: " + t.getTrainId() + ", Train No: " + t.getTrainNo());
                        for (Map.Entry<String, String> entry : t.getStationTimes().entrySet()) {
                            System.out.println("   Station: " + entry.getKey() + ", Time: " + entry.getValue());
                        }
                    }

                    int selectedIndex = scanner.nextInt() - 1;
                    if (selectedIndex < 0 || selectedIndex >= trains.size()) {
                        System.out.println("Invalid train selection.");
                        break; // or continue;
                    }
                    trainSelectedForBooking = trains.get(scanner.nextInt());
                    break;

                case 5:
                    if (userBookingService.getAvailableTrains().isEmpty()) {
                        System.out.println("No trains available.");
                        break;
                    }

                    System.out.println("Available Trains:");
                    for (int i = 0; i < userBookingService.getAvailableTrains().size(); i++) {
                        Train t = userBookingService.getAvailableTrains().get(i);
                        System.out.println(i + ": " + t.getTrainName() + " [" + t.getTrainNo() + "]");
                    }

                    System.out.println("Enter train index to book seat:");
                    int trainIndex = scanner.nextInt();
                    if (trainIndex < 0 || trainIndex >= userBookingService.getAvailableTrains().size()) {
                        System.out.println("Invalid train selection.");
                        break;
                    }

                    Train selectedTrain = userBookingService.getAvailableTrains().get(trainIndex);

                    System.out.println("Enter row and column to book seat (0-based index):");
                    int row = scanner.nextInt();
                    int col = scanner.nextInt();

                    Boolean booked = userBookingService.bookTrainSeat(selectedTrain, row, col);
                    if (booked.equals(Boolean.TRUE)) {
                        System.out.println("Booking successful!");

                        // Prompt for ticket details
                        scanner.nextLine(); // consume newline
                        System.out.println("Enter source:");
                        source = scanner.nextLine();

                        System.out.println("Enter destination:");
                        String destination = scanner.nextLine();

                        // Create the ticket
                        Ticket newTicket = new Ticket(
                                UUID.randomUUID().toString(),
                                userBookingService.getCurrentUser().getUserId(),
                                source,
                                destination,
                                java.time.LocalDate.now().toString(),
                                selectedTrain
                        );

                        // Add to user’s ticket list
                        userBookingService.getCurrentUser().getTicketsBooked().add(newTicket);

                        try {
                            userBookingService.saveUserList(); // Save changes to file
                        } catch (IOException e) {
                            System.out.println("Error saving ticket: " + e.getMessage());
                        }

                        System.out.println("Ticket booked! Enjoy your journey.");
                    } else {
                        System.out.println("Seat already booked or invalid.");
                    }
                    break;

                case 6:
                    System.out.println("Enter the ticket id to cancel:");
                    String cancelId = scanner.next();
                    userBookingService.cancelBooking(cancelId);
                    break;

                default:
                    break;
            }
        }
    }

    public String getGreeting() {
        return  "Welcome to IRCTC Ticket Booking System!" ;
    }
}
