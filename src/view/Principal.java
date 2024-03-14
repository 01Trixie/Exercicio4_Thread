package view;

import controller.SapoTestar;

public class Principal {

	public static void main(String[] args) {
		
		int vet[] = new int[5];
		
		for(int i = 0; i < 5; i++) {
			Thread Sapo = new SapoTestar();
			Sapo.start();
		}

	}

}
