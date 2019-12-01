package com.company.Employee;

import java.time.LocalDate;

public class Employee {

    /**p
     * 实列区
     */
    private String name ;
    private double salary ;
    private LocalDate  hirDay ;

    //构造器，构造器与类名相同。
    public Employee (String n , double s ,int year ,int month ,int day ) {
        name = n;
        //String name = n ; 这是一种错误方式，声明的使局部变量只能在构造器内部访问。
        salary = s ;
        hirDay = LocalDate.of(year,month,day);

    }

    // 方法
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name ;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    public LocalDate getHirDay() {
        return hirDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary*byPercent/100 ;
        salary += raise ;

    }


}
