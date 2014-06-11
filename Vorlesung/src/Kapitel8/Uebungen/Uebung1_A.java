package Kapitel8.Uebungen;

import java.io.FileWriter;
import java.io.IOException;

public class Uebung1_A {

	public static void main(String[] args) throws IOException{

		FileWriter datei;
		String text = "";


			datei = new FileWriter("/ProgBsp/ausgabe.txt");

			

			for (int i = 1; i <= 100; i++) {
				text += i;
				text += "\n";
			}
			datei.write(text, 0, text.length());
			datei.flush();

	}

}
