package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		String[] lines = new String[] {"Bom dia", "Boa tarde", "Boa noite"};

		String path = "C:\\temp\\teste.txt";

		/* 
		* Acrescenta informações ao arquivo.
		* 
		* Para apenas criar/recriar um aquivo basta retirar o true:
		* BufferedWriter bw = new BufferedWriter(new FileWriter(path))
		**/
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
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
