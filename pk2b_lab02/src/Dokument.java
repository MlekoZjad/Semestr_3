
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

2. Uruchom projekt startowy. Przeanalizuj nastêpuj¹cy scenariusz:
2a. show - jakie dokumenty s¹ na liœcie?
2b. create - utwórz dokument - co siê dzieje z utworzonym dokumentem? gdzie jest zapamiêtany?
2c. show - czy utworzony dokument siê pojawi³? dlaczego?
2d. create - utwórz drugi dokument
2e. save - zapisz listê dokumentów. Gdzie zosta³a zapisana? Przejrzyj treœæ pliku w systemie.
2f. exit - wyjdŸ z aplikacji. Co siê sta³o z list¹ po wyjœciu z aplikacji?
2g. uruchom aplikacjê
2h. show - jakie dokumenty s¹ na liœcie? Dlaczego?
2i. load - za³aduj dokumenty z pliku
2j. show - jakie dokumenty s¹ na liœcie? Dlaczego?

3. Przeanalizuj kod metod save i load oraz klasy Dokument przy u¿yciu Debuggera

4. Przeanalizuj kod metody pdfSample. Wywo³aj j¹. Obejrzyj otrzymany dokument HelloWorld1.pdf

5. Do menu g³ównego dodaj opcjê saveTo1PDF i metodê o tej samej nazwie. Metoda saveTo1PDF powinna zapisywaæ treœæ wszystkich dokumentów z bie¿¹cej listy do 1 pliku PDF (plik: dokumenty.pdf)

6. Do menu g³ównego dodaj opcjê saveToManyPDFs i metodê o tej samej nazwie. Metoda saveToManyPDFs powinna zapisywaæ treœæ dokumentów z bie¿¹cej listy do wielu plików PDF - ka¿dy dokument w osobnym pliku (nazwy plików: numer_tytul.pdf)

PodpowiedŸ: zgodnie z za³o¿eniami hermetyzacji (enkapsulacji) w klasie Dokument powinna zostaæ dodana metoda "saveMeToPDF". Bêdzie ona wywo³ywana dla ka¿dego obiektu tej klasy w celu zapisu do plików PDF.
*/
