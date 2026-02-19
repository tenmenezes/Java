package com.tenmenezes.javaintermediario.classesutilitarias;

import java.text.NumberFormat;
import java.util.Locale;

public class ClasseLocale {

    public static void main(String[] args) {

        //dd/MM/yyyy / 02/01/2000
        //MM/dd/yyyy / 01-fev/2000

        //1.000,02
        //1,000.02

        Locale locale = Locale.getDefault();

        System.out.println(locale);

        Locale[] locales = Locale.getAvailableLocales();
        for (Locale loc: locales){

            System.out.println(STR."Nome: \{loc.getDisplayName()}");
            System.out.println(STR."Código da língua: \{loc.getLanguage()}");
            System.out.println(STR."Língua: \{loc.getDisplayLanguage()}");
            System.out.println(STR."Cod País: \{loc.getCountry()}");
            System.out.println(STR."País: \{loc.getDisplayCountry()}");

            System.out.println("*******************");

        }

        Locale br = new Locale("pt", "Brazil");

        System.out.println(br);

        Locale.setDefault(br);

        System.out.println(Locale.getDefault());

        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println(nf.format(5000000000d));

        NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(nf1.format(5000000000d));

        NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.ITALY);
        System.out.println(nf2.format(5000000000d));

    }

}
