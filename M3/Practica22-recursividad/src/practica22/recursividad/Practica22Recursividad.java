/*
 *AUTHOR: MAX PEDREGOSA
 *SCHOOL: MONLAU
 *DATE: 08/02/2021
 */
package practica22.recursividad;

import java.util.Scanner;

/**
 *
 * @author magipedgay
 */
public class Practica22Recursividad {

    static int contador = 0;
    static int num;
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        
        menu();

    }

    private static void nRecursive(int contador) {

        System.out.println(contador);//0 1
        contador++;//1
        if (contador < 100) {
            nRecursive(contador); //llamada recursivo
        }

    }

    private static void mRecursiveCase2(int num, int Nmax) {
        if (num % 2 == 0) {
            System.out.println(num + "\n");
        }
        num++;
        if (num <= Nmax) {
            mRecursiveCase2(num, Nmax);
        }

    }

    private static void menu() {
        int indice = 0;

        switch (indice) {

            case 1:
                System.out.println("NMAX?");
                int Nmax = keyboard.nextInt();
                mRecursiveCase2(0, Nmax);

                break;
            case 2:

                break;

        };
        System.out.println("##########################"
                + "\n 1- Numeros pares haasta N"
                + "|n 2-");

    }

}
