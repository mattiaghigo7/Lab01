package it.polito.tdp.Lab01.model;

import java.util.*;

public class Parole_ArrayList {
		
	private ArrayList<String> parole;
	
	public Parole_ArrayList() {
		this.parole = new ArrayList<String>();
	}
	
	public void addParola(String p) {
		parole.add(p);
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
	
	public void cancella(String s) {
		for (int i=0;i<parole.size();i++) {
			if (parole.get(i).equals(s)) {
				parole.remove(i);
				
			}
		}
	}

}