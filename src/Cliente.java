import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
	public static void main (String[]args) throws IOException{
		
	  Socket socket= new Socket("Localhost",4000);
	  Scanner sc = new Scanner(System.in);
	  PrintStream saida = new PrintStream(socket.getOutputStream());
	  saida.println(sc.nextLine());
	  
	}

}
