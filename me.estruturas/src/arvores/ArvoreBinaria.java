package arvores;

public class ArvoreBinaria {
    private No raiz;
    
    
    

    public ArvoreBinaria() {
        raiz = null;
    }

    
    public void inserir(int chave) {
        raiz = inserirRec(raiz, chave);
    }

    
    private No inserirRec(No raiz, int chave) {
      
        if (raiz == null) {
            raiz = new No(chave);
            return raiz;
        }

        
        if (chave < raiz.getChave())
            raiz.setEsquerdo(inserirRec(raiz.getEsquerdo(), chave));
        else if (chave > raiz.getChave())
            raiz.setDireito(inserirRec(raiz.getDireito(), chave));

       
        return raiz;
    }

   
    public void emOrdem() {
        emOrdemRec(raiz);
    }

    
    private void emOrdemRec(No raiz) {
        if (raiz != null) {
            emOrdemRec(raiz.getEsquerdo());
            System.out.print(raiz.getChave() + " ");
            emOrdemRec(raiz.getDireito());
        }
    }
    
    public void inverter() {
        raiz = inverterRec(raiz);
    }
    
    private No inverterRec(No raiz) {
        if (raiz == null) {
            return null;
        }

       
        No temporario = raiz.getEsquerdo();
        raiz.setEsquerdo(raiz.getDireito());
        raiz.setDireito(temporario);

        
        inverterRec(raiz.getEsquerdo());
        inverterRec(raiz.getDireito());

        return raiz;
    }

    
    public boolean buscar(int chave) {
        return buscarRec(raiz, chave);
    }

   
    private boolean buscarRec(No raiz, int chave) {
        if (raiz == null)
            return false;

        if (raiz.getChave() == chave)
            return true;

        if (chave < raiz.getChave())
            return buscarRec(raiz.getEsquerdo(), chave);
        else
            return buscarRec(raiz.getDireito(), chave);
    }

   
    public int encontrarMinimo() {
        return encontrarMinimoRec(raiz);
    }

   
    private int encontrarMinimoRec(No raiz) {
        if (raiz == null)
            throw new IllegalStateException("Árvore está vazia");

        if (raiz.getEsquerdo() == null)
            return raiz.getChave();

        return encontrarMinimoRec(raiz.getEsquerdo());
    }

   
    public int encontrarMaximo() {
        return encontrarMaximoRec(raiz);
    }

    
    private int encontrarMaximoRec(No raiz) {
        if (raiz == null)
            throw new IllegalStateException("Árvore está vazia");

        if (raiz.getDireito() == null)
            return raiz.getChave();

        return encontrarMaximoRec(raiz.getDireito());
    }
    
}