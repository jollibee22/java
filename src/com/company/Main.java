package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	int num1, num2;
    	Scanner sc = new Scanner(System.in);
    	num1 = sc.nextInt();
    	num2 = sc.nextInt();
    	System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);

	}
}
