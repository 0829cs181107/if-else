package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the maths marks :");
        int a = sc.nextInt();

        System.out.println("Enter the english marks :");
        int b = sc.nextInt();

        System.out.println("Enter the hindi marks :");
        int c = sc.nextInt();

        System.out.println("Enter the physics marks :");
        int d = sc.nextInt();

        System.out.println("Enter the chemistry marks :");
        int e = sc.nextInt();

        int total = a+b+c+d+e;
        float average = total/5.0f;
        float percentage=(total/500.0f)*100f;

        System.out.println("average ="+average);
        System.out.println("percentage ="+percentage);

    }
}
