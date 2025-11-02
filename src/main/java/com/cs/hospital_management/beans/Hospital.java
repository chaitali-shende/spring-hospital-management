package com.cs.hospital_management.beans;

import java.util.List;

public class Hospital {
    private final String hospitalName;
    private final List<Doctor> doctors;
    private final List<Equipment> equipments;

    public Hospital(String hospitalName, List<Doctor> doctors, List<Equipment> equipments) {
        this.hospitalName = hospitalName;
        this.doctors = doctors;
        this.equipments = equipments;
    }

    public void showHospitalDetails() {
        System.out.println("🏥 Hospital Name: " + hospitalName);
        System.out.println("\n👩‍⚕️ Doctors:");
        doctors.forEach(Doctor::showDoctor);

        System.out.println("\n🧰 Equipments:");
        equipments.forEach(Equipment::showEquipment);
    }

    @Override
    public String toString() {
        return "Hospital{name='" + hospitalName + "', doctors=" + doctors + ", equipments=" + equipments + "}";
    }
}
