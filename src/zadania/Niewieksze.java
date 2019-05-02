package zadania;

import java.lang.*;
import java.util.Scanner;

public class Niewieksze {

    int liczba;

    Niewieksze() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj graniczną liczbę całkowitą: ");
        int liczba = scan.nextInt();

        for(int i = 0; i < liczba; i++){
            if((i%2)!=0){System.out.println(i);}
        }
    }
}
