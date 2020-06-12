package Controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Entity.Leito;

public class Ordenacao
{
	public void bubblesort(List<Leito> lst)
	{
		
		
	}
	
	public int[] shellSort(int[] vet, int size) 
	{
	    int i , j , value;
	    int gap = 1;
	    while(gap < size) {
	        gap = 3*gap+1;
	    }
	    while ( gap > 1) {
	        gap /= 3;
	        for(i = gap; i < size; i++) {
	            value = vet[i];
	            j = i - gap;
	            while (j >= 0 && value < vet[j]) {
	                vet [j + gap] = vet[j];
	                j -= gap;
	            }
	            vet [j + gap] = value;
	        }
	    }
	    
	    File f = new File("./");
	    
	    return vet;
	}
}
