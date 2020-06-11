package Controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Entity.Leito;

public class Ordenacao
{
	public void bubblesort(List<Leito> lst)
	{
		ArrayList<String> al = new ArrayList<String>();
		Collections.sort(lst, Collections.reverseOrder());
	}
}
