package com.cs.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cs.hospital_management.beans.Hospital;
import com.cs.hospital_management.cfgs.AppConfig;

public class MainApp {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);){
			
			Hospital hospital = ctx.getBean(Hospital.class);
			hospital.showHospitalDetails();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
