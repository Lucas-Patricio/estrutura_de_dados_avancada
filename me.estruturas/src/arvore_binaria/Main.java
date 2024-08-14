package arvore_binaria;

public class Main {

	public static void main(String[] args) {
		
		 ArvoreBinaria arvore = new ArvoreBinaria();

	        
	        arvore.inserir(20);
	        arvore.inserir(15);
	        arvore.inserir(64);
	        arvore.inserir(25);
	        arvore.inserir(13);
	        arvore.inserir(5);
	        arvore.inserir(9);

	        System.out.println("Percurso em ordem da árvore binária:");
	        arvore.emOrdem();

	}

}
