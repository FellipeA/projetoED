package Controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Entity.Leito;

public class Operacoes 
{

	private static File arquivoOriginal = new File("./resources/Leitos-e-Internacoes2.csv");
	
	public static void criarArquivo(String arquivoOrigem, String nomeArquivo) throws IOException {
//		LER ARQUIVO
		File arquivoLido = new File("./resources/"+arquivoOrigem);
		FileReader fr = new FileReader(arquivoLido);
		BufferedReader br = new BufferedReader(fr);
		
//		ARQUIVO A SER CRIADO
		File arquivoCriado = new File("./resources/"+nomeArquivo+".txt");
		FileWriter fw = new FileWriter(arquivoCriado);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String txt="";
        while(br.ready()) {
            txt += br.readLine() + "\n";
        }
        
        bw.write(txt);
        bw.flush();
        
        fr.close();
        br.close();
        fw.close();
        bw.close();
	}
	
	public void criarArquivo(ArrayList<Leito> lista, String nomeArquivo) throws IOException {
		File f1 = new File("./resources/"+nomeArquivo+".txt");
		f1.createNewFile();
		FileWriter fw = new FileWriter(f1);
		BufferedWriter bw = new BufferedWriter(fw);
		
		for(Leito l : lista) {
			bw.write(l.linhaCompleta());
		}
		
		fw.close();
		bw.close();
		
		JOptionPane.showMessageDialog(null, "Arquivo escrito com sucesso!");
	}
	
	public ArrayList<Leito> getListaLeitos(String nomeArquivo) throws NumberFormatException, IOException {
		File file = new File("./resources/"+nomeArquivo+".txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		ArrayList<Leito> lista = new ArrayList<Leito>();
		Leito l;
		String[] texto;
		
		bufferedReader.readLine();
		while(bufferedReader.ready())
		{
			texto = bufferedReader.readLine().split(";");
			l = new Leito();
			l.setData(texto[0]);
			l.setNomedistrito(texto[1]);
			l.setTotalcovidleito(Integer.parseInt(texto[2]));
			l.setPopulacao(Integer.parseInt(texto[3]));
			l.setLeitospc(Double.parseDouble(texto[4].replace(",", ".")));
			l.setInternacoes7d(Integer.parseInt(texto[5]));
			l.setInternacoes7di(Integer.parseInt(texto[6]));
			l.setInternacoes7v7(Double.parseDouble(texto[7].replace(",", ".")));
			lista.add(l);
		}
		bufferedReader.close();
		fileReader.close();
		return lista;
	}
	
	public void Create() throws IOException {
		criarArquivo(arquivoOriginal.getName(), "entrada");
	}
	
	public void Read() throws IOException {	
		String caminho = "./resources/entrada.txt";
		BufferedReader br = new BufferedReader(new FileReader(caminho));
		String linha = "";
		while (true) {
			if(linha != null)
			{
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
		
//		if(list.contains("a")) {
//			
//			int a;
//			
//			
//		}
	}
	
//	public void Delete() throws IOException
//	{
//		lst.remove(1);
//		System.out.println(lst);
//	}	
}

