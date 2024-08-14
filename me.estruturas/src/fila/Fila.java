package fila;

public class Fila {
	
	private Node comecoFila;
	private Node fimFila;
	
	
	public void enfileirar(Integer valor) {
		if(estaVazia()) {
			Node novoNo = new Node(valor);
			comecoFila = fimFila = novoNo;
		}else {
			Node novoNo = new Node(valor);
			fimFila.setAnterior(novoNo);
			fimFila = novoNo;
		}
	}
	 public Integer desenfileirar() {
		 if(estaVazia()) {
			 return null;
		 }else {
			 Integer valor = comecoFila.getValor();
			 comecoFila = comecoFila.getAnterior();
			 return valor;			 
		 }
	}
	
	
	public boolean estaVazia() {
		return comecoFila == null;
	}
	
	 public String toString() {
	        StringBuilder stringBuilder = new StringBuilder("Fila: ");
	        Node current = comecoFila;
	        while (current != null) {
	            stringBuilder.append(current.getValor()).append(" ");
	            current = current.getAnterior();
	        }
	        return stringBuilder.toString();

	    }

}
