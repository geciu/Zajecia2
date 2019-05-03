package zadania;

import java.util.Random;
import java.util.Scanner;

public class Gra {

    Gra() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Gra 'Za dużo, za mało'. Komputer losuje liczbę z zakresu <1,100>");
        System.out.println("Gracz ma za zadanie odgadnąć, co to za liczba poprzez podawanie kolejnych wartości.");

        Random losowanie = new Random();
        int wylosowana = losowanie.nextInt(101) + 1;

        //Sprawdzenie poprawnosci dzialania programu (odkomentowac ponizsza linijke)
        //System.out.println("Wylosowana liczba: " + wylosowana);

        int liczba = scan.nextInt();

        while (liczba != wylosowana) {
            if ( liczba > wylosowana)System.out.println("Za duza liczba");
            else System.out.println("Za mala liczba");
            liczba = scan.nextInt();
        }

        while (liczba == wylosowana){
            System.out.println("Gratulacje");
            break;
        }
    }
}
