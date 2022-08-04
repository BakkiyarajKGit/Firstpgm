package com.interviewques;

public class SwapTwoNmbers {

	public static void main(String[] args) {
		
		long mysalary=70000;
		long friendsalary=250000;
		
		System.out.println("Before swap: Mysalary "+mysalary+" Friend Salary "+friendsalary);
		/*int temp=mysalary;
		mysalary=friendsalary;
		friendsalary=temp;*/
		
		mysalary=mysalary-friendsalary;
		System.out.println(mysalary);
		friendsalary=mysalary+friendsalary;
		System.out.println(friendsalary);
		mysalary=friendsalary-mysalary;
		
		/*mysalary=mysalary*friendsalary;
		friendsalary=mysalary/friendsalary;
		mysalary=mysalary/friendsalary;*/
		
		System.out.println("After swap: Mysalary "+mysalary+" Friend Salary "+friendsalary);

	}

}
	