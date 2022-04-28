package application;

import java.util.Scanner;

public class Par {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int num, fat = 1, sum = 0;
		
		System.out.println("Insira um numero: ");
		
		num = sc.nextInt();
		
		if(num %2 == 0) {
			System.out.println(num + " é par");
		}
		else {
			System.out.println(num + " é impar");
		}
			
		//Fatorial
		for(int i = 1; i <= num; i++) {
			fat *= i;
			sum += fat;
		}
		
		System.out.println("Fatorial = " + fat);
		System.out.println("Sum Fat = " + sum);
		sc.close();
	}

}
