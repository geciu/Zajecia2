package zadania;

import java.util.Scanner;

public class Rysowanie {

    int c, d;
    Rysowanie(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj wspołrzędne X i Y \nWspółrzędna X: ");
        int wspX = scan.nextInt();
        System.out.println("Wspołrzędna Y:");
        int wspY = scan.nextInt();

        System.out.println("Podaj wymiary prostokata \nA: ");
        int A = scan.nextInt();
        System.out.println("B:");
        int B = scan.nextInt();

        System.out.print(String.format("%c[%d;%df",0x1B,wspX,wspY));
        System.out.println("Podaj znak: ");
        char zn = scan.next().charAt(0);


        while(c < wspY){
            System.out.println();
        }

        while(d < wspX){
            System.out.print(zn);
        }
       /* for (int i = 0; i < wspY; i++) {

            for (int j = 0; j < wspX; j++){
                System.out.print("*");
            }
            System.out.println();

        }

        System.out.print(String.format("%c[%d;%df",0x1B,wspX,wspY));
        for (int i = 0; i < wspX; i++){

            for (int k = 0; k < A; k++) {

                for (int h = 0; h < B; h++) {
                    System.out.print(zn);
                    }
            System.out.println();
            }
        }*/
    }
}

