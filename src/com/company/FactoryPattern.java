package com.company;
import java.util.*;
import java.security.*;
public class FactoryPattern {

    interface Food {
        public String getType();
    }
    class Pizza implements Food {
        public String getType() {
            return "Someone ordered a Fast Food!";
        }
    }

    class Cake implements Food {

        public String getType() {
            return "Someone ordered a Dessert!";
        }
    }
    class FoodFactory {
        public Food getFood(String order) {

            if (Pizza.class.getName().equalsIgnoreCase(order)){
                return new Pizza();
            }
            if (Cake.class.getName().equalsIgnoreCase(order)){
                return new Cake();
            }
            return null;

// \Write your code here

        }//End of getFood method

    }//End of factory class

    public static class Solution {

        public static void main(String args[]){
            Do_Not_Terminate.forbidExit();

            try{

                Scanner sc=new Scanner(System.in);
                //creating the factory
                FoodFactory foodFactory = new foodFactory();

                //factory instantiates an object
                Food food = foodFactory.getFood(sc.nextLine());


                System.out.println("The factory returned "+food.getClass());
                System.out.println(food.getType());
            }
            catch (Do_Not_Terminate.ExitTrappedException e) {
                System.out.println("Unsuccessful Termination!!");
            }
        }

    }
    static class Do_Not_Terminate {

        public static class ExitTrappedException extends SecurityException {

            private static final long serialVersionUID = 1L;
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
}
