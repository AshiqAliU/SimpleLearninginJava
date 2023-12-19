import java.util.ArrayList;
import java.util.List;

public class Box<T> {

    private T value;

    public void setValue(T value){
        this.value=value;
    }

    public T getValue(){
        return value;
    }

    public <T> void printArray (T[] array) {

        for(T item: array){
            System.out.println(item);
        }
    }

    public void printList(List<?> list){

        //ArrayList
        for(Object item:list){
            System.out.println(item);
        }
    }

}
