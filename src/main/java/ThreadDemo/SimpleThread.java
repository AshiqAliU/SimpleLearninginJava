package ThreadDemo;

public class SimpleThread extends Thread {

    public void run(){
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        SimpleThread simpleThread= new SimpleThread();
        simpleThread.start();
    }

}
