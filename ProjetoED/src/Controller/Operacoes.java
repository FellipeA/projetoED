package Controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Operacoes 
{
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
		
	}
	
	public void Delete() throws IOException
	{  

        System.out.println("linha a ser deletada:"+linhadeletada);  
        try
        {  
            File inFile = new File(linhadeletada);  
            if(!inFile.isFile())
            {  
                System.out.println("O caminho passado não existe!");  
                return;  
            }  
            File tempFile = new File(inFile.getAbsolutePath()+".temp");  
            BufferedReader br = new BufferedReader(new FileReader(linhadeletada));  
            PrintWriter pw = new PrintWriter(new FileWriter(tempFile));  
            String line = null;  
            while((line = br.readLine()) != null)
            {  
                if(!line.trim().equals(linhadeletada))
                {  
                    pw.println(line);  
                    pw.flush();  
                }  
            }  
            pw.close();  
            pw.flush();  
            if(!inFile.delete())
            {  
                System.out.println("Arquivo não deletado!");  
                return;  
            }  
            if(!tempFile.renameTo(inFile))
            {  
                System.out.println("Arquivo renomeando!");  
            }  
        }
        catch (FileNotFoundException arq) 
        {  
            arq.printStackTrace();  
        }
        catch (IOException e) 
        {  
            e.printStackTrace();  
        }  
    }
}