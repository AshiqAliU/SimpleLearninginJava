package DemoInCollections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueDemo {

    public static void main(String[] args) {

        Deque<Integer> deque=new ArrayDeque<>();

        deque.addFirst(1);
        deque.addLast(10);

        System.out.println("Dequeue :" +deque);

      /*  deque.add(5);
        System.out.println("Dequeue :" +deque);*/


        int removedFirst=deque.removeFirst();
        System.out.println("Removed First Element : "+removedFirst);
        System.out.println("Deque after removeFirst :"+deque);


        int removedLast=deque.removeLast();
        System.out.println("Removed First Element : "+removedLast);
        System.out.println("Deque after removedLast :"+deque);



    }

}
