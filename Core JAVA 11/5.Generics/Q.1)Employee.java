package Generics;


import java.util.HashSet;
import java.util.Set;


public class Employee {

    private int empId;
    private String empName;
    private int Salary;
    private String Department;

    public Employee(int empId, String empName, int salary, String Department) {
        super();
        this.empId = empId;
        this.empName = empName;
        this.Salary=salary;
        this.Department=Department;
    }

    
    public final int getEmpId() {
        return empId;
    }

    
    public final void setEmpId(int empId) {
        this.empId = empId;
    }

    
    public final String getEmpName() {
        return empName;
    }

   
    public final void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Employee [empId="+ empId +", empName=" + empName + "]";
    }

    @Override
    public int hashCode() {
        return this.empId;
    }

    @Override
    public boolean equals(Object obj) {
        Employee employee = (Employee) obj;
        if (employee.empId == this.empId) {
            employee.setEmpName(this.empName);
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Set<Employee> employees = new HashSet<>();
        employees.add(new Employee(1, "Raj"));
        employees.add(new Employee(1, "Pradeep"));
        employees.add(new Employee(1, "Kumar"));
        employees.add(new Employee(2, "Chandan"));
        employees.add(new Employee(2, "Amitava"));

        System.out.println(employees);
    }
}