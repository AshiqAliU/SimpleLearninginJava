package ThreadDemo;

public class MyExtendThreadDemo {

    public static void main(String[] args) {

        EvenPrinter evenPrinter = new EvenPrinter(10);
        OddPrinter oddPrinter = new OddPrinter(10);

        evenPrinter.start();
        oddPrinter.start();

        try {
            evenPrinter.join();
            oddPrinter.join();
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted");
        }
        System.out.println("Main Thread exiting");
    }
}


class EvenPrinter extends Thread {

    private int limit;

    public EvenPrinter(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        for (int i = 2; i <= limit; i += 2) {
            System.out.println("Even : " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("EvenPrinter Interrupted");
            }
        }
    }
}


class OddPrinter extends Thread {

    private int limit;

    public OddPrinter(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        for (int i = 1; i <= limit; i += 2) {
            System.out.println("Odd : " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("OddPrinter Interrupted");
            }
        }
    }
}

