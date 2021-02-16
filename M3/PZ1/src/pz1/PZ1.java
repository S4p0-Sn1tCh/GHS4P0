/*
 * AUTHOR: MAX PEDREGOSA
 * DATE: 26/01/21
 * 
 */
package pz1;

import java.util.Scanner;

public class PZ1 {
 private static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("AUTHOR: Max");
        int mes, any, dia, d;
        dia = 12;        
        mes =9;
        System.out.println("Year?");
        any = keyboard.nextInt();
        String strDia = InicioDiaMesZeller(dia, mes, any);
        
        System.out.println("International Programmer's Day: "+dia+" "+strDia+" September "+any);
    }

    private static String InicioDiaMesZeller(int dia, int mes, int Any) {
        //zeller
        String dayString = "";
        String[] semana = {"Sunday", "Monaday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        int a, y, m, d,dd;

        a = (14 - mes) / 12;
        y = Any - a;
        m = mes + 12 * a - 2;
        d = (dia + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;
       
        
        
        if (y*100%400==0){  dayString = semana[d]; 
        }else{ dd= d+1; dayString = semana[dd];
        }
        return dayString;
    }
   
}

