package pilha;

public class Node {

	private Integer valor;
	private Node abaixo;
	
	public Node(Integer valor) {
		this.valor = valor;
		this.abaixo = null;
	}
	
	
	public Integer getValor() {
		return valor;
	}
	public void setValor(Integer valor) {
		this.valor = valor;
	}
	public Node getAbaixo() {
		return abaixo;
	}
	public void setAbaixo(Node abaixo) {
		this.abaixo = abaixo;
	}
	
	
}
