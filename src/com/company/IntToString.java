package com.company;

import java.util.*;
import java.security.*;

public class IntToString {
    public static void main(String[] args) {

            DoNotTerminate.forbidExit();

            try {//catches any exceptions//
                Scanner in = new Scanner(System.in);
                int n = in .nextInt();
                in.close();
                //String s=???; Complete this line below
                String s = String.valueOf(n);
                //create the variable String s and set it to the value of n//
                //conditional for n//
                if (n == Integer.parseInt(s)) {
                    System.out.println("Good job");
                } else {
                    System.out.println("Wrong answer.");
                }
            } catch (DoNotTerminate.ExitTrappedException e) {
                System.out.println("Unsuccessful Termination!!");
            }//end of try catch//
        }
    }

    //The following class will prevent you from terminating the code using exit(0)!
    class DoNotTerminate {

        public static class ExitTrappedException extends SecurityException {

            private static final long serialVersionUID = 1;
        }

        public static void forbidExit() {
            final SecurityManager securityManager = new SecurityManager() {
                @Override
                public void checkPermission(Permission permission) {
                    if (permission.getName().contains("exitVM")) {
                        throw new ExitTrappedException();
                    }
                }
            };
            System.setSecurityManager(securityManager);
        }
    }


