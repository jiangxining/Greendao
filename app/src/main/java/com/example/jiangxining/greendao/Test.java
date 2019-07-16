package com.example.jiangxining.greendao;

public class Test {
        public static void main(String[] args){
            int i = 128;
            Integer i2 = 128;
            Integer i3 = new Integer(128);
            System.out.println(i == i2);
            System.out.println(i == i3);
            System.out.println("**************");
            Integer i5 = 127;//
            Integer i6 = 127;
            System.out.println(i5 == i6);//
        /*Integer i5 = 128;
         Integer i6 = 128;
         System.out.println(i5 == i6);//
        */
            Integer ii5 = new Integer(127);
            System.out.println(i5 == ii5); //
            Integer i7 = new Integer(128);
            Integer i8 = new Integer(123);
            System.out.println(i7 == i8);  //
            }
}
