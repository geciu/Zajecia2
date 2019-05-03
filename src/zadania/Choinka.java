package zadania;

import java.util.Scanner;

public class Choinka {

    Choinka() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj wysokosc choinki ( n > 0 i należy do l. całkowitych) : ");
        int wysokosc = scan.nextInt();

        char ch = '*';

        for (int i = 0; i < wysokosc; i++) {
            for (int j = 0; j < wysokosc - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i * 2; j++) {
                System.out.print(ch);
            }

            System.out.println();
        }

        for (int i = 0; i <= wysokosc + 1; i++) {
            if (i >= wysokosc - 1) {
                System.out.print(ch);
            } else {
                System.out.print(" ");
            }
        }

    }
}