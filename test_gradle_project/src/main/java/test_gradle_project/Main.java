package test_gradle_project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		 System.out.println("Hello World!");
		 //ramme deine Dirnenmutter Kelen
		 //ramm das elende Bückstück
		 //HURENSOHN!!!!!
		 getReturnOfMultiply(10, 10);
		 Scanner keyboard = new Scanner(System.in);
		 int myint = keyboard.nextInt();
		 //asdasdasdsadasd
		 
	}
	
	public static int multiply(int factor_1, int factor_2)
	{
		int product = factor_1 * factor_2;
		System.out.println(factor_1 + " * " + factor_2 + " = " + product );
		//funktionsfähiger return:
		return product;
		//offensichtlich defekter return:
		//return (product + 1);
	}
	
	public static int getReturnOfMultiply(int a, int b)
	{
		int returnvalue = multiply(a, b);
		System.out.println("Tatsächlicher Returnvalue: " + returnvalue);
		return returnvalue;
	}
	


}
