public class NumberBox<T extends Number> {

    public T number;

    public NumberBox(T number){
        this.number=number;
    }

    public double doubleValue(){
        return number.doubleValue();
    }

}
