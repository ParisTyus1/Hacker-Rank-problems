package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class JavaEndOfFile {
// for each line of input print out i + the input, then scan to the next line//
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            for(int i = 1; scan.hasNext()== true; i++){
                System.out.println(i + " " + scan.nextLine());
            }
        }

    }

