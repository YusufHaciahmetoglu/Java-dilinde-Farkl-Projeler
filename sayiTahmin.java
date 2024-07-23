/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author HALİME
 */
public class sayiTahmin {
    public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    int girisHakki=3;
    String sysBir="5";
    String sysIki="3";
        System.out.println("Sayi oyununa hoş geldiniz");
     
     while(true){
         System.out.println("birinci tahmin");
         String tahminBir=scanner.nextLine();
         System.out.println("ikinci tahmin");
         String tahminIki=scanner.nextLine();
         if (tahminBir.equals(sysBir)&&tahminIki.equals(sysIki)){
             System.out.println("Tebrikler Tahminleriniz doğru");
             break;
         } 
         else if(tahminBir.equals(sysBir)&& !tahminIki.equals(sysIki)){
             System.out.println("ikinci tahmin yanlış");
             girisHakki-=1;
         }
         else if(!tahminBir.equals(sysBir)&& tahminIki.equals(sysIki)){
             System.out.println("Birinci tahmin yanlış");
             girisHakki-=1;
         }
         else{
             System.out.println("Tahminleriniz Yanlış");
             girisHakki-=1;
         }
         if(girisHakki==0){
             System.out.println("Griş Hakkınız bitti");
       break;
     }
     }
    }
     
    
}
