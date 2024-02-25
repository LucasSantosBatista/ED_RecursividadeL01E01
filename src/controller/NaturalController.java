package controller;

public class NaturalController {
	public NaturalController() {
		super();
	}
	
	public int somaNatural(int num) {
		if (num < 0) {
			return 0;
		} else {
			System.out.println(num);
			return num + somaNatural(num - 1);
		}
	}
}
