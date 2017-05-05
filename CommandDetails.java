package com.f;

import java.util.Scanner;

public class CommandDetails {

	public static void main(String[] args) {
		int m;
	    
		Scanner in=new Scanner(System.in);
		System.out.println("Create a new topology");
		System.out.println("Build a connection table");
		System.out.println("Shortest Path to destination");
		System.out.println("Modify a topology");
		System.out.println("Best Router for Broadcast");
		System.out.println("Enter the input");
		m= Integer.parseInt(in.nextLine());
		
    switch(m)
	{
	case 1:
		{
			System.out.println("Create a new topology");
		break;
		}
		
	case 2:
		System.out.println("Build a connection table");
		break;
	case 3:
		System.out.println("Shortest path to destination");
		break;
		
	case 4:
		System.out.println("Modify a topology");
		break;
	case 5:
		System.out.println("Best Router for Broadcast");
		break;
		
	default:
		System.out.println("Give correct command");
			
	}

	}

	
};