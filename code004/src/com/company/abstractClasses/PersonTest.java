package com.company.abstractClasses;

public class PersonTest {

    public static void main(String[] args) {

        Person[] people = new Person[2];
        people[0] = new Employee("xiaoming",4000,2019,4,2);
        people[1] = new Student("dahuang","computer");

        for(Person s :people) {
            System.out.println(s.getName() + "," + s.getDescription());
        }

    }

}
