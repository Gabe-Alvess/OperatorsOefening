package be.intectbrussel;

public class MainApp {
    public static void main(String[] args) {

        System.out.println("---- Oefening 1: Oppervlakte Berekening ----");
        double l = 12.5;
        double b = 7.8;

        double res = l * b;
        System.out.println("Oppervlakte: " + res + " cm²");

        System.out.println("---- oefening 2: Logical Operators ----");
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
        System.out.println("NOT vergeleking bool01 : " + result);

        result = !bool02;
        System.out.println("NOT vergeleking bool02 : " + result);

        System.out.println("--- Oefening 3: Relational Operators ----");

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

        System.out.println("---- Mogelikheden met (>) ----");

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

        short shortNum = 101;
        float floatNum = 10.99F;
        boolean booVar = true; // geen mogelijke manier gevonden om deze te gebruiken

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
