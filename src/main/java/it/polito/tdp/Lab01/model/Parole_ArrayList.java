package it.polito.tdp.Lab01.model;

import java.util.*;

public class Parole_ArrayList {
		
	private ArrayList<String> parole;
	
	public Parole_ArrayList() {
		this.parole = new ArrayList<String>();
	}
	
	public void addParola(String p) {
		boolean esiste = false;
		for (int i=0;i<parole.size();i++) {
			if (p.toUpperCase().compareTo(parole.get(i).toUpperCase())==0) {
				esiste=true;
			}
		}
		if (esiste==false) {
		    parole.add(p.toLowerCase());
		}
	}
	
	public List<String> getElenco() {
		ArrayList<String> copia = new ArrayList<String>();
		copia.addAll(parole);
		copia.sort(null);
		return copia;
	}
	
	public void reset() {
		parole.clear();
	}
	
	public boolean cancella(String s) {
		boolean esiste = false;
		for (int i=0;i<parole.size();i++) {
			if (parole.get(i).equals(s)) {
				parole.remove(i);
				esiste=true;
			}
		}
		return esiste;
	}

}