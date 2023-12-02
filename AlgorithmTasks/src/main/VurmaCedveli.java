package main;

import java.util.Scanner;

public class VurmaCedveli {
    public static void main(String[] args) {
        //userin daxil etdiyi reqemin vurma cedvelinin cap olunmasi

          Scanner scan =new Scanner(System.in);

       System.out.print("Ededi daxil edin : ");

        int a=scan.nextInt();

       System.out.println(a+" ededinin vurma cedveli : ");

        for (int b=0;b<=10;b++){

            int netice=a*b;

            System.out.println(a+"*"+b+"="+(a*b));

        }
    }
}
