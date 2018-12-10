package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    //String len;
	    int x, len, closestA = 0, closestB = 0, current;
		Typetester t = new Typetester();

		System.out.println("Enter array length");
		len = t.SetInt();

		int[] mas = new int[len];


		System.out.println("Enter array elements");
		for (int i = 0; i < len; i++) {
			System.out.println("Enter element №" + (i + 1));
			mas[i] = t.SetInt();

		}

		System.out.println("Enter number x");
		x = t.SetInt();
	    current = x;

	    for(int i=0;i < len-1;i++){
	        for(int j=i+1; j < len;j++){
	            if(Math.abs(x - Math.abs(mas[i] - mas[j])) < current){
	                current = Math.abs(x - Math.abs(mas[i] - mas[j]));
	                closestA = mas[i];
	                closestB = mas[j];
                }
            }
        }
        System.out.println("The closest difference to number " + x + " is between elements " + closestA + " and " + closestB);
    }
}
