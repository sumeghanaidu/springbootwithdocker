package Converter;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter digits");
		try {
			// for reading the number
			int number = scanner.nextInt();
			if (number == 0) {
				System.out.print("the output is : zero");
			} else {
				System.out.print("output is : " + new NumberWord(). numberToWord(number));
			}
		} catch (Exception e) {
			System.err.println(" invalid number");
		}
		// close the reader
		scanner.close();
	}


	}


