import java.rmi.registry.*;
import java.util.Scanner;

public class HelloClient {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double a, b, c;
		
		try {
			// Procura o registro do RMI no Servidor
			// Se o servidor estiver em outro host basta substituir pelo seu IP
			Registry registry = LocateRegistry.getRegistry("localhost");

			// Procura a stub do servidor
			Hello stub= (Hello) registry.lookup("Servidor");
			
			System.out.println("Vamos calcular a f�rmula de BH�SKARA...");
			
			System.out.println("Digite o valor de A: "); // Solicitando valor de A
	        a = Double.parseDouble(ler.next());
			
	        System.out.println("Digite o valor de B: ");  // Solicitando valor de B
	        b = Double.parseDouble(ler.next());
	        
	        System.out.println("Digite o valor de C: ");  // Solicitando valor de C
	        c = Double.parseDouble(ler.next());
	        ler.close();
			
			// Chama o m�todo do servidor e imprime a mensagem
			System.out.println("Invocando metodo do servidor");
			double delta = stub.hello(a, b, c);
			System.out.println("O valor de Delta �: " +delta); 
		    
		} catch (Exception ex) {
			ex.printStackTrace();
		} 
	}
}

