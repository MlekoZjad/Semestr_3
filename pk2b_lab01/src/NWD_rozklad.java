import java.util.*; 
public class NWD_rozklad {
	
	
public static void main(String[] args) {
	

	int a;
    int b;
    Scanner liczba = new Scanner(System.in);
    System.out.println("Podaj a");
    a = liczba.nextInt();
    System.out.println("Podaj b");
    b = liczba.nextInt();
    nwd2(a,b);
    liczba.close();
}
  
    public static int nwd2(int a, int b) {
    int iloscA = 0;
    int iloscB = 0;
    ArrayList<Integer> liczbyPierwszeA = new ArrayList<Integer>();
    ArrayList<Integer> liczbyPierwszeB = new ArrayList<Integer>();
    
    int a1 = a;
    int b1 = b;

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

    int licznik = 0;
    ArrayList<Integer> Wspolne = new ArrayList<Integer>();
    int WspolneLicznik = 0;
    while (liczbyPierwszeA.get(licznik) == liczbyPierwszeB.get(licznik)) {
        Wspolne.add(WspolneLicznik, liczbyPierwszeA.get(licznik));
        licznik++;
        WspolneLicznik++;
    }
    System.out.println("");
    int z = 0;
    while (z < Wspolne.size()) {
        System.out.print(Wspolne.get(z) + "*");
        z++;
    }
	return z;
}	
    

	}
