package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class JavaStaticInitializerBlock {
//instaniate
//    set up variables to accept tokens
//    set up boolean flag as true
//    Set up Try catch with a loop for breadth times height
//    if flag B<= 0 or H<= 0 then flag is false
        static Scanner scan = new Scanner(System.in);
        static int B = scan.nextInt();
        static int H = scan.nextInt();
        static boolean flag = true;
        static{
            try{
                if(B <= 0 || H <= 0){
                    flag = false;
                    throw new Exception("Breadth and height must be positive");
                }//loop//
            }catch(Exception e){
                System.out.println(e);
            }//end of try catch//

        }
        public static void main(String[] args){
            if(flag){
                int area=B*H;
                System.out.print(area);
            }//conditional logic for problem//

        }//end of main

    }//end of class

