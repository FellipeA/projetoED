package view;

import java.io.IOException;

import Controller.Operacoes;
import Controller.Ordenacao;

public class teste {

	public static void main(String[] args) throws IOException 
	{
		Operacoes op = new Operacoes();
		op.Create();
<<<<<<< HEAD
		op.Delete();
		op.Read();
		
=======
		
		int[] v = new int[100];
		for(int cta = 0; cta < 100; cta++)
		{
			v[cta] = (int) (Math.random() * 500) + 530; 
		}
		
		Ordenacao od = new Ordenacao();
		od.shellSort(v, v.length);
		for(int cta1 = 0; cta1 < 100; cta1++)
		{
			System.out.println(v[cta1]);
		}
>>>>>>> branch 'master' of https://github.com/FellipeA/projetoED.git
	}

}
