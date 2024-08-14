package pilha;

public class Pilha {
	
	private Node topo;
	
	public void empilhar(Integer valor) {
		if(estaVazia()) {
			topo = new Node(valor); //se a pilha está vazia, o topo vai ser esse valor adicionado
		}else {
			Node novoNo = new Node(valor); //cria um novoNó para a pilha
			novoNo.setAbaixo(topo); //diz que o topo vai estar abaixo do novoNó
			topo = novoNo;  // o novo topo agora vai ser o novoNo
		}
	}
		
	public Integer desempilhar() {
		if(estaVazia()) {
			return null;
		}
		else {
			Integer valor = topo.getValor();
			topo = topo.getAbaixo();
			return valor;
		}
	}
	
	public boolean estaVazia() {
		return topo == null;
	}
	
	 @Override
	    public String toString() {
	        StringBuilder stringBuilder = new StringBuilder("Pilha: ");
	        Node atual = topo;
	        while (atual != null){
	            stringBuilder.append(atual.getValor()).append(" ");
	            atual = atual.getAbaixo();
	        }
	        return stringBuilder.toString();
	    }	

}
