package Controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Entity.Leito;

public class Ordenacao {
	
	private Operacoes op = new Operacoes();
	
	public void bubblesort(ArrayList<Leito> lst) {
		
	}
	
	public void shellSort(ArrayList<Leito> lst, int size) throws IOException {
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
	    
	    op.criarArquivo(lst, "shellsort");
	    
	}
}
