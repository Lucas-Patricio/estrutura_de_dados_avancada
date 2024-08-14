package mergeSort;

public class MergeSort {

    public void mergeSort(int[] vetor, int inicio, int fim) {
        if (inicio >= fim) {
            return;
        } else {
            int meio = (inicio + fim) / 2;
            mergeSort(vetor, inicio, meio);
            mergeSort(vetor, meio + 1, fim);

            merge(vetor, inicio, meio, fim);
        }
        //
    }

    public void merge(int[] vetor, int inicio, int meio, int fim) {

        int[] auxiliar = new int[vetor.length];


        for (int i = inicio; i <= fim; i++) {
            auxiliar[i-inicio] = vetor[i];
        }

        int i = 0;
        int j = meio - inicio + 1;
        int k = inicio;

        while (i <= meio - inicio && j <= fim - inicio) {
            if (auxiliar[i] <= auxiliar[j]) {
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

