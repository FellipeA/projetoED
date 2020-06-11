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

public class Operacoes 
{
	private int variavel;

	public void Create() throws IOException 
	{
		File f = new File("./resources/Leitos-e-Internacoes2.csv");
		FileReader fr = new FileReader(f);
		BufferedReader bfr = new BufferedReader(fr);
		
		File f1 = new File("./resources/entrada.txt");
		f1.createNewFile();
		FileWriter fw = new FileWriter(f1);
		BufferedWriter bfw = new BufferedWriter(fw);
		
		String texto = "";
		while(bfr.ready())
		{
			texto += bfr.readLine() + "\n";
		}
		
		bfw.write(texto);
		bfw.flush();
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
		
		if(lista.contains("a")) {
			

			
			
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


