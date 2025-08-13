package ex02;

public class Controller {
	public int separadorDeTexto(String texto) {
		String[] palavra = texto.split(";");
		int a = 0 ;
		for (int i = 0; i < palavra.length; i++) {
			a = a + 1;
		}
		return a;
	}
}
