package zadania;

import java.util.Scanner;

public class Ciag {

    int A, B, pozycja;
    Ciag(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj 2 liczby calkowite A i B, gdzie A < B");
        System.out.println("A: ");
        int A = scan.nextInt();
        System.out.println("B: ");
        int B = scan.nextInt();


        pozycja = A;

        while (pozycja <= B){
            A += A;
            pozycja++;

        }
        System.out.println(A);
    }
}
