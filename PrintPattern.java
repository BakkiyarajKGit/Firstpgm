package com.interviewques;

import java.util.Scanner;

public class PrintPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the numner of lines: ");
		int startnum=1;
		int lines = sc.nextInt();
		int row,column;
		
		for (row = 0; row < lines; row++) {
			
			for ( column = 0; column <=row; column++) {
				System.out.print(startnum+" ");
				startnum=startnum+1;
				
			}
			System.out.println();
			
		}

	}

}
