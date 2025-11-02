package com.cs.hospital_management.beans;

public class Doctor {
    private final String name;
    private final String specialization;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public void showDoctor() {
        System.out.println("Doctor: " + name + " (" + specialization + ")");
    }

    @Override
    public String toString() {
        return "Doctor{name='" + name + "', specialization='" + specialization + "'}";
    }
}
