package com.line;
import java.util.Scanner;

public class LineComparison {

	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
			
		System.out.print("Enter x1 coordinate for line1 : ");
		int x1 = scanner.nextInt();
		
		System.out.print("Enter y1 coordinate for line1 : ");
		int y1 = scanner.nextInt();
			
		System.out.print("Enter x2 coordinate for line1 : ");
		int x2 = scanner.nextInt();
			
		System.out.print("Enter y2 coordinate for line1 : ");
		int y2 = scanner.nextInt();
				
		System.out.print("Enter x3 coordinate for line2 : ");
		int x3 = scanner.nextInt();
			
		System.out.print("Enter y3 coordinate for line2 : ");
		int y3 = scanner.nextInt();
			
		System.out.print("Enter x4 coordinate for line2 : ");
		int x4 = scanner.nextInt();
			
		System.out.print("Enter y4 coordinate for line2 : ");
		int y4 = scanner.nextInt();
				
		int xdifference1 = x2-x1;
		int ydifference1 = y2-y1;
			
		int z1 = xdifference1*xdifference1 +ydifference1*ydifference1;
		Double length1 = (Math.sqrt(z1));	
			
		System.out.println("Length of line1 : "+length1);
			
		int xdifference2 = x4-x3;
		int ydifference2 = y4-y3;
			
		int z2 = xdifference2*xdifference2+ydifference2*ydifference2;
		Double length2 = (Math.sqrt(z2));
			
		String l1 = Double.toString(length1);
		String l2 = Double.toString(length2);
		
		System.out.println("Length of line2 : "+length2);
		int comparison = l1.compareTo(l2);	
		
		if(comparison < 0) {
			System.out.println("line 1 is smaller than second line");
		}else if(comparison > 0) {
			System.out.println("line 1 is larger than second line");
		}else
			System.out.println("Lines are of equal length.");
			
		}
}
