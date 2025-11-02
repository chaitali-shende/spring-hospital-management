package com.cs.hospital_management.beans;

public class Equipment {
    private String equipmentName;
    private double cost;

    public Equipment() {
        
    }

    // Setter methods for setter injection
    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void showEquipment() {
        System.out.println("Equipment: " + equipmentName + " (Cost: Rs." + cost + ")");
    }

    @Override
    public String toString() {
        return "Equipment{name='" + equipmentName + "', cost=" + cost + "}";
    }
}
