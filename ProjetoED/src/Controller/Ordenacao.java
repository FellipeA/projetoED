package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Entity.Leito;

public class Ordenacao {
	
	
	public static long bubblesort(ArrayList<Leito> lst) {
		
		Long tempo;
		// Coletando o momento do sistema antes da execução da ordenação
		tempo = System.currentTimeMillis();
		
		// BubbleSort com base no total de leitos ocupados pela covid-19 no município
		Leito aux;
		for (int i = 0; i < lst.size() -1; i++) {
			// Para cada posição i da lista, ele percorre todos o restante fazendo a comparação
			for (int j = i+1; j < lst.size() -1; j++) {
				// Ao final do for J, a posição i da lista terá o menor valor existente
				if (lst.get(i).getTotalcovidleito() > lst.get(j).getTotalcovidleito()) {
					aux = new Leito();
					aux = lst.get(i);
					lst.set(i, lst.get(j));
					lst.set(j, aux);
				}
			}
		}
		// Chamada do método 'criarArquivo' para a criação do txt com o resultado da ordenação
		try {
			Operacoes.criarArquivo(lst, "bubblesort");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "ERRO AO CRIAR O ARQUIVO BUBBLESORT", "ERRO!", JOptionPane.ERROR_MESSAGE);
		}
		
		// Coletando a diferença dos tempos do sistema,
		// o que gera, em milisegundos, o tempo de execução para essa ordenação
		tempo = System.currentTimeMillis() - tempo;
		
		// retorno do tempo
	    return tempo;
	}
	
	public static long shellSort(ArrayList<Leito> lst) {
		
		Long tempo;
		// Coletando o momento do sistema antes da execução da ordenação
		tempo = System.currentTimeMillis();
		int i , j , h = 1;
		Leito value;
		// Carrega a variável h com base no tamanho da lista
		do {
		        h = 3 * h + 1;
		} while ( h < lst.size() );
		// Após carregar a variável ele inicia a ordenação
		do {
		        h = h / 3;
		        for ( i = h; i < lst.size(); i++) {
		           value = lst.get(i);
		           j = i - h;
		           while (j >= 0 && value.getTotalcovidleito() < lst.get(j).getTotalcovidleito()) {
		              lst.set(j+h, lst.get(j));
		              j = j - h;
		           }
		           lst.set(j+h, value);
		        }
		} while ( h > 1 );
	    
	    try {
			Operacoes.criarArquivo(lst, "shellsort");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "ERRO AO CRIAR O ARQUIVO SHELLSORT", "ERRO!", JOptionPane.ERROR_MESSAGE);
		}

		// Coletando a diferença dos tempos do sistema,
		// o que gera, em milisegundos, o tempo de execução para essa ordenação
		tempo = System.currentTimeMillis()- tempo;
		
		// retorno do tempo
	    return tempo;
	}
}
