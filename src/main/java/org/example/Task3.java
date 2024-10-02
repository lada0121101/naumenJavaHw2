package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Task3 {
    public class Employee {
        private String fullName;
        private int age;
        private String department;
        private double salary;
        public String getFullName(){
            return fullName;
        }

        public void setFullName(String value){
            if(value != null && !value.isEmpty())
                fullName = value;
            else
                throw new IllegalArgumentException("A name should contain at least one letter");
        }

        public int getAge(){
            return age;
        }

        public void setAge(int value){
            if(value <18)
                throw new IllegalArgumentException("The passed value is too small to be age of an employee");
            else {
                if(value >85)
                    throw new IllegalArgumentException("The passed value is too large to be age of an employee");
                else
                    age = value;
            }
        }

        public String getDepartment(){
            return department;
        }

        public void setDepartment(String value){
            if(value!= null && !value.isEmpty())
                department=value;
            else
                throw new IllegalArgumentException("A name of the department should contain at least one letter");
        }

        public Double getSalary(){
            return salary;
        }

        public void setSalary(double value){
            if(Double.isInfinite(value)||Double.isNaN(value))
                throw new IllegalArgumentException("A salary can not be Infinity or NaN");
            else{
                if(value<15000)
                    throw new IllegalArgumentException("A salary can not be less than minimum amount of salary in the country");
                else
                    salary=value;
            }
        }
    }

    public ArrayList<Employee> genEmployees(){
        ArrayList<Employee> employees = new ArrayList<>();
        Employee e1 = new Employee();
        e1.setFullName("Gomer Simpson");
        e1.setAge(45);
        e1.setDepartment("Security department");
        e1.setSalary(20000);
        employees.add(e1);
        Employee e2=new Employee();
        e2.setFullName("Ron Weasley");
        e2.setSalary(50000);
        e2.setDepartment("Financal department");
        e2.setAge(34);
        employees.add(e2);
        Employee e3 = new Employee();
        e3.setFullName("Peter Parker");
        e3.setAge(28);
        e3.setDepartment("Security department");
        e3.setSalary(32000.28);
        employees.add(e3);
        Employee e4=new Employee();
        e4.setFullName("Willy Wonka");
        e4.setAge(35);
        e4.setDepartment("Retail department");
        e4.setSalary(150000);
        employees.add(e4);
        Employee e5 = new Employee();
        e5.setFullName("Gargamel");
        e5.setAge(65);
        e5.setDepartment("Logistic department");
        e5.setSalary(18000);
        employees.add(e5);
        return employees;
    }

    public Stream<String> transform(ArrayList<Employee> list){
        return list.stream().map(x-> x.getFullName()+" - "+x.getDepartment());
    }
}
