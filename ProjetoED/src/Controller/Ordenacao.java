package Controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Entity.Leito;

public class Ordenacao
{
	public void bubblesort(List<Leito> lst)
	{
		/* Preenchendo ArrayList Com a as informações do csv */
		ArrayList<Leito> al = new ArrayList<Leito>();
		for(Leito leito : lst) 
		{
            al.addAll(al);
        }
		Collections.sort(lst, Collections.reverseOrder());
		
	}
}
