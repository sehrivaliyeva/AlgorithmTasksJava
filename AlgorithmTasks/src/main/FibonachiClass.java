package main;

import java.util.Scanner;

public class FibonachiClass {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir eded daxil edin : ");
        int eded=scan.nextInt();

        int eded1=0;
        int eded2=1;
        int cem;
        System.out.println("Fibonaci ededlerini consola cap et : ");

        for(int i=0; i<=eded;i++){
            System.out.println(eded1);
            cem=eded1+eded2;
            eded1=eded2;
            eded2=cem;




        }

    }
}
