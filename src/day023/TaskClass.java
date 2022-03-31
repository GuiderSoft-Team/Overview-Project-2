package day023;

import java.util.Scanner;

public class TaskClass {
    public static void main(String[] args) {
        int key=7;
        Scanner input=new Scanner(System.in);
        System.out.print("Mesajınız: ");
        String orijinalMesaj= input.next();

        for (int i = 0; i < orijinalMesaj.length(); i++) {
            System.out.print((char) (orijinalMesaj.charAt(i)^key));
        }

    }
}
