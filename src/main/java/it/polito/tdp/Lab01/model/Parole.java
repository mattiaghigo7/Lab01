package it.polito.tdp.Lab01.model;

import java.util.*;

public class Parole {
		
	private LinkedList<String> parole;
	
	public Parole() {
		this.parole = new LinkedList<String>();
	}
	
	public void addParola(String p) {
		parole.add(p);
	}
	
	public List<String> getElenco() {
		LinkedList<String> copia = new LinkedList<String>();
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