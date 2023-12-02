package main;

import java.util.Scanner;

public class TekCutEdedCemi {
    public static void main(String[] args) {

        //0-100 intervalinda tek ve cut ededlerin ceminin hesablanmasi
        Scanner scan=new Scanner(System.in);
        System.out.println("Intervali daxil edin : ");// 100 daxil edirik
        int insertNumber=scan.nextInt();

        int tekEdedcemi=0;
         int cutEdedcemi=0;

        for(int i=0;i<=insertNumber;i++){

            if(i%2==0){
                cutEdedcemi+=i;

            }else{

                tekEdedcemi+=i;

            }


        }

        System.out.println("Cut Ededlerin cemi : "+cutEdedcemi);
        System.out.println("Tek Ededlerin cemi :"+tekEdedcemi);


    }
}
