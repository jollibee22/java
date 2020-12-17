package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
    	//int num2 = sc.nextInt();
    	if ((num1>=90)&&(num1<=100))
    		System.out.println("A");
    	else if ((num1>=80)&&(num1<=89))
    		System.out.println("B");
    	else if ((num1>=70)&&(num1<=79))
    		System.out.println("C");
    	else if ((num1>=60)&&(num1<=69))
    		System.out.println("D");
    	else
    		System.out.println("F");
	}

}
