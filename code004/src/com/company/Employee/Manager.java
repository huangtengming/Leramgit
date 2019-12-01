package com.company.Employee;

public class Manager extends Employee {
    private double bonus ;

    /**
     *
     * @param name
     * @param salary
     * @param year
     * @param month
     * @param day
     *
     * 子类构造器
     * super 是用来访问子类的超类的私有域
     */
    public Manager (String name , double salary , int year ,int month , int day){
        super(name,salary,year,month,day);
        bonus = 0 ;
    }

    /**
     * public double getSalary() {
     *         return salary + bonus ;//not work
     *     }
     *     因为子类不能访问父类的私有域
     *
     *
     * public double getSalary() {
     *         double baseSalary = getSalary();//not work
     *         return baseSalary + baseSalary ;
     *         因为子类也有一个getSalary的方法
     *     }
     * @return
     */
    @Override
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + baseSalary ;
    }

    public void setBonus(double b) {
        bonus = b ;
    }

}
