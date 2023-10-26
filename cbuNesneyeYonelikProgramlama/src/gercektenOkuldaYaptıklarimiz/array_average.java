/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gercektenOkuldaYaptıklarimiz;

public class array_average {

    public static void main(String[] args) {
       int [] dizi= new int[]{4,8,3,1,18,9,21,20,5,11};
       int i,toplam,ortalama;
       toplam=0;
       int size =dizi.length;
       for(i=0; i<size; i++){
           toplam+=dizi[i];  
       }
       ortalama=toplam/size;
       System.out.println("Toplam: "+ toplam + " Ortalama: "+ ortalama);
       
    }
    
}
