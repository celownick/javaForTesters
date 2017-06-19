package com.javafortesters.Overloading;

/**
 * Created by kcabaj on 23-Sep-16.
 */
public class Pracownik {
    String imie;
    String nazwisko;
    int wiek;


}
class Firma{
   public static void main (String[] args) {
       Pracownik pracownik1 = new Pracownik();
       Pracownik pracownik2 = new Pracownik();
       Pracownik pracownik3 = new Pracownik();

       pracownik1.imie = "Janek";
       pracownik1.nazwisko = "kowalski";
       pracownik1.wiek = 23;

       pracownik2.imie = "Bogdan";
       pracownik2.nazwisko = "Jasiak";
       pracownik2.wiek = 25;

       System.out.println("imie pracownika 1 to: " +pracownik1.imie);
       System.out.println("nazwisko pracownika 1 to: " + pracownik1.nazwisko);
       System.out.println("wiek pracownika 1 to: " + pracownik1.wiek);

   }

}