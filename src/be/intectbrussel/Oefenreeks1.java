package be.intectbrussel;

public class Oefenreeks1 {
    public static void main(String[] args) {
        System.out.println("Operators - Oefenreeks - 1");
        System.out.println("---- Oefening - 1 ----");
        // 1. Declareer twee integer variabelen, "a" en "b", en geef ze de waarden 5 en 10.
        int a = 5;
        int b = 10;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("---- Oefening - 2 ----");
        // 2. Gebruik de plus operator (+) om de som van "a" en "b" te berekenen en print het resultaat.
        int res = a + b;
        System.out.println("Som resultaat = " + res);

        System.out.println("---- Oefening - 3 ----");
        // 3. Gebruik de min operator (-) om het verschil tussen "a" en "b" te berekenen en print het resultaat.
        res = a - b;
        System.out.println("Aftrekking resultaat = " + res);

        System.out.println("---- Oefening - 4 ----");
        // 4. Gebruik de maal operator (*) om het product van "a" en "b" te berekenen en print het resultaat.
        res = a * b;
        System.out.println("Vermenigvuldiging resultaat = " + res);

        System.out.println("---- Oefening - 5 ----");
        // 5. Gebruik de gedeeld door operator (/) om het quotient van "a" en "b" te berekenen en print het resultaat.
        res = a / b;
        System.out.println("Deling resultaat = " + res);

        System.out.println("---- Oefening - 6 ----");
        // 6. Gebruik de modulo operator (%) om de rest van "a" gedeeld door "b" te berekenen en print het resultaat.
        res = a % b;
        System.out.println("Rest resultaat = " + res);

        System.out.println("---- Oefening - 7 ----");
        // 7. Gebruik de increment operator (++) om de waarde van "a" te verhogen met 1 en print het resultaat.
        int inc = ++a;
        System.out.println("Verhoogde resultaat = " + inc);

        System.out.println("---- Oefening - 8 ----");
        // 8. Gebruik de decrement operator (--) om de waarde van "a" te verlagen met 1 en print het resultaat.
        int dec = --a;
        System.out.println("Verlaagde resultaat = " + dec);

        System.out.println("---- Oefening - 9 ----");
        // 9. Gebruik de gelijk aan vergelijkingsoperator (==) om te controleren of "a" gelijk is aan "b" en print het resultaat.
        Boolean boolRes = a == b;
        System.out.println("Vergelijkingsresultaat = " + boolRes);

        System.out.println("---- Oefening - 10 ----");
        // 10. Gebruik de niet gelijk aan vergelijkingsoperator (!=) om te controleren of "a" ongelijk is aan "b" en print het resultaat.
        boolRes = a != b;
        System.out.println("Vergelijkingsresultaat = " + boolRes);
    }

}
