package ArrayListWithEmployee;

import java.util.ArrayList;

public class EmployeeListManager {

    private ArrayList<Employee> employeeArrayList;

    public EmployeeListManager(){
        employeeArrayList=new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employeeArrayList.add(employee);
    }

    public void removeEmployee(Employee employee){
        employeeArrayList.remove(employee);
    }

    public void displayNameByDependmentWist(String DeptName){

        for(int i=0;i< employeeArrayList.size();i++){
            if(DeptName.equals(employeeArrayList.get(i).getDeptName()))
                System.out.println("Name :"+employeeArrayList.get(i).getName()+" Employee ID "+employeeArrayList.get(i).getEmployeeId() );
        }

    }


}
