package com.workintech.developers;

public class JuniorDeveloper extends Employee {
    public JuniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(getSalary() + 5000); // Örnek maaş güncelleme
        System.out.println("Junior Developer " + getName() + " starts to working.");
    }
}



