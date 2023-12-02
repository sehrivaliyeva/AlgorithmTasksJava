package main;

import java.util.Scanner;

public class SadeMurekkebEded {
    public static void main(String[] args) {
        //sade ve murekkeb ededleri tapin

        Scanner scan=new Scanner(System.in);
        int insertNumber=scan.nextInt();
        int count=0;

        for(int i=1;i<=insertNumber;i++){
            if(insertNumber%i==0){
             count++;

               }

            }

        if(count!=2){
            System.out.println("Eded murekkebdir : "+insertNumber);
        }else {
            System.out.println("Eded sadedir : "+insertNumber);
        }

        }

    }

