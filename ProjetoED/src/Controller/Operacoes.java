package Controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Entity.Leito;

public class Operacoes 
{
	private int variavel;
	static ArrayList<Leito> lst = new ArrayList<>();
	
	public static void Create() throws IOException 
	{
		/* Abrindo Arquivo Original */
		File f = new File("./resources/Leitos-e-Internacoes2.csv");
		FileReader fr = new FileReader(f);
		BufferedReader bfr = new BufferedReader(fr);
		
		/* Colocando no novo arquivo */
		File f1 = new File("./resources/entrada.txt");
		f1.createNewFile();
		FileWriter fw = new FileWriter(f1);
		BufferedWriter bfw = new BufferedWriter(fw);
		
		/* Lendo o arquivo original e passando para a Lista */
		FileReader fr2 = new FileReader(f1);
		BufferedReader bfr2 = new BufferedReader(fr2);
		
		Leito l = new Leito();
		
		/* Pular o cabeçalho */
		bfr.readLine();
		
		/* Escreve no txt */
		String txt = "";
		while(bfr.ready())
		{
			txt += bfr.readLine() + "\n";
		}
		bfw.write(txt);
		bfw.flush();
		
		/* Passando Leito para a Lista */
		String[] texto;
		while(bfr2.ready())
		{
			texto = bfr2.readLine().split(";");
			l = new Leito();
			l.setData(texto[0]);
			l.setNomedistrito(texto[1]);
			l.setTotalcovidleito(Integer.parseInt(texto[2]));
			l.setPopulacao(Integer.parseInt(texto[3]));
			l.setLeitospc(Double.parseDouble(texto[4].replace(",", ".")));
			l.setInternacoes7d(Integer.parseInt(texto[5]));
			l.setInternacoes7di(Integer.parseInt(texto[6]));
			l.setInternacoes7v7(Double.parseDouble(texto[7].replace(",", ".")));
			lst.add(l);
		}
		bfw.close();
		bfr.close();
		bfr2.close();
	}
	
	public void Read() throws IOException
	{	
		String caminho = "./resources/entrada.txt";
		BufferedReader br = new BufferedReader(new FileReader(caminho));
		String linha = "";
		while (true) {
			if(linha != null)
			{
				System.out.println(linha);
			} 
			else
				break;
				linha = br.readLine();
		}
		br.close();
	}
	
	public void Update() 
	{
		int option;
		String lista;
		
		if(list.contains("a")) {
			
			int a;
			
			
		}
	}
	
	public void Delete() throws IOException
	{
		lst.remove(1);
		System.out.println(lst);
	}	
}

