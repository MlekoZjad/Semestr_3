import java.util.*;
public class Test {
	
	
	public static void main(String[] args) {
	
    Scanner liczba = new Scanner(System.in);
    System.out.println("Podaj a");
    int a = liczba.nextInt();
    System.out.println("Podaj b");
    int b = liczba.nextInt();
 
  private static int nwd2(int a, int b) {
        int a1 = a;
    	int b1 = b;
    	int iloscA = 0;
        int iloscB = 0;
        List<Integer> liczbyPierwszeA = new ArrayList<Integer>();
    	List<Integer> liczbyPierwszeB = new ArrayList<Integer>();
    for (int i = 2; i <= a; i++) {

        while (a % i == 0) {
            // System.out.print(i + "*");
            liczbyPierwszeA.add(iloscA, i);
            iloscA++;
            a = a / i;
        }
    }

    int x = 0;
    System.out.print("Rozk³ad na czynniki pierwsze liczby " + a1 + "=");
    while (x < liczbyPierwszeA.size()) {
        System.out.print(liczbyPierwszeA.get(x) + "*");
        x++;
    }

    for (int i = 2; i <= b; i++) {

        while (b % i == 0) {
            // System.out.print(i + "*");
            liczbyPierwszeB.add(iloscB, i);
            iloscB++;
            b = b / i;
        }
    }
    System.out.println("");
    int y = 0;
    System.out.print("Rozk³ad na czynniki pierwsze liczby " + b1 + "=");
    while (y < liczbyPierwszeB.size()) {
        System.out.print(liczbyPierwszeB.get(y) + "*");
        y++;
    }

    int WspolneLicznik = 0; 
    int indexA = 0;
    int indexB = 0;
    while (indexA < liczbyPierwszeA.size () && indexB < liczbyPierwszeB.size()) {
        if (liczbyPierwszeA.get(indexA) == liczbyPierwszeB.get(indexB)) {
            

			Wspolne.add(WspolneLicznik, liczbyPierwszeA.get(indexA));
            indexA++;
            indexB++;
            WspolneLicznik++;  
        } else 
            if (liczbyPierwszeA.get(indexA) < liczbyPierwszeB.get(indexB))
                indexA++;
            else
                indexB++;
        }
    }

}
}
