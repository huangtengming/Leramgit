package com.company.Employee;

import static org.graalvm.compiler.debug.DebugOptions.Log;

public class EmployeeTest {
    private static final Object TAG = "Employee";

    public static void main(String[] args){
        Employee[] staff = new Employee[4];
        staff[0] = new Employee("xiaoming",4000,2019,11,24);
        staff[1] = new Employee("xiaowang",4400,2019,11,24);
        staff[2] = new Employee("xiaogao",4050,2019,11,24);

        Manager boss = new Manager("daming",40000,2008,1,1);

        boss.setBonus(500);

        staff[3] = boss ;

        for (Employee r : staff
             ) {
            r.raiseSalary(5);

        }

        for (Employee r: staff
             ) {
            System.out.println("name: "+ r.getName() + ", salary: " + r.getSalary() +
                                        ", hirday: " + r.getHirDay());
            Log.d(TAG, "main: ");

        }

    }
}
