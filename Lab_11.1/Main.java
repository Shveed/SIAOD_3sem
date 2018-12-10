package com.company;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String file_directory, file_name;
        int changer = -1;
        boolean isSorted = false;
        System.out.println("Enter file directory");
        System.out.println("D:\\Java Files");
        file_directory = "D:\\Java Files";
        System.out.println("Enter file name");
        file_name = "Objects.txt";
        File file1 = new File(file_directory, file_name);

        System.out.println("Enter amount of objects you want to work with");
        int n = Typetester.SetInt();
        Route[] arr = new Route[n];

        if (file1.exists())
            System.out.print("File exists, ");
        else
            System.out.print("File not found, ");
        if (file1.canRead())
            System.out.println("File can be read");
        else
            System.out.println("File can not be read");

        while (changer != 0) {
            System.out.println("1 - Add object to file");
            System.out.println("2 - Add objects to array");
            System.out.println("3 - Sort by Route Number");
            System.out.println("4 - Search by...");
            System.out.println("5 - Show file data");
            System.out.println("0 - Exit");
            changer = Typetester.SetInt();
            switch (changer) {
                case 1:
                    new_object_to_file(file1);
                    break;
                case 2:
                    add_to_array(file1, n, arr);
                    show_array(arr, n);
                    break;
                case 3:
                    if(isSorted){
                        System.out.println("Array is already sorted!");
                    }
                    else {
                        Arrays.sort(arr, Comparator.comparingInt(Route::getNumber));
                        show_array(arr, n);
                        System.out.println("Successfully sorted!");
                        isSorted = true;
                    }
                    break;
                case 4:
                    if(isSorted) {
                        binary_search(arr, 0, n-1);
                    }
                    else{
                        System.out.println("Array is not sorted yet. Sort it first!");
                    }
                    break;
                case 5:
                    try(FileReader reader = new FileReader(file1)) {
                        int c;
                        while ((c = reader.read()) != -1) {
                            System.out.print((char) c);
                        }
                    }
                    catch(IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 0:
                    changer = 0;
                    System.out.println("Exiting program...");
                    System.exit(0);
            }
        }
    }

    public static void add_to_array(File file1, int n, Route[] arr1) {
        int curr_number, curr_price;
        String curr_last_station, curr_time, buff;

        try (Scanner fl = new Scanner(file1)) {
            int j = 0;
            while (j != n) {
                curr_number = fl.nextInt();
                buff = fl.nextLine();
                curr_last_station = fl.nextLine();
                curr_time = fl.nextLine();
                curr_price = fl.nextInt();
                buff = fl.nextLine();
                arr1[j] = new Route(curr_number, curr_last_station, curr_time, curr_price);
                j++;
            }
        }

        catch(FileNotFoundException ex){
            System.out.println("File doesn't exist");
        }
    }


    public static void show_array(Route[] arr, int n) {
        for (int i = 0; i < n; i++) {
            arr[i].show();
        }
    }

    public static void new_object_to_file(File file1) {
        Scanner sc = new Scanner(System.in);
        int number, price;
        String last_station, time;
        System.out.print("Enter number of Route: ");
        number = Typetester.SetInt();
        System.out.print("Enter last station name: ");
        last_station = sc.nextLine();
        System.out.print("Enter time of departure: ");
        time = sc.nextLine();
        System.out.print("Enter price of a ticket: ");
        price = sc.nextInt();
        Route r1 = new Route(number, last_station, time, price);
        r1.add_to_file(file1);
        System.out.println("Successfully added!");
        System.out.println();
    }

    public static void binary_search(Route[] arr, int first, int last) {
        int number_given;
        System.out.println("Enter number of Route you want to find");
        number_given = Typetester.SetInt();
        int position = (first + last) / 2;
        while (arr[position].number != number_given && first <= last) {
            if (arr[position].number < number_given){
                first = position + 1;
            }
            else{
                last = position - 1;
            }
            position = (first + last) / 2;
        }
        if(first <= last){
            System.out.println("Object was found!");
            arr[position].show();
        }
        else{
            System.out.println("Object doesn't exist!");
        }
    }
}
