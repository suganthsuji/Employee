package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Employee {

    public static void main(String[] args) {

		Employee e=new Employee();
		System.out.println("Enter 0 or 1");
		Scanner scanner=new Scanner(System.in);
		Integer req=scanner.nextInt();
//		if(req==0){
//			e.partTime();
//		}
//		else {
//			e.fullTime();
//		}
//
		switch (req)
		{
			case 0:e.partTime();
			break;
			case 1:e.fullTime();
			break;
		}
	}
		public void fullTime() {


		List<String> employeeStatus = new ArrayList<>();
		employeeStatus.add("PRESENT");
		employeeStatus.add("ABSENT");
		Random random=new Random();
		String attendance = employeeStatus.get(random.nextInt(employeeStatus.size()));

		int wagePerHours=20;
		int noOfHour=8;
		int daysOfMonth=20;
       if (attendance=="ABSENT")
		{
			System.out.println("Employee is ABSENT");
		}
		else{
			System.out.println("Employee is PRESENT");
			System.out.println("Total wages for Employee is "+ noOfHour*wagePerHours);
		   System.out.println("Total wages for Employee per month is "+ noOfHour*wagePerHours*daysOfMonth);
		}
		}
	public void partTime(){
		int wage=20;
		List<String> employeeStatus = new ArrayList<>();
		employeeStatus.add("PRESENT");
		employeeStatus.add("ABSENT");
		Random random=new Random();
		String attendance = employeeStatus.get(random.nextInt(employeeStatus.size()));
		if (attendance=="ABSENT")
		{
			System.out.println("Employee is ABSENT");
		}
		else{
			System.out.println("Employee is PRESENT");
			System.out.println("Working Hours: ");
			Scanner scanner=new Scanner(System.in);
			int hours=scanner.nextInt();
			System.out.println("Working Hours: "+ hours*wage );
		}

	}


}
