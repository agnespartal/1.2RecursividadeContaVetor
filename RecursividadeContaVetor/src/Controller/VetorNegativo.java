package Controller;

public class VetorNegativo {

	public VetorNegativo() {
		super();
	}

	public int vetNegativo(int [] vetor, int tamanho) {
		
		int cont = 0;
		
		if (tamanho == 0) {
			return 0;
		} else {
			int ultimaPosicao = tamanho - 1;
			int valor = vetor[ultimaPosicao];
			tamanho = tamanho - 1;
				if (valor < 0) {
					cont++;
				}
			return cont + vetNegativo(vetor, tamanho);
		}
	}
}
