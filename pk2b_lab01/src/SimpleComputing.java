
import java.math.BigInteger;
import java.util.Scanner;


public class SimpleComputing {
	
	
	public static void main (String args[])
	{
		int max=0;
		System.out.println("Podaj a");
		Scanner sc = new Scanner(System.in);
		max = sc.nextInt(); 
		try {
			
			for (int i=0; i<=max; i++)
			{
			//	System.out.println("1.Silnia dla "+i+" = "+silnia(i));
			//	System.out.println("2.Silnia dla "+i+" = "+silnia2(i));
			//	System.out.println("3.Silnia dla "+i+" = "+silnia3(i));
			//	System.out.println("4.Silnia dla "+i+" = "+silnia4(i));
			//	System.out.println("6. Fibonacci: "+ fibonacci(i));
				System.out.println("6. Fibonacci2: "+ fibonacci2(i));


			}
			
		} catch (NumberFormatException e) {
			System.out.println("Blad! To nie jest liczba ca³kowita"); 
		}
		
		sc.close();
	}
/*
 * 1. Zaimplementuj metodê "silnia" obliczaj¹c¹ silniê (przy u¿yciu instrukcji for).

Dla jakiego najwiêkszego parametru x metoda zwróci poprawn¹ wartoœæ (bez modyfikacji podanej deklaracji metody silnia)?
Co jest przyczyn¹ ograniczenia?  
# dla 13 , bo problemem jest zakres bitowy (pojemnoœæ)

 */
	
	private static int silnia(int x) {
		int iloczyn = 1;
		for (int i = 1; i<= x; i++) {
			
			iloczyn *= i;  
		}
			
		return iloczyn;
	}
	
	
	
	//2. W metodzie "silnia2" (obliczaj¹cej silniê przy u¿yciu instrukcji for) zmieñ implementacjê z metody "silnia", tak ¿eby równie¿ dla wiêkszych parametrów x wyznaczana by³a poprawna wartoœæ (do 20 w³¹cznie).
	private static long silnia2(long x) {
		long iloczyn = 1;
		for (int i = 1; i<= x; i++) {
			
			iloczyn *= i;
		}
			
		return iloczyn;
	}
	/*
	3. Zadanie dla chêtnych: Zaimplementuj metodê "silnia3" obliczaj¹c¹ silniê dla du¿ych liczb.
	PodpowiedŸ: do reprezentacji liczb ca³kowitych skorzystaj z klasy BigInteger
	 */
	
	private static BigInteger silnia3(long x) {
		BigInteger iloczyn = BigInteger.valueOf(1);
		for (int i = 1; i<= x; i++) {
			
			iloczyn = iloczyn.multiply(BigInteger.valueOf(i));
		}
			
		return iloczyn;
	}
	
	
	//4. Zaimplementuj metodê "silnia4" obliczaj¹c¹ silniê za pomoc¹ rekurencji.
	private static int silnia4(int x) {
		if (x <= 1) {
			return 1;
		}else return x * silnia4(x - 1);
	}
		
	/*
	 * 6. Zaimplementuj metodê "fibonacci" obliczaj¹c¹ wyrazy ci¹gu Fibonacciego za pomoc¹ rekurencji.
	Jaka jest wartoœæ 30, 35, 40 i 45 wyrazu ci¹gu Fibonacciego?
	Dlaczego obliczenia tak d³ugo trwaj¹?
	 */
	private static int fibonacci(int x) {
		if (x <= 1) {
			return x;
		} 	return fibonacci(x-1) + fibonacci(x-2);
	
	}


/*Jaki jest 30, 35, 40 i 45 wyraz ci¹gu Fibonacciego?
	30 = 832040
	35 = 9227465		
	40 = 102334155
	45 = 1134903170
*/

 
// 8. Zaimplementuj metodê "fibonacci2" obliczaj¹c¹ wyrazy ci¹gu Fibonacciego za pomoc¹ pêtli for, bez rekurencji.

 private static int fibonacci2(int x) {
		int m = 0;
		int n = 1;		
		
	 if (x == 0) return m;
	 if (x == 1) return n;
		int res = 0;
		for (int i = 2; i <= x; i++) {
			res = m + n;
			m=n;
			n = res;
		}
		return res;
	}
 }
// metoda fibonacci2 dzia³a szybciej ni¿ metoda fibonacci
