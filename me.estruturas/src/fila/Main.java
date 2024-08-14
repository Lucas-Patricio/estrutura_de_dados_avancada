package fila;

public class Main {

	public static void main(String[] args) {
		
		Fila fila = new Fila();
		
		fila.enfileirar(2);
		fila.enfileirar(3);
		fila.enfileirar(4);
		
		System.out.println(fila);
		
		System.out.println(fila.desenfileirar());
		
		System.out.println(fila.desenfileirar());
		
		System.out.println(fila);
		
		System.out.println(fila.desenfileirar());
		
		System.out.println(fila.desenfileirar());

	}

}
