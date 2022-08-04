package com.interviewques;

import java.util.Scanner;

public class NumberReverse {

	public static void main(String[] args) {
		
		//int given=0;
		long rev=0;
		System.out.println("Enter the Number: ");
		Scanner sc=new Scanner(System.in);
		//given=sc.nextInt();
		//int given = sc.nextInt();
		long given = sc.nextLong();
		 
		while(given!=0)
		{
		rev=rev*10;
		rev=rev+given%10;
		given=given/10;
		}
		System.out.println(rev);

	}

}
