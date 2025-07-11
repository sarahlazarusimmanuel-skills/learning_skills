//In every Thread there need to be a run method

class Hi extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hii");
            try {

                Thread.sleep(10);

            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
    }
}

class Hello extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hello");
            try {

                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }

        }
    }
}

public class Threads {
    public static void main(String[] args) {
        //Sotware runs on OS Underlined we have hardware (CPU , RAM )
        //Time Sharing
        //smallest unit of execution
        //multitasking
        //lightweight
        //they can run parallely
        //multiple threads can share resources
        Hi obj = new Hi();

        Hello obj1 = new Hello();

//        obj.show();
//        obj1.show();
        //System.out.println(obj.getPriority());//range of priority
        // goes from 1 to 10  5 is the default priority
        //you can also set the priority
        //obj.setPriority(Thread.MAXPRIORITY);
        obj.start();
        obj1.start();
//how will you make your normal objects as threads just extendthe class with threads

    }
}