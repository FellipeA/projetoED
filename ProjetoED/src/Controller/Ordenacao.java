package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Entity.Leito;

public class Ordenacao {
	
	
	public static long bubblesort(ArrayList<Leito> lst) {
		
		Long tempo;
		tempo = System.currentTimeMillis();
		Leito aux;
		for (int i = 0; i < lst.size() -1; i++) {
			for (int j = i+1; j < lst.size() -1; j++) {
				if (lst.get(i).getTotalcovidleito() > lst.get(j).getTotalcovidleito()) {
					aux = new Leito();
					aux = lst.get(i);
					lst.set(i, lst.get(j));
					lst.set(j, aux);
				}
			}
		}
		
		try {
			Operacoes.criarArquivo(lst, "bubblesort");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "ERRO AO CRIAR O ARQUIVO BUBBLESORT", "ERRO!", JOptionPane.ERROR_MESSAGE);
		}
		
		tempo = System.currentTimeMillis() - tempo;
	    return tempo;
	}
	
	public static long shellSort(ArrayList<Leito> lst) {
		
		Long tempo;
		tempo = System.currentTimeMillis();
		int i , j , h = 1;
		Leito value;
		do {
		        h = 3 * h + 1;
		} while ( h < lst.size() );
		do {
		        h = h / 3;
		        for ( i = h; i < lst.size(); i++) {
		           value = lst.get(i);
		           j = i - h;
		           while (j >= 0 && value.getTotalcovidleito() < lst.get(j).getTotalcovidleito()) {
		              lst.set(j+h, lst.get(j));
		              j = j - h;
		           }
		           lst.set(j+h, value);
		        }
		} while ( h > 1 );
	    
	    try {
			Operacoes.criarArquivo(lst, "shellsort");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "ERRO AO CRIAR O ARQUIVO SHELLSORT", "ERRO!", JOptionPane.ERROR_MESSAGE);
		}
	    
		tempo = System.currentTimeMillis()- tempo;
	    return tempo;
	}
}
