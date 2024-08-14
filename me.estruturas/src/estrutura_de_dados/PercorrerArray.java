package estrutura_de_dados;

public class PercorrerArray {
	
	private static void lerLista(int[] lista, int numeroDesejado) {
		
		boolean ta_na_lista = false;
		
		for(int i = 0; i < lista.length; i++)
			if(lista[i] == numeroDesejado) {
				System.out.println("O numero digitado foi: "+ numeroDesejado + " e está na posição: " + i);
				ta_na_lista = true;
				break;
			}
		if( ta_na_lista == false) {
			System.out.println("O número digitado não está na lista");
		}
	}
	
	public static void main(String[] args) {
		
		int[] lista = {1,3,5,2,7,13};
		int num = 9;
		
		lerLista(lista, num);
		
	}

}
