package com.cg.eis.bean;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private String designation;
    private String insuranceScheme;

    public Employee(int id, String name, double salary, String designation, String insuranceScheme) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
        this.insuranceScheme = insuranceScheme;
    }

    public int getId() {
        return id;
    }

    public String getInsuranceScheme() {
        return insuranceScheme;
    }

    public String toString() {
        return id + " " + name + " " + salary + " " + designation + " " + insuranceScheme;
    }
}