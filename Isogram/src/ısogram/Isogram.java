 
package ısogram;

import java.util.Scanner;

 
public class Isogram {
 
    public static void main(String[] args) {
        boolean kontrol =false;
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen kelimenizi giriniz");
        String cumle = input.nextLine();
        cumle =cumle.toLowerCase();
        char[] dizi =new char[cumle.length()] ;
        for(int i=0;i<cumle.length();i++){
            dizi[i]=cumle.charAt(i);
      }
       for(int m =0;m<dizi.length;m++){
           for(int n=0;n<dizi.length;n++){
              if(m == n){
              continue;
              }
               if(dizi[m] == dizi[n]){
                 
                    kontrol =false;
                  break;
               }
               else {
               
             kontrol =true;
               }
           }
       }
       if(kontrol == true){
               System.err.println("ısogramdır");
           
           }else if(kontrol == false){
               System.err.println("ısogram değildir");
           }
       
    }
    
}
