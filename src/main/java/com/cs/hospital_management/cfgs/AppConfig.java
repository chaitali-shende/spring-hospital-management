package com.cs.hospital_management.cfgs;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cs.hospital_management.beans.Doctor;
import com.cs.hospital_management.beans.Equipment;
import com.cs.hospital_management.beans.Hospital;

@Configuration
public class AppConfig {

    // --- Doctor Beans (Constructor Injection) ---
    @Bean
    public Doctor doctor1() {
        return new Doctor("Dr. Meena Gupta", "Cardiologist");
    }

    @Bean
    public Doctor doctor2() {
        return new Doctor("Dr. Ramesh Verma", "Neurologist");
    }

    @Bean
    public Doctor doctor3() {
        return new Doctor("Dr. Sneha Kulkarni", "Pediatrician");
    }

    // --- Equipment Beans (Setter Injection) ---
    @Bean
    public Equipment equipment1() {
        Equipment eq = new Equipment();
        eq.setEquipmentName("ECG Machine");
        eq.setCost(250000);
        return eq;
    }

    @Bean
    public Equipment equipment2() {
        Equipment eq = new Equipment();
        eq.setEquipmentName("MRI Scanner");
        eq.setCost(1800000);
        return eq;
    }

    @Bean
    public Equipment equipment3() {
        Equipment eq = new Equipment();
        eq.setEquipmentName("Ventilator");
        eq.setCost(500000);
        return eq;
    }

    // --- Hospital Bean ---
    @Bean
    public Hospital hospital() {
        List<Doctor> doctorList = Arrays.asList(doctor1(), doctor2(), doctor3());
        List<Equipment> equipmentList = Arrays.asList(equipment1(), equipment2(), equipment3());
        return new Hospital("City Care Hospital", doctorList, equipmentList);
    }
}
