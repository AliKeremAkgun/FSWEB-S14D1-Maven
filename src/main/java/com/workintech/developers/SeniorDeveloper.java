package com.workintech.developers;

public class SeniorDeveloper extends Employee {
    public SeniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(getSalary() + 20000);
        System.out.println("Senior Developer " + getName() + " starts to working.");
    }
}