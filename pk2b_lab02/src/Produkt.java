import java.util.*;

public class Produkt{


	private String nazwa;
	private int cena;
	ArrayList <Produkt> listaP;
	
	
	
	
	// Dodawanie nowego produktu
	public Produkt(String nazwa, int cena) throws Exception {
	    
	    if (nazwa == null || nazwa.trim().isEmpty()){
			throw new Exception("Nazwa nie moze byc pusta");
		}
	
		this.nazwa = nazwa;
		this.cena = cena;
		
	}
	
	
	
	public String getNazwa() {
		if (nazwa == null) {
			throw new IllegalArgumentException("Nazwa nie moze byc pusta");
			}
			else {
			}		
	return nazwa;
	}

	public int getCena() {
		return cena;
		
	}



}