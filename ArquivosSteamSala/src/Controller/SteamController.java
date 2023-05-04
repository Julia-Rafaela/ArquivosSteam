package Controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SteamController implements Isteam {

	public SteamController() {
		
		super();
	}
	
    
	public void ReadFile(String path, String name) throws IOException {
		 float  num = (float) 51787.36;
		
		File arq = new File(path);
		 if (!arq.exists()) {
	            System.out.println("Arquivo não encontrado.");
	            return;
	        }
		 
		 try (BufferedReader buffer = new BufferedReader(new FileReader(arq))) {
        	 String Linha = buffer.readLine();
		
		System.out.println("NOME JOGO \t\t MEDIA DE JOGADORES ATIVOS");
        System.out.println("---------------------------------------------------------------------------------------");

		while((Linha = buffer.readLine())!=null) {
			  String [] p = Linha.split(",");
		        String nome = p [0];
                String ano = p[1];
                String mes = p[2];
                String media = p[3];
              
                if(ano.equalsIgnoreCase("2017") && mes.equalsIgnoreCase("February")) {
                	  
                    System.out.println(nome+ "\t\t" +media);
                }
                
            
		}

		
	}catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
  }
}
