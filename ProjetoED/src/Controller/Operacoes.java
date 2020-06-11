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

	public static void Create() throws IOException 
	{
		/* Abridno Arquivo Original */
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
		ArrayList<Leito> lst = new ArrayList<>();
		
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
			l.setTotalcovidleito(texto[2]);
			l.setPopulacao(texto[3]);
			l.setLeitospc(texto[4]);
			l.setInternacoes7d(texto[5]);
			l.setInternacoes7di(texto[6]);
			l.setInternacoes7v7(texto[7]);
			lst.add(l);
		}
		System.out.println(lst);
		bfw.close();
		bfr.close();
	}
	
	public void Read() throws IOException {
		
		String caminho = "./resources/entrada.txt";
		BufferedReader br = new BufferedReader(new FileReader(caminho));
		String linha = "";
		while (true) {
			if(linha != null) {
				System.out.println(linha);
			} else
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
	
	public void Delete() throws IOException{
			int tamanho;
			String caminho = "./resources/entrada.txt";
			int posicao = 0;
			if(!(posicao >= 0 && posicao < tamanho)) {
				throw new IllegalArgumentException("Posicão Invalida");
				
			}
			for (int i = posicao; i< this.tamanho -1 ; i++) {
				this.elemnto[i] = this.elementos[i+1];
			}
			this.tamanho--;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}


