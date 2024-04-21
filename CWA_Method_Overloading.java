package com.company;

public class CWA_Method_Overloading {
    public int add(int a, int b){
        return a+b;
    }
    public  int add(int a, int b, int c){
        return a+b+c;
    }
    public String concatenate(String str1, String str2, String str3){
        return str1+str2+str3;
    }

    public static void main(String[] args) {
        CWA_Method_Overloading example = new CWA_Method_Overloading();
        System.out.println("Sum of 5 & 7= " + example.add('2','7'));
        System.out.println("Sum of 3,4,8= " + example.add('3','4','8'));
        System.out.println("Concatenate String: " +example.concatenate("hello ","Good ","Day!!"));
    }
}
