
public class Dokument {
	private String tytul;
	private String tresc;
	
	public Dokument(String tytul, String tresc)
	{
		this.tytul = tytul;
		this.tresc = tresc;
	}
	
	public void setTytul(String tytul) {
		this.tytul = tytul;
	}
	public String getTytul() {
		return tytul;
	}
	public void setTresc(String tresc) {
		this.tresc = tresc;
	}
	public String getTresc() {
		return tresc;
	}
	public static String saveMeToPDF() {
		String title = "Title from class \"Dokument\"";
		System.out.println("Dokument zapisany w formacie PDF");
		return title;
	}

	}

	


/*
 1. Przejrzyj kod projektu startowego.
1a. Jakie zawiera klasy, jakie zasoby, jakie biblioteki?
1b. Przeanalizuj kod metody main klasy Runner.
1c. Przeanalizuj kod metod show, create, save, load, exit
1d. Przeanalizuj kod klasy Dokument

2. Uruchom projekt startowy. Przeanalizuj nast�puj�cy scenariusz:
2a. show - jakie dokumenty s� na li�cie?
2b. create - utw�rz dokument - co si� dzieje z utworzonym dokumentem? gdzie jest zapami�tany?
2c. show - czy utworzony dokument si� pojawi�? dlaczego?
2d. create - utw�rz drugi dokument
2e. save - zapisz list� dokument�w. Gdzie zosta�a zapisana? Przejrzyj tre�� pliku w systemie.
2f. exit - wyjd� z aplikacji. Co si� sta�o z list� po wyj�ciu z aplikacji?
2g. uruchom aplikacj�
2h. show - jakie dokumenty s� na li�cie? Dlaczego?
2i. load - za�aduj dokumenty z pliku
2j. show - jakie dokumenty s� na li�cie? Dlaczego?

3. Przeanalizuj kod metod save i load oraz klasy Dokument przy u�yciu Debuggera

4. Przeanalizuj kod metody pdfSample. Wywo�aj j�. Obejrzyj otrzymany dokument HelloWorld1.pdf

5. Do menu g��wnego dodaj opcj� saveTo1PDF i metod� o tej samej nazwie. Metoda saveTo1PDF powinna zapisywa� tre�� wszystkich dokument�w z bie��cej listy do 1 pliku PDF (plik: dokumenty.pdf)

6. Do menu g��wnego dodaj opcj� saveToManyPDFs i metod� o tej samej nazwie. Metoda saveToManyPDFs powinna zapisywa� tre�� dokument�w z bie��cej listy do wielu plik�w PDF - ka�dy dokument w osobnym pliku (nazwy plik�w: numer_tytul.pdf)

Podpowied�: zgodnie z za�o�eniami hermetyzacji (enkapsulacji) w klasie Dokument powinna zosta� dodana metoda "saveMeToPDF". B�dzie ona wywo�ywana dla ka�dego obiektu tej klasy w celu zapisu do plik�w PDF.
*/
