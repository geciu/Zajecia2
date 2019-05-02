package zadania;

import java.util.Scanner;

public class ZadPiate {

    ZadPiate(){

        Scanner scan = new Scanner(System.in);
        double[] tablica = new double[1000];

        double dlugosc = tablica.length;
        double max = tablica[0];
        double min = tablica[0];
        double srednia;

        System.out.println("Podaj liczbę. Podanie liczby '0' spowoduje zaończenie pracy programu" +
                " oraz wyswietlenie wartości max, min oraz ich sredniej arytmetycznej");
        double liczba = scan.nextDouble();
        double liczba2;

        for(int i = 0; liczba != 0; i++){

            tablica[i] = liczba;
            liczba = scan.nextInt();
            tablica[i+1]=liczba;

            for(int j = 0; j < dlugosc; j++){
                if(tablica[i] > max)
                    max = tablica[i];
            }

            for(int j = 0; j < dlugosc; j++){
                if(tablica[i] < min)
                    min = tablica[i];
                if(min == 0){
                    min = tablica[i+1];
                }
            }

        }
        srednia = (max + min)/2;
        System.out.println("Wartosc maksymalna: " + max + ", wartosc minimalna: " + min + ", srednia max i min: " + srednia);
    }
}

