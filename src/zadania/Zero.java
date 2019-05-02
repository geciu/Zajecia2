package zadania;

import java.util.Scanner;

public class Zero {

    Zero(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj liczbę. Podanie liczby '0' spowoduje zaończenie pracy programu");
        double liczba = scan.nextDouble();
        double liczba2 = 0;

        for(int i = 0; liczba != 0 ; i++)
        {

            liczba2 = scan.nextDouble();
            if (liczba2 != 0){
                liczba = liczba + liczba2;
                System.out.println(liczba);
            }
            else {
                System.out.println(liczba);
                break;
            }
        }

    }

}
