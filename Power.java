//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x^n.

import java.util.*;

class Power{

	public static void pow(int x, int n, int p){

		for(int i=1; i<=n; i++){

			p= p*x;

		}

	System.out.println(x+" ^ "+n+" = "+p);

	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of x: ");

		int x = sc.nextInt();

		System.out.println("Enter the value of n: ");

		int n = sc.nextInt();

		int p=1;

		pow(x,n,p);

		sc.close();

	}

}