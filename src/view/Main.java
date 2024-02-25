package view;

import controller.NaturalController;

public class Main {
	public static void main(String[] args) {
		//Quantidade de números naturais
		int num = 10;
		
		//Definindo a classe de metodos
		NaturalController nCont = new NaturalController();
		
		//Leva variável pela função, retorna e exibe 
		int soma = nCont.somaNatural(num);
		System.out.println("Quantidade: " + num + " números naturais | Somatória: " + soma);
	}
}
