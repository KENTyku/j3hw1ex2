/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j3hw1ex2;
import java.util.*;
/**
 *
 * @author Yuri Tveritin
 */
public class J3hw1ex2{
    
    public static void main(String[] args) {           
        String[] mas = {"Anna","Bob","Canon","Don"};
        for (int i=0;i<mas.length;i++){
            System.out.print(mas[i]);
        }
        System.out.println();
        J3hw1ex2.convert(mas);
        /*
        ArrayList<String> myList= new ArrayList <String>();
        myList.add(mas[0]);
        String s=myList.get(0);
        System.out.println(s);
        */
    }
    public static void convert( String[] ar){
        ArrayList<String> myList= new ArrayList <String>();
        for (int i=0;i<ar.length;i++){
            myList.add(ar[i]);
        }
        System.out.println(myList.get(1));
    }  
          
    
}
