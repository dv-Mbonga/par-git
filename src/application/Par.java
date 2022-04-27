package application;

import java.util.Scanner;

public class Par {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Insira um numero: ");
		
		num = sc.nextInt();
		
		if(num %2 == 0) {
			System.out.println(num + " é par");
		}
		else {
			System.out.println(num + " é impar");
		}
			
		sc.close();
	}

}
