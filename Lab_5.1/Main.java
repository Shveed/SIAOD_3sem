package com.company;
        import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s, temp = "", newLine = "";
        System.out.println("Enter text");
        s = sc.nextLine() + " ";
        s = s.toLowerCase();

        for(int i=0; i < s.length(); i++){
            if (s.charAt(i) != ' ' && s.charAt(i) != ',' && s.charAt(i) != '!' && s.charAt(i) != '-' &&
                    s.charAt(i) != ':' && s.charAt(i) != '?' && s.charAt(i) != '(' && s.charAt(i) != ')' &&
                    s.charAt(i) != '"' && s.charAt(i) != ';' ){
                temp += s.charAt(i);
            }
            else{
                temp = " " + temp + " ";
                if(!newLine.contains(temp)){
                    newLine += temp;
                    temp = "";
                }
                else{
                    temp = "";
                }
            }
        }
        System.out.println(newLine);
    }
}
