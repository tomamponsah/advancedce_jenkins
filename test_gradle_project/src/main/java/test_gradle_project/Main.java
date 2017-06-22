package test_gradle_project;
//Kilians Mutter ist eine reizende Dame.



public class Main {

	public static void main(String[] args) {
		
		 int product = multiply(10, 10);
		 
	}
	
	public static int multiply(int factor_1, int factor_2)
	{
		int product = factor_1 * factor_2;
		System.out.println(factor_1 + " * " + factor_2 + " = " + product );
		//funktionsfähiger return:
		//return product;
		//offensichtlich defekter return:
		return (product + 1);
		//mal ein angemessener Kommentar
	}
	
	
	
	
	
	
	
	
	public static int getReturnOfMultiply(int a, int b)
	{
		int returnvalue = multiply(a, b);
		System.out.println("Tatsächlicher Returnvalue: " + returnvalue);
		return returnvalue;
	}
	


}
