package com.interviewques;

public class StringReve {

	public static void main(String[] args) {
		
		String str="Bakkiya";
		StringBuffer buffer=new StringBuffer();
		buffer.append(str);
		System.out.println(buffer.reverse());
		}
		
		/*String str="Bakkiya";
		String rev="";
		char[] charArray = str.toCharArray();
		for (int i =charArray.length-1 ; i >=0; i--) {
			rev=rev+charArray[i];
			
		}
		System.out.println(rev);
		if (str.toLowerCase().equals(rev.toLowerCase())) {
			System.out.println("polindrome");
			
		} else {
			System.out.println("not polindrome");

		}*/
	}


