package com.company.abstractClasses;

import java.time.LocalDate;

public class Employee extends Person{

    /**p
     * 实列区
     */
    private String name ;
    private double salary ;
    private LocalDate  hirDay ;

    //构造器，构造器与类名相同。
    public Employee(String name , double salary , int year , int month , int day ) {
       // name = n;
        //String name = n ; 这是一种错误方式，声明的使局部变量只能在构造器内部访问。
       // salary = s ;
       // hirDay = LocalDate.of(year,month,day);

        super(name);
        this.salary = salary ;
        hirDay = LocalDate.of(year,month,day);

    }

    @Override
    public String getDescription() {
        return String.format("an employee with a salary of $%.2%",salary);
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
