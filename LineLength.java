package com.line;

import java.util.Scanner;

public class LineLength {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter x1 coordinate for line : ");
		int x1 = scanner.nextInt();
		
		System.out.print("Enter y1 coordinate for line : ");
		int y1 = scanner.nextInt();
		
		System.out.print("Enter x2 coordinate for line : ");
		int x2 = scanner.nextInt();
		
		System.out.print("Enter y2 coordinate for line : ");
		int y2 = scanner.nextInt();
		
		int xdifference = x2-x1;
		int ydifference = y2-y1;
		
		int z1 = xdifference*xdifference +ydifference*ydifference;
		double length = Math.sqrt(z1);	
		
		System.out.println("Length of line : "+length);
	}	

}
