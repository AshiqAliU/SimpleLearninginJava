package ThreadDemo;

public class ThreadImpl implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        Thread thread=new Thread(new ThreadImpl());
        thread.start();

    }
}
