package ArrayListWithEmployee;

public class Employee {

    private String name;
    private int employeeId;
    private String deptName;


    public Employee(String name, int employeeId, String deptName) {
        this.name = name;
        this.employeeId = employeeId;
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }



}
