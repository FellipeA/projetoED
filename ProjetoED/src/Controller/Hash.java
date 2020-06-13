package Controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class Hash {
	public ArrayList<String> carregarArquivo(String caminho) throws IOException {
		ArrayList<String> dados = new ArrayList<String>();

		// Leitor de arquivo txt em uma lista de String dentro de um try/catch
		try {
			FileReader r = new FileReader(caminho);
			BufferedReader br = new BufferedReader(r);
			String linha;

			// Looping para ler o arquivo e armazenar o conteúdo em um ArrayList
			linha = br.readLine();
			int i = 0;
			while (linha != null) {
				linha = br.readLine();
				dados.add(linha);
				System.out.printf("%s \n", dados.get(i));
				i += 1;
			}
			br.close();

		} catch (FileNotFoundException e) {
			System.out.println("ARQUIVO NÃO FOI ENCONTRADO!");
			e.printStackTrace();
		}
		return dados;
	}

	// Método adiciona elemento ao HashMap
	public void adicionar(ArrayList<String> D) throws IOException {
		Map<Integer, String> map = new HashMap<Integer, String>();

		// Ordena os valores do HashMap
		String temp;
		for (int i = 0; i < (D.size() - 1); i++) {
			//System.out.println(D.get(i));
			map.put(i, D.get(i));
		}

		// Ordena os valores
		for (int i = 0; i < (map.size() - 1); i++) {
			for (int j = (i + 1); j < map.size(); j++)
				if (map.get(i).compareTo(map.get(j)) > 0) {
					temp = map.get(i);
					map.put(i, map.get(j));
					map.put(j, temp);
				}
		}

		// Adicionar Hash encadeado
		LinkedHashMap<Integer, String> lh = new LinkedHashMap<Integer, String>();
		lh.putAll(map);
		JOptionPane.showInternalMessageDialog(null, (lh.values().toString().split(Pattern.quote(","))));
	}
}
