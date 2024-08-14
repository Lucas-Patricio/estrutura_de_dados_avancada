package arvore_binaria;

public class No {
	
	private int valor;
    private No esquerdo, direito;

    public No(int item) {
        this.valor = item;
        this.esquerdo = null;
        this.direito = null;
    }

    // Métodos getters e setters para acessar os atributos privados
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public No getEsquerdo() {
        return esquerdo;
    }

    public void setEsquerdo(No esquerdo) {
        this.esquerdo = esquerdo;
    }

    public No getDireito() {
        return direito;
    }

    public void setDireito(No direito) {
        this.direito = direito;
    }

}
