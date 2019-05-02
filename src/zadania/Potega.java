package zadania;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Potega {

    Potega(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj liczbę całkowitą dodatnią: ");
        int liczba = scan.nextInt();

        while(liczba >= 0) {
            for (int i = 0; pow(2, i) < liczba; i++) {
                System.out.println(pow(2, i));
            }
        }

        while(liczba < 0){
                System.out.println("Warunki nie zostały spełnione. Wprowadz poprawna liczbę: ");
                liczba = scan.nextInt();
                if(liczba >= 0){
                    for (int i = 0; pow(2, i) < liczba; i++) {
                        System.out.println(pow(2, i));
                    }
                }
                else {
                    System.out.println("Warunki nie zostały spełnione. Wprowadz poprawna liczbę: ");
                    liczba = scan.nextInt();
                }
        }

    }
}
