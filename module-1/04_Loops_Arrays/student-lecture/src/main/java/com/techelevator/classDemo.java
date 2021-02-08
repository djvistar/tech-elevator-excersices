package com.techelevator;

public class classDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numberOfStudents = 100;
		
		//know how to declare an array
		//know how to instantiate an array
		
		
		String[] names =new String[10];
		int[] scores = new int[] {2, 5,6,7,8,10,12,15};
		long[] averages = new long[20];
		byte[] bytes = new byte[25];
		String[] courses = new String[100];
		String[] studentNames = new String[numberOfStudents];
		
		
		//know how to put things in an array
		
		names[0] = "Vic";
		names[1] = "Traci";
		names[2] = "Kanye";
		names[3] = "Kay";
		names[4] = "True";
		names[7] = "Dan";
		names[8] = "Zai";
		
		//know how to access things inside an array
		
		String Kanye =names[2];
		
		String Dan = names[7];
		
		String firstElement = names[0];
		

				
		//know how to get the length of an array
		System.out.println(names[2]);
		System.out.println(names.length);

	String lastElement = names[9]; //if I know size = 10 
		
		String lastElement2 = studentNames[numberOfStudents - 1]; //option 1
		
		String lastElement3 = studentNames[studentNames.length - 1]; //option 2 
		
		
		names[7] = "Jon";
		names[names.length - 1] = names[7];
	
	//nfl teams
		
		String[] nflTeams = new String[50];
		
		nflTeams[7] = "Bengals";
		nflTeams[22] = "Steelers";
		
		
		String Steelers = nflTeams[22];
		
		System.out.println(Steelers);
	
	//increment operators
		
		int i = 5;
		
		System.out.println(i);
		
		System.out.println(++i);
		
		System.out.println(i++);
		
		if (i <5) {
			int x =1;
			if (x == 1) {
				int y =6;
			}
		}
		System.out.println(i);
		
		int counter = 0;
		
		while (counter < 100) {
			
			System.out.println("The number is" + counter);
			
//			if (counter == 50) {
//				break;
//			}
			counter ++;
		}
		
		// for looping 100 times forward from beginning 
		
		for (int j = 0; j<100; j++) {
			System.out.println(j);
			
		}
	
		for (int j= 0; j< names.length; j++	) {
			
			if (names[j] != null) {
			System.out.println(names[j]);
		}
		}
		
		
		//{2, 5,6,7,8,10,12,15}
		for (int j = 0; j<scores.length; j++) {
			//test to see if scores is divisble by 5
			
			if (scores[j] % 5 == 0) {
				System.out.println(scores[j]);
			}
			else {
				System.out.println("not divisble by 5");
			}
		}
		
		//{2, 5,6,7,8,10,12,15}
		for(int j = scores.length -1; j >= 0; j--) {
			System.out.println(scores[j]);
		}
	}

}
