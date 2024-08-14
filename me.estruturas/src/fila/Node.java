package fila;

public class Node {
	
	private Integer valor;
	private Node anterior;
	
	public Node(Integer valor){
		this.valor = valor;
		this.anterior = null;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public Node getAnterior() {
		return anterior;
	}

	public void setAnterior(Node anterior) {
		this.anterior = anterior;
	}
	
	

}
