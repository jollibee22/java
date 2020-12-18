package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int rm= m-45;

    	if (rm<0)
		{
			if(h!=0)
			{
				h--;
				rm = 60 + rm;
			}
			else
			{
				h=23;
				rm=60+rm;
			}
			System.out.println(h+" "+rm);

		}

    	else
    		System.out.println(h+" "+rm);

	}

}
