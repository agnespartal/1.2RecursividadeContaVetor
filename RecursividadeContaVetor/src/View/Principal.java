package View;

import Controller.VetorNegativo;

public class Principal {

	public static void main(String[] args) {
		
		int [] vetor = {1,2,3,-4,5,-6,7,-8,9};
		int tamanho = vetor.length;
		
		VetorNegativo v = new VetorNegativo();
		
		int contaVetor = v.vetNegativo(vetor, tamanho);
		System.out.println(contaVetor);
		
	}

}
