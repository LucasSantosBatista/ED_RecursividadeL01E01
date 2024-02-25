package view;

import controller.NaturalController;

public class Main {
	public static void main(String[] args) {
		int num = 10;
		
		NaturalController nCont = new NaturalController();
		int soma = nCont.somaNatural(num);
		System.out.println("Quantidade: " + num + " números naturais | Somatória: " + soma);
	}
}
