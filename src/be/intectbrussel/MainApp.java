package be.intectbrussel;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Github");
        System.out.println("---- Oefening 1: Oppervlakte Berekening ----");
        // 1. Schrijf een programma om de oppervlakte van een rechthoek te berekenen.
        // De rechthoek is 12,5 cm lang en 7,8 cm breed.
        double l = 12.5;
        double b = 7.8;

        double res = l * b;
        System.out.println("Oppervlakte: " + res + " cm²");

        System.out.println("---- oefening 2: Logical Operators ----");
        // 2. Vergelijk deze 2 variabelen: bool01 = true en bool02 = false.
        // Gebruik hiervoor alle 3 de logical operators voor.
        boolean bool01 = true;
        boolean bool02 = false;

        boolean result = bool01 && bool02;
        System.out.println("AND vergelijking : " + result);

        result = bool01 || bool02;
        System.out.println("OR vergelijking : " + result);

        result = !(bool01 == bool02);
        System.out.println("NOT vergelijking : " + result);
        // of
        result = !bool01;
        System.out.println("NOT vergelijking bool01 : " + result);

        result = !bool02;
        System.out.println("NOT vergelijking bool02 : " + result);

        System.out.println("--- Oefening 3: Relational Operators ----");
        // Gebruik de Relational operators op de variabelen hieronder. Bekijk alle mogelijkheden om deze te gebruiken.
        byte bNum = 10;
        int iNum = 5;
        long lNum = 5;

        System.out.println("---- Mogelijkheden met (==) ----");

        result = (bNum == iNum);
        System.out.println("(bNum == iNum) : " + result);

        result = (bNum == lNum);
        System.out.println("(bNum == lNum) : " + result);

        result = (iNum == lNum);
        System.out.println("(iNum == lNum) : " + result);

        System.out.println("---- Mogelijkheden met (!=) ----");

        result = (bNum != iNum);
        System.out.println("(bNum != iNum) : " + result);

        result = (bNum != lNum);
        System.out.println("(bNum != lNum) : " + result);

        result = (iNum != lNum);
        System.out.println("(iNum != lNum) : " + result);

        System.out.println("---- Mogelijkheden met (<) ----");

        result = (bNum < iNum);
        System.out.println("(bNum < iNum) : " + result);

        result = (bNum < lNum);
        System.out.println("(bNum < lNum) : " + result);

        result = (iNum < lNum);
        System.out.println("(iNum < lNum) : " + result);

        System.out.println("---- Mogelijkheden met (>) ----");

        result = (bNum > iNum);
        System.out.println("(bNum > iNum) : " + result);

        result = (bNum > lNum);
        System.out.println("(bNum > lNum) : " + result);

        result = (iNum > lNum);
        System.out.println("(iNum > lNum) : " + result);

        System.out.println("---- Mogelijkheden met (<=) ----");

        result = (bNum <= iNum);
        System.out.println("(bNum <= iNum) : " + result);

        result = (bNum <= lNum);
        System.out.println("(bNum <= lNum) : " + result);

        result = (iNum <= lNum);
        System.out.println("(iNum <= lNum) : " + result);

        System.out.println("---- Mogelijkheden met (>=) ----");

        result = (bNum >= iNum);
        System.out.println("(bNum >= iNum) : " + result);

        result = (bNum >= lNum);
        System.out.println("(bNum >= lNum) : " + result);

        result = (iNum >= lNum);
        System.out.println("(iNum >= lNum) : " + result);

        System.out.println("--- Oefening 4: Assignment Operators ----");
        // 4. Maak gebruik van de Assignment Operators op de volgende variabelen. Ga na wat wel werkt en wat niet.
        // Probeer ze ook te wisselen bijvoorbeeld:
        // System.out.println(floatNum += shortNum);
        // System.out.println(shortNum += floatNum);

        short shortNum = 101;
        float floatNum = 10.99F;
        boolean booVar = true; // geen mogelijke manier gevonden om deze te gebruiken.

        System.out.println("---- (+=) ----");
        System.out.println(shortNum += floatNum);
        System.out.println(floatNum += shortNum);

        System.out.println("---- (-=) ----");
        System.out.println(shortNum -= floatNum);
        System.out.println(floatNum -= shortNum);

        System.out.println("---- (*=) ----");
        System.out.println(shortNum *= floatNum);
        System.out.println(floatNum *= shortNum);

        System.out.println("---- (/=) ----");
        System.out.println(shortNum /= floatNum);
        System.out.println(floatNum /= shortNum);

        System.out.println("---- (%=) ----");
        System.out.println(shortNum %= floatNum);
        System.out.println(floatNum %= shortNum);
    }

}
