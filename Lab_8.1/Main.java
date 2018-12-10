package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int t, n, m;
        System.out.println("Press 0 - To enter String elements");
        System.out.println("Press 1 - To enter Int elements");
        t = Typetester.SetInt();

        if(t == 1) {
            System.out.println("Enter lines number");
            n = Typetester.SetInt();
            System.out.println("Enter columns number");
            m = Typetester.SetInt();
            int ch = 0;
            int[][] arr = input(n, m, ch);
            arr = aSort(n, arr);
            output(n, m, arr);
        }
        else if(t == 0){
            System.out.println("Enter lines number");
            n = Typetester.SetInt();
            System.out.println("Enter columns number");
            m = Typetester.SetInt();
            String ch = "";
            String[][] arr = input(n, m, ch);
            arr = aSort(n, arr);
            output(n, m, arr);
        }
        else{
            System.out.println("Incorrect input!!!");
            System.exit(0);
        }
    }

    public static int[][] input(int n, int m, int ch) {
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            System.out.println("In line " + i + ":");
            for (int j = 0; j < m; j++) {
                System.out.println("Enter element №" + j);
                matrix[i][j] = Typetester.SetInt();
            }
        }
        return matrix;
    }

    public static int[][] aSort(int n, int[][] matrix) {
        for (int i = 0; i < n; i++) {
            Arrays.sort(matrix[i]);
        }
        return matrix;
    }

    public static void output(int n, int m, int[][] matrix){
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static String[][] input(int n, int m, String ch) {
        Scanner sc = new Scanner(System.in);
        String[][] matrix = new String[n][m];
        for (int i = 0; i < n; i++) {
            System.out.println("In line " + i + ":");
            for (int j = 0; j < m; j++) {
                System.out.println("Enter element №" + j);
                matrix[i][j] = sc.nextLine();
            }
        }
        return matrix;
    }

    public static String[][] aSort(int n, String[][] matrix) {
        for (int i = 0; i < n; i++) {
            Arrays.sort(matrix[i]);
        }
        return matrix;
    }

    public static void output(int n, int m, String[][] matrix){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
