package ArrayListWithEmployee;

public class ArrayListDemo {


    public static void Employee(){
        EmployeeListManager manager=new EmployeeListManager();

        Employee employee1=new Employee("John",20,"Dept1");
        Employee employee2=new Employee("Obama",21,"Dept1");
        Employee employee3=new Employee("David",22,"Dept2");

        manager.addEmployee(employee1);
        manager.addEmployee(employee2);
        manager.addEmployee(employee3);

        manager.displayNameByDependmentWist("Dept2");
    }

    public static void main(String[] args) {
        Employee();
    }



}
