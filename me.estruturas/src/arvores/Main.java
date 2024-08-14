package arvores;

public class Main {

	public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        // Insere alguns nós
        arvore.inserir(50);
        arvore.inserir(30);
        arvore.inserir(20);
        arvore.inserir(40);
        arvore.inserir(70);
        arvore.inserir(60);
        arvore.inserir(80);

        // Imprime a travessia em ordem da árvore
        System.out.println("Travessia em ordem:");
        arvore.emOrdem();
        
        System.out.println();
        // Saída: 20 30 40 50 60 70 80

        // Busca uma chave
        arvore.inverter();

        // Imprime a travessia em ordem da árvore invertida
        System.out.println("\nTravessia em ordem da árvore invertida:");
        arvore.emOrdem(); // Saída: 80 70 60 50 40 30 20
    }
}


