package com.greatlearning.service;

import com.greatlearning.department.*;

public class Main 
{

	public static void main(String[] args) 
	{
		AdminDepartment adm = new AdminDepartment();
		System.out.println(" Welcome to"+adm.departmentName());
		System.out.println(adm.getTodaysWork());
		System.out.println(adm.getWorkDeadline());
		System.out.println(adm.isTodayAHoliday());
		System.out.println();
		
		HRDepartment hr = new HRDepartment();
		System.out.println(" Welcome to"+hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		System.out.println();	
		
		TechDepartment tech  = new TechDepartment();
		System.out.println(" Welcome to"+tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println("  " + tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());
		System.out.println();	
		
		

	}

}
