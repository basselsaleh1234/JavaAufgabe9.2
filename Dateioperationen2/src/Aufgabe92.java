import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Aufgabe92 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader einlesen = new BufferedReader(new InputStreamReader(System.in));
			
            System.out.println("zu kopierende Datei ");
		String name =einlesen.readLine();
		
		Scanner scan=new Scanner(new FileReader(name));  
		
		
	       String inhalt=scan.nextLine();	
		
		scan.close();
		
		// System.out.println(scan.nextLine());
		
		 System.out.println("Dateiname der Kopie ");
		 String name2=einlesen.readLine();
		 
		PrintWriter p=new PrintWriter(name2);
		
		p.println(inhalt);
		p.close();
		
		
	}

}
