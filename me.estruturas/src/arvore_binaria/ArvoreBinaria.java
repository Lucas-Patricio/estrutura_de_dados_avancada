package arvore_binaria;

public class ArvoreBinaria {
	private No raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(int valor) {
        raiz = inserirRec(raiz, valor);
    }

    private No inserirRec(No raiz, int valor) {
        if (raiz == null) {
            raiz = new No(valor);
            return raiz;
        }

        if (valor < raiz.getValor())
            raiz.setEsquerdo(inserirRec(raiz.getEsquerdo(), valor));
        else if (valor > raiz.getValor())
            raiz.setDireito(inserirRec(raiz.getDireito(), valor));

        return raiz;
    }

    public void emOrdem() {
        emOrdemRec(raiz);
    }

    private void emOrdemRec(No raiz) {
        if (raiz != null) {
            emOrdemRec(raiz.getEsquerdo());
            System.out.print(raiz.getValor() + " ");
            emOrdemRec(raiz.getDireito());
        }
    }

}
