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
	
	
	//METODO PARA CRIAÇÃO DO TXT;
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
		br.readLine();
        while(br.ready()) {
            txt += br.readLine() + "\n";
        }
        
        bw.write(txt);
        bw.flush();
        br.close();
        bw.close();
	}
	
	//METODO DE CRIAÇÃO PARA A LISTA A SER UTILIZADA
	public static void criarArquivo(ArrayList<Leito> lista, String nomeArquivo) throws IOException {
		File f1 = new File("./resources/"+nomeArquivo+".txt");
		f1.createNewFile();
		FileWriter fw = new FileWriter(f1);
		BufferedWriter bw = new BufferedWriter(fw);
		//CRIACAO DE UM FOR IT PARA ANDAR NA LISTA;
		for(Leito l : lista) {
			bw.write(l.linhaCompleta());
		}	
		
		bw.close();
	}
	
	
	//METODO QUE CRIAMOS PARA CONSEGUIR TRABALHAR COM OS ELEMENTOS DA LISTA
	public static ArrayList<Leito> getListaLeitos(String nomeArquivo) throws NumberFormatException, IOException {
		
		//PREPARANDO O ARQUIVO PARA SER ESCRITO
		File file = new File("./resources/"+nomeArquivo+".txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		//CRIANDO A INSTANCIA DE LEITO PARA UTILIZAR OS ELEMENTOS 
		ArrayList<Leito> lista = new ArrayList<Leito>();
		Leito l;
		String[] texto;
		
		
		//WHILE PARA CONSEGUIR ESCREVER OS ELEMENTOS DO ARQUIVO NA LISTA
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
		return lista;
	}
	
	
	//METODO PARA CRIAR O ARQUIVO ENTRADA.TXT
	public static void Create() throws IOException {
		criarArquivo(arquivoOriginal.getName(), "entrada");
	}
	
	
	//Metodo para ler o arquivo entrada.txt
	public static void Read() throws IOException {	
		
		//variavel para criar o caminho do arquivo;
		String caminho = "./resources/entrada.txt";
		
		//criando a nossa logica para conseguir ler o arquivo(enviando nosso caminho);
		BufferedReader br = new BufferedReader(new FileReader(caminho));
		String linha = "";
		//laço de repetição para ficar lendo as linhas;
		while (true) {
			if(linha != null)
			{
				System.out.println(linha);
			} 
			else
				break;
				linha = br.readLine();
		}
		//fechando o bufferedReader;
		br.close();
	}

	//METODO PARA INSERIR UM NOVO ELEMENTO NO ARQUIVO TXT;
	public static void Insert(Leito l) {
		//CRIACAO DE UM METODO TRY CATCH ;
		try {
			//INSTANCIANCO A LISTA PARA CONSEGUIR TRATAR ELA;
			ArrayList<Leito> lista = new ArrayList<Leito>();
			
			//ADICIONANDO NA LISTA OS ELEMENTOS DO LEITO
			lista.addAll(Operacoes.getListaLeitos("entrada"));
			//ADICIONANDO NA PRIMEIRA LINHA, COMO REGRA DE NEGOCIO DE FIFO
			lista.add(l);
			
			//PUXANDO O METODO CRIAR ARQUIVO (PARA MANDAR A NOVA LISTA ATUALIZADA)
			criarArquivo(lista, "entrada");
			//CATCH PARA TRATAR A EXCESSÃO
		} catch (NumberFormatException | IOException e) {
			JOptionPane.showMessageDialog(null, "LEITO INVÁLIDO!", "ERRO!", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	//METODO PARA DELETAR UM ELEMENTO DO ARQUIVO TXT;
	public static void Delete() throws IOException{
		ArrayList<Leito> lista = new ArrayList<Leito>();
        lista.addAll(Operacoes.getListaLeitos("entrada"));
		// REMOVENDO O PRIMEIRO ELEMENTO DA LISTA //
        lista.remove(0);		
		// ESCREVE A LISTA EM TXT NOVAMENTE ;
		criarArquivo(lista, "entrada");
	}
	
	
	//METODO PARA CONSEGUIR ENCONTRAR UMA LINHA NO ARQUIVO
	public static String search(int i) {
		
		//INSTANCIANDO A NOSSA LISTA DE LEITO;
		ArrayList<Leito> lista = new ArrayList<Leito>();

		//CRIACAO DE UM TRY CATCH PARA TRATAR;
		try {
			lista.addAll(Operacoes.getListaLeitos("entrada"));
        	return lista.get(i-1).linhaCompleta();
        } catch (Exception e){
			return null;
        }
        
	}
}


