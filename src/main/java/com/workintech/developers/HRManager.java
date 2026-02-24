package com.workintech.developers;

import java.util.Arrays;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
        // Dizilerin boyutlarını ihtiyaca göre başlatabilirsiniz
        this.juniorDevelopers = new JuniorDeveloper[5];
        this.midDevelopers = new MidDeveloper[5];
        this.seniorDevelopers = new SeniorDeveloper[5];
    }

    @Override
    public void work() {
        setSalary(getSalary() + 15000);
        System.out.println("HR Manager " + getName() + " starts to working.");
    }

    // Overloaded addEmployee methods
    public void addEmployee(int index, JuniorDeveloper dev) {
        try {
            if (juniorDevelopers[index] == null) {
                juniorDevelopers[index] = dev;
            } else {
                System.out.println("Index " + index + " is already occupied.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index " + index + " is out of bounds.");
        }
    }

    public void addEmployee(int index, MidDeveloper dev) {
        try {
            if (midDevelopers[index] == null) {
                midDevelopers[index] = dev;
            } else {
                System.out.println("Index " + index + " is already occupied.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index " + index + " is out of bounds.");
        }
    }

    public void addEmployee(int index, SeniorDeveloper dev) {
        try {
            if (seniorDevelopers[index] == null) {
                seniorDevelopers[index] = dev;
            } else {
                System.out.println("Index " + index + " is already occupied.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index " + index + " is out of bounds.");
        }
    }
}