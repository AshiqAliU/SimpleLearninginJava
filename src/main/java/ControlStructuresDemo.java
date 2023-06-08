package java;

public class ControlStructuresDemo {


    //  Control structures: if, switch, for, while, and do-while

    public static void main(String[] args) {

        int score=30;

        if(score>=40){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }

        int day=6;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Holiday");
                break;
        }

        int i;
        for(i=0;i<=100;i++){
            System.out.println("Loop Iteration : "+i);
        }


        int counter=5;
        while(counter>5){
            System.out.println("Counter : "+counter);
            counter--; //counter=counter-1;
        }

        int doCounter=5;
        do{
            System.out.println("Do  Counter : " +doCounter);
            doCounter--;
        }while(doCounter>5);



    }

}
