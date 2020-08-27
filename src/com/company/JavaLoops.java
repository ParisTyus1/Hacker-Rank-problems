package com.company;

import java.util.Scanner;

//  In this challenge, we're going to use loops to help us do some simple math.
//
//  Task
//  Given an integer, , print its first  multiples. Each multiple  (where ) should be
//  printed on a new line in the form: N x i = result.
//
//   Input Format
//
//   A single integer, N.
//
//   Constraints
//   2<=N<=20
//
//   Output Format
//   Print 10  lines of output; each line i  (where 1<=i<=10 ) contains the result
//   of N x i  Nxi in the form:
//   N x i = result.






public class JavaLoops {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
            int N = scanner.nextInt();
            Scanner in = new Scanner(System.in);
            for(int i = 1; i <= 10; i++){

                System.out.printf("%d x %d = %d%n", N, i, N*i);
                scanner.close();
        }
    }

}

