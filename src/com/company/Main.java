package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println();
        System.out.println("\u001B[32m" + "'endsWith' method:" + "\u001B[0m");
        System.out.println("\u001B[32m" + "------------------" + "\u001B[0m");
        String txt1 = "My text is this";
        System.out.println("<" + txt1 + ">" + " ends with 'is' : " + txt1.endsWith("is"));

        System.out.println();
        System.out.println("\u001B[32m" + "'toCharArray' method:" + "\u001B[0m");
        System.out.println("\u001B[32m" + "---------------------" + "\u001B[0m");
        char[] cha = txt1.toCharArray();
        System.out.println("Char array elements: ");
        for (int i = 0; i < txt1.length(); i++){
            System.out.println(cha[i]);
        }

        System.out.println();
        System.out.println("\u001B[32m" +"'trim' method" + "\u001B[0m");
        System.out.println("\u001B[32m" + "-------------" + "\u001B[0m");
        String txt2 = "   I am learning  Java   ";
        System.out.println("Before trim - " + txt2);
        System.out.println("Length - " + txt2.length());
        txt2 = txt2.trim();
        System.out.println("After trim - " + txt2);
        System.out.println("Length - " + txt2.length());
    }
}
