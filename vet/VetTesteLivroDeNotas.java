package vet;

public class VetTesteLivroDeNotas {

	public static void main(String[] args) {
		LivroDeNotas livro = new LivroDeNotas("Programação", 5);
		
		livro.gerarNotas();
		
		livro.calcularMedias();
		
		livro.mostrarMedias();
	}

}
