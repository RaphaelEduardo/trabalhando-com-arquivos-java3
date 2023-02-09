package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		String[] lines = new String[] { "Good morning", "Good afternon", "Good night" };

		String path = "C:\\temp\\teste.txt";

		/* 
		* Cria ou recria o arquivo no local passado no path.
		* 
		* Caso não queira recriar o arquivo, apenas acrescentar algo... 
		* basta utilizar na instanciação o "true" da seguinte forma:
		* BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))
		**/
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (String line : lines) {
				// não tem a quebra de linha.
				bw.write(line);
				// para a quebra de linha.
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
