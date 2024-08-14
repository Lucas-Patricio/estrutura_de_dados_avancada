package me.marcos;

public class MergeSort {
	
	public WorldData[] mergeSort(WorldData[] vetor, int inicio, int fim) {
		
        if (inicio < fim) {
        	 int meio = (inicio + fim) / 2;
             mergeSort(vetor, inicio, meio);
             mergeSort(vetor, meio + 1, fim);

             merge(vetor, inicio, meio, fim);
             
        } 
        return vetor;
        
        
        
    }

    public void merge(WorldData[] vetor, int inicio, int meio, int fim) {

        WorldData[] auxiliar = new WorldData[vetor.length];


        for (int i = inicio; i <= fim; i++) {
            auxiliar[i-inicio] = vetor[i];
        }

        int i = 0;
        int j = meio - inicio + 1;
        int k = inicio;

        while (i <= meio - inicio && j <= fim - inicio) {
            if (auxiliar[i].getPlayersOnline() <= auxiliar[j].getPlayersOnline()) {
                vetor[k++] = auxiliar[i++];
            } else {
                vetor[k++] = auxiliar[j++];
            }
        }
        while (i <= meio - inicio) {
            vetor[k++] = auxiliar[i++];
        }
        while (j <= fim - inicio) {
            vetor[k++] = auxiliar[j++];
        }
    }

}
