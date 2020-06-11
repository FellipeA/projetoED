package Controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Operacoes 
{
	public void Create() 
	{
		
		
		
	}
	
	public void Read(String caminho1) throws IOException 
	{
		BufferedReader br = new BufferedReader(new FileReader(caminho1));
		String linha = "";
		while(true) {
			if(linha != null) {
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
		
		
	}
	
	
	public void Delete(String linhadeletada) throws IOException
	{  

        System.out.println("linha a ser deletada:"+linhadeletada);  
        try
        {  
            File inFile = new File(linhadeletada);  
            if(!inFile.isFile())
            {  
                System.out.println("O caminho passado n�o existe!");  
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
                System.out.println("Arquivo n�o deletado!");  
                return;  
            }  
            if(!tempFile.renameTo(inFile))
            {  
                System.out.println("Arquivo renomeando!");  
            }  
        }catch (FileNotFoundException arq) 
        {  
            arq.printStackTrace();  
        }
        catch (IOException e) 
        {  
            e.printStackTrace();  
        }  
    }






}