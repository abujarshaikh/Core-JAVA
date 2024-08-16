//Write a java program for class Employee which consits of EmpId,EmpName,EmpSal
//1).Achieve data hiding fir EmpSal.
//2).Create a method to employeeDetailes() to print detailes of all the employee.
//3).Increment second employee salary by 50% and print updated salary along with old salary
//4).decrement third employee salary by 5% and print updated salary along with old salary
//5).Initialize all employee detailes while creating object for each employee.

class Employee {
     int empId;
     String empName;
     private double empSal;

     public Employee(int empId, String empName, double empSal) {
          this.empId = empId;
          this.empName = empName;
          this.empSal = empSal;
     }

     public void employeeDetailes() {
          System.out.println();
          System.out.println("Employee Id:" + empId);
          System.out.println("Employee Name:" + empName);
          System.out.println("Employee Salary:" + empSal + " LPA");
     }

     public void incrementSalary() {
          double updatedSalary = empSal + empSal * 0.5;
          System.out.println("Updated Salary:" + updatedSalary + " LPA");
     }

     public void decrementSalary() {
          double updatedSalary = empSal - empSal * 0.05;
          System.out.println("Updated Salary:" + updatedSalary + " LPA");
     }
}

public class Company {
     public static void main(String[] args) {
          Employee e = new Employee(101, "Virat", 7);
          e.employeeDetailes();

          System.out.println("==============================");

          Employee e1 = new Employee(202, "Rohit", 8);
          e1.employeeDetailes();
          e1.incrementSalary();

          System.out.println("==============================");

          Employee e2 = new Employee(303, "Dhoni", 9);
          e2.employeeDetailes();
          e2.decrementSalary();

          System.out.println("==============================");
     }

}