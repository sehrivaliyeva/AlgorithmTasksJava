package main;

import java.util.Scanner;

public class SecilmisReqem {
    public static void main(String[] args) {

// Teyiin edilmis ededin tapilmasi


        Scanner scan2=new Scanner(System.in);
        System.out.print("Bir eded daxil edin : ");
        int secilmisEded=46;

     for(int i=0;i<=100;) {
    int userEdedi=scan2.nextInt();
    if (userEdedi == secilmisEded) {
        System.out.println("Teyin edilmis edei tapdiniz !! ");
     break;

    } else if (userEdedi > secilmisEded) {
        System.out.println("Daxil etdiyiniz eded teyin edilmis ededden boyukdur !! ");

    } else if (userEdedi < secilmisEded) {
        System.out.println("Daxil etdiyiniz eded teyin edilmis ededden kicikdir !! ");
    } else {

    }

}

    }
}
