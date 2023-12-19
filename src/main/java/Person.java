public class Person {

    private String name;
    private int age;

    void introduce(){
        System.out.println("Hello, My name is "+name+" and I'm "+age+" years old");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
