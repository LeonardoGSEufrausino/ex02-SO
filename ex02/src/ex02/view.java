package ex02;

import java.util.Scanner;

public class view {

	public static void main(String[] args) {
		Controller controle = new Controller();
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um texto: ");
		String texto = scanner.nextLine();
		
		scanner.close();
		System.out.println(controle.separadorDeTexto(texto));
	}

}