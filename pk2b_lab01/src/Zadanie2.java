/*
 * Zaimplementuj metod� "nwd2" znajduj�c� najwi�kszy wsp�lny dzielnik metod� "poprzez rozk�ad na czynniki pierwsze", opisan� w:
http://pl.wikipedia.org/wiki/Najwi%C4%99kszy_wsp%C3%B3lny_dzielnik
Podpowied�: wykorzystaj obiekty klasy ArrayList do pami�tania listy czynnik�w pierwszych. Liczby przechowuj w obiektach klasy Integer.
 */


import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie2 {

	
		public static void main(String[] args) {
			
			
	        Scanner sc = new Scanner(System.in); // Wprowadzanie liczb przez u�ytkownika
	        System.out.println("Podaj a");
	        int a = sc.nextInt();
	        System.out.println("Podaj b");
	        int b = sc.nextInt();
	        System.out.println("Najwi�kszy wsp�lny dzielnik liczb "+ a + " i "+ b);
	        nwd2(a, b); // Wywo�anie metody nwd2
	        sc.close();
		}
		
	       public static void nwd2(int a, int b) {
		
        int iloscA = 0;
        int iloscB = 0;
        // Tworzenie dwoch list do przechowywania dzielnikow liczby a i b
        ArrayList<Integer> liczbyPierwszeA = new ArrayList<Integer>();
        ArrayList<Integer> liczbyPierwszeB = new ArrayList<Integer>();
        
        int a1 = a;
        int b1 = b;
        
        // Szukanie liczb pierwszych liczby a
        for (int i = 2; i <= a; i++) {

            while (a % i == 0) {
                liczbyPierwszeA.add(iloscA, i);
                iloscA++;
                a = a / i;
            }
        }
        // Wypisanie dzielnikow liczby a
        int x = 0;
        System.out.print("Rozk�ad na czynniki pierwsze liczby " + a1 + "=");
        while (x < liczbyPierwszeA.size()) {
            System.out.print(liczbyPierwszeA.get(x) + "*");
            x++;
        }
        
        // Szukanie liczb pierwszych liczby b
        for (int i = 2; i <= b; i++) {

            while (b % i == 0) {
             
                liczbyPierwszeB.add(iloscB, i);
                iloscB++;
                b = b / i;
            }
        }
        // Wypisanie dzielnikow liczby b
        int y = 0;
        System.out.print("\nRozk�ad na czynniki pierwsze liczby " + b1 + "=");
        while (y < liczbyPierwszeB.size()) {
            System.out.print(liczbyPierwszeB.get(y) + "*");
            y++;
        }

        ArrayList<Integer> Wspolne = new ArrayList<Integer>();  // Tworzenie wsp�lnej listy dzielnikow
        int WspolneLicznik = 0;
        int indexA = 0;
        int indexB = 0;
        // Dodawanie tych samych liczb do tablicy Wspolne
        while (indexA < liczbyPierwszeA.size () && indexB < liczbyPierwszeB.size()) {
            if (liczbyPierwszeA.get(indexA) == liczbyPierwszeB.get(indexB)) {
                Wspolne.add(WspolneLicznik, liczbyPierwszeA.get(indexA));
                indexA++;
                indexB++;
            } else {
                if (liczbyPierwszeA.get(indexA) < liczbyPierwszeB.get(indexB))
                    indexA++;
                else
                    indexB++;
            }
        }
        // Wypisanie wspolnych elementow
        System.out.println("\nWspólna tablica: "+Wspolne);
        
        // Wymnozenie elementow tablicy Wspolne
         
        int razem=1;
        for(int i : Wspolne) {
           razem *= i;
        }
        	System.out.println("NWD: " + razem);
        }
        	
        	   }
    

            

            	

            
        
    
    
