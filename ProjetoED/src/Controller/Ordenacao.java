package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Entity.Leito;

public class Ordenacao {
	
	private Operacoes op = new Operacoes();
	
	public void bubblesort(ArrayList<Leito> lst) {
		
		Leito aux;
		for (int i = 1; i <= lst.size(); i++) {
			for (int j = i+1; i <= lst.size(); i++) {
				if (lst.get(i).getTotalcovidleito() > lst.get(j).getTotalcovidleito()) {
					aux = lst.get(i);
					lst.set(i, lst.get(j));
					lst.set(j, aux);
				}
			}
		}
		
		try {
			op.criarArquivo(lst, "bubblesort");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "ERRO AO CRIAR O ARQUIVO BUBBLESORT", "ERRO!", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void shellSort(ArrayList<Leito> lst, int size) {
	    int i , j;
		Leito value;
	    int gap = 1;
	    while(gap < size) 
	    {
	        gap = 3 * gap+1;
	    }
	    while ( gap > 1) 
	    {
	        gap /= 3;
	        for(i = gap; i < size; i++) 
	        {
	            value = lst.get(i);
	            j = i - gap;
	            while (j >= 0 && value.getTotalcovidleito() < lst.get(j).getTotalcovidleito()) 
	            {
	            	lst.set(j + gap, lst.get(j + gap));
	                j -= gap;
	            }
	            lst.set(j + gap, value);
	        }
	    }   
	    
	    try {
			op.criarArquivo(lst, "shellsort");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "ERRO AO CRIAR O ARQUIVO SHELLSORT", "ERRO!", JOptionPane.ERROR_MESSAGE);
		}
	    
	}
}
