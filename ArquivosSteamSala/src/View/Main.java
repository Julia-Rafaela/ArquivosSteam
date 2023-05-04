package View;

import java.io.IOException;
import Controller.Isteam;
import Controller.SteamController;

public class Main {

	public static void main(String[] args) {
		
	
	
		Isteam arqCont = new SteamController();
		String path = "C:\\TEMP\\SteamCharts.csv" ;
		String nome = "SteamCharts.csv" ;
		try {
		
			arqCont.ReadFile(path, nome);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	
	}

}
