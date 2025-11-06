package top_highest_java_8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {

     private String empName;
     private String departmentName;
     private double salary;

     public Employee(String empName, String departmentName, double salary) {
         this.empName = empName;
         this.departmentName = departmentName;
         this.salary = salary;
     }

     public String getEmpName() {
         return empName;
     }

     public void setEmpName(String empName) {
         this.empName = empName;
     }

     public String getDepartmentName() {
         return departmentName;
     }

     public void setDepartmentName(String departmentName) {
         this.departmentName = departmentName;
     }

     public double getSalary() {
         return salary;
     }

     public void setSalary(double salary) {
         this.salary = salary;
     }

     @Override
     public String toString() {
         return "Employee{" +
                 "empName='" + empName + '\'' +
                 ", departmentName='" + departmentName + '\'' +
                 ", salary=" + salary +
                 '}';
     }
 }
     class EmployeeHigestSalary{
        public static void main(String[] args) {
            List<Employee> employees= Arrays.asList(
                    new Employee( "Amit", "IT", 85000),
                    new Employee( "Rahul", "HR", 45000),
                    new Employee( "Sneha", "Finance", 60000),
                    new Employee("Priya", "IT", 95000),
                    new Employee( "Ravi", "Sales", 55000),
                    new Employee( "Karan", "IT", 70000),
                    new Employee( "Divya", "HR", 48000),
                    new Employee( "Vikas", "IT", 99000),
                    new Employee( "Meena", "IT", 87000),
                    new Employee( "Neha", "Finance", 62000)

            );
            List<Employee> top3highestpaidEmployee=    employees.stream()
                                                     .filter(e -> "IT".equals(e.getDepartmentName()))
                                                    .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                                                     .limit(3)
                                                      .collect(Collectors.toList());
            top3highestpaidEmployee.forEach(System.out::println);


            // Find the  Top 3 Highest-paid Employees in IT Departmen







        }
    }

