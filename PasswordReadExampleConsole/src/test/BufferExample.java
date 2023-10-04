package test;

import java.io.Console;
import java.io.IOException;

public class BufferExample {
	// Executar no console
	public static void main(String[] args) throws IOException {
		Console console = System.console();
		if (console != null) {
			while (true) {
				// Forma 1 - permitindo exibir o caractere no console
				// char[] buffer = console.readLine().toCharArray();
				
				// Forma 2 - proibindo exibir o caractere no console
				char[] buffer = console.readPassword("\nEnter password: ");
				
				// Substituindo todos os caracteres por 'x'
				char[] passphrase = new String(buffer).toCharArray();
				for (int i = 0; i < buffer.length; i++) {
					passphrase[i] = 'x';
				}
				console.format("Passphrased..: %s%n", new String(passphrase));
				console.format("Original.....: %s%n%n%n", new String(buffer));
			}
		}
	}

}
