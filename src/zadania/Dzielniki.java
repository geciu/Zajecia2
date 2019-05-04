package zadania;

import java.util.Scanner;

public class Dzielniki {

    Dzielniki(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj liczbe calkowita, aby poznac jej dzielniki");
        int liczba = scan.nextInt();

        for(int i = 1; i <= liczba; i++){
            if (liczba % i == 0){
                System.out.println(i + " jest dzielnikiem " + liczba);
            }
        }

    }
}
