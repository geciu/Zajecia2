package zadania;

import java.util.Scanner;

public class Suma {

    Suma(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj liczbę całkowitą: ");
        int liczba = scan.nextInt();
        int liczba2 = liczba;
        int liczbaPierwotna = liczba;
        int suma = 0;

        int x = 0;
        int i = 0, j = 0;
        int sumaPR = 0, sumaNPR =0;
        double sredniaPR, sredniaNPR;
        double stosunek;

        while(liczba != 0){
            suma += liczba%10;
            liczba /= 10;
        }

        System.out.println("Suma cyfr liczby " + liczbaPierwotna + " wynosi " + suma);


        while(liczba2!=0)
        {
            x=liczba2%10;
            if(x%2==0)
            {
                sumaPR+=x;
                i++;
            }
            if(x%2==1)
            {
                sumaNPR+=x;
                j++;
            }
            liczba2=liczba2/10;
        }

        sredniaPR = sumaPR/i;
        sredniaNPR = sumaNPR/j;


        int p = 102;
        int d = 10;
        stosunek = sredniaPR/sredniaNPR;
        System.out.println("Stosunek średniej arytmetycznej parzystych do nieparzystych = " + stosunek);
        System.out.println(p/d);
    }
}
