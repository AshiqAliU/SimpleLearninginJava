package DemoInCollections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<Integer> queue=new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println("Queue :"+queue);

        int removedElement= queue.remove();

        System.out.println("Removed Element :" +removedElement);
        System.out.println("Queue :"+queue);

        int headElement = queue.element();

        System.out.println("Head Element : "+headElement);
        System.out.println("Queue after element :"+queue);

    }

}
