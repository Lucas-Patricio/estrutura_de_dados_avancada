package pilha;

public class Main {

	public static void main(String[] args) {
		
		Pilha pilha = new Pilha();

        pilha.empilhar(5);
        pilha.empilhar(10);
        pilha.empilhar(20);
        pilha.empilhar(50);

        System.out.println("\n"+pilha);

        System.out.println("\n"+pilha.desempilhar());
        System.out.println("\n"+pilha);

        System.out.println("\n"+pilha.desempilhar());
        System.out.println("\n"+pilha.desempilhar());

        System.out.println("\n"+pilha);
		
	}

}
