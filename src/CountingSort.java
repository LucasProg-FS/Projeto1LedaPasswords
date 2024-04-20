public class CountingSort {
    CreateFileCsv create = new CreateFileCsv();

    public void length(String[] data, String nameCase) {
        GetVariables v = new GetVariables();
        String[] copiaDados = data.clone();

        long startTime = System.nanoTime();

        countingSortLength(copiaDados, v);

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;

        System.out.println("Tempo de execução Counting Sort p/ o " + nameCase + ": " + duration + " milissegundos");
        String filename = "";

        if (nameCase.equals("melhor caso")) {
            filename = "dataset/passwords_length_countingSort_melhorCaso.csv";
        } else if (nameCase.equals("médio caso")) {
            filename = "dataset/passwords_length_countingSort_medioCaso.csv";
        } else {
            filename = "dataset/passwords_length_countingSort_piorCaso.csv";
        }

        create.createCsv(copiaDados, filename);
    }

    private void countingSortLength(String[] array, GetVariables v) {
        int n = array.length;
        String[] saida = new String[n];

        int[] contagem = new int[n];

        for (int i = 0; i < n; ++i)
            contagem[i] = 0;

        for (int i = 0; i < n; ++i)
            contagem[v.getTamanhoSenha(array[i])]++;

        for (int i = 1; i < n; ++i)
            contagem[i] += contagem[i - 1];

        for (int i = n - 1; i >= 0; i--) {
            saida[n - contagem[v.getTamanhoSenha(array[i])]] = array[i];
            contagem[v.getTamanhoSenha(array[i])]--;
        }

        for (int i = 0; i < n; ++i)
            array[i] = saida[i];
    }


    // -----------------------------------------------------------

    public void month(String[] data, String nameCase) {
        GetVariables v = new GetVariables();
        String[] copiaDados = data.clone();

        long startTime = System.nanoTime();

        countingSortMonth(copiaDados, v);

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;

        System.out.println("Tempo de execução Counting Sort p/ o " + nameCase + ": " + duration + " milissegundos");
        String filename = "";

        if (nameCase.equals("melhor caso")) {
            filename = "dataset/passwords_data_month_countingSort_melhorCaso.csv";
        } else if (nameCase.equals("médio caso")) {
            filename = "dataset/passwords_data_month_countingSort_medioCaso.csv";
        } else {
            filename = "dataset/passwords_data_month_countingSort_piorCaso.csv";
        }

        create.createCsv(copiaDados, filename);
    }

    private void countingSortMonth(String[] array, GetVariables v) {
        int n = array.length;
        String[] saida = new String[n];

        int[] contagem = new int[n];

        for (int i = 0; i < n; ++i)
            contagem[i] = 0;

        for (int i = 0; i < n; ++i)
            contagem[v.getMesData(array[i])]++;

        for (int i = 1; i < n; ++i)
            contagem[i] += contagem[i - 1];

        for (int i = n - 1; i >= 0; i--) {
            saida[contagem[v.getMesData(array[i])] - 1] = array[i];
            contagem[v.getMesData(array[i])]--;
        }

        for (int i = 0; i < n; ++i)
            array[i] = saida[i];
    }

    //-----------------------------------------------------------------------

    public void date(String[] data, String nameCase) {
        GetVariables v = new GetVariables();
        String[] copiaDados = data.clone();

        long startTime = System.nanoTime();

        countingSortDate(copiaDados, v);

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;

        System.out.println("Tempo de execução Counting Sort p/ o " + nameCase + ": " + duration + " milissegundos");
        String filename = "";

        if (nameCase.equals("melhor caso")) {
            filename = "dataset/passwords_data_countingSort_melhorCaso.csv";
        } else if (nameCase.equals("médio caso")) {
            filename = "dataset/passwords_data_countingSort_medioCaso.csv";
        } else {
            filename = "dataset/passwords_data_countingSort_piorCaso.csv";
        }

        create.createCsv(copiaDados, filename);
    }

    private void countingSortDate(String[] array, GetVariables v) {
        int n = array.length;
        String[] saida = new String[n];

        int[] contagem = new int[10000000]; // Aumentando o tamanho do array de contagem

        for (int i = 0; i < n; ++i)
            contagem[i] = 0;

        for (int i = 0; i < n; ++i)
            contagem[v.getDataCompleta(array[i]) - 20150101]++;

        for (int i = 1; i < 10000000; ++i) // Ajustando a condição de iteração
            contagem[i] += contagem[i - 1];

        for (int i = n - 1; i >= 0; i--) {
            saida[contagem[v.getDataCompleta(array[i]) - 20150101] - 1] = array[i];
            contagem[v.getDataCompleta(array[i]) - 20150101]--;
        }

        for (int i = 0; i < n; ++i)
            array[i] = saida[i];
    }





}
