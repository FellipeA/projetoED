package Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {
	
	public static void main(String[] args) throws IOException {
		int cta, a = 0;
        char c;
        File f = new File("./resources/Leitos-e-Internacoes.csv");
        BufferedReader br = new BufferedReader(new FileReader(f));
        String[] dados;
        String linha;
        while((linha = br.readLine()) != null) {
            System.out.println(linha);
        }
        br.close();
	}
}
