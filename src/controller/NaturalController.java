package controller;

public class NaturalController {
	public NaturalController() {
		super();
	}
	
	public int somaNatural(int num) {
		if (num < 0) {
			//Condição de parada: contagem está abaixo de zero (não é mais natural).
			return 0;
		} else {
			//Exibe teste
			System.out.println(num);
			
			//Recursiva somando total + (total - 1)
			return num + somaNatural(num - 1);
		}
	}
}
