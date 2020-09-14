package com.company;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Currency {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double payment = scanner.nextDouble();
            scanner.close();

        /* Create custom Locale for India and US.
          I used the "IANA Language Subtag Registry" to find India's country code */
            Locale usLocale = new Locale("en", "US");
            Locale indiaLocale = new Locale("en", "IN");

            /* Create NumberFormats using Locales */
            NumberFormat us     = NumberFormat.getCurrencyInstance(Locale.US);
            NumberFormat india  = NumberFormat.getCurrencyInstance(indiaLocale);
            NumberFormat china  = NumberFormat.getCurrencyInstance(Locale.CHINA);
            NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

            /* Print output */
            System.out.println("US: "     + us.format(payment));
            System.out.println("India: "  + india.format(payment));
            System.out.println("China: "  + china.format(payment));
            System.out.println("France: " + france.format(payment));
        }
    }


