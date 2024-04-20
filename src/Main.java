public class Main {

    public static void main(String[] args) {
        PasswordClassifier classifier = new PasswordClassifier();
        classifier.classifyPasswords("dataset/passwords.csv", "dataset/password_classifier.csv");

        PasswordDateFormatter formatter = new PasswordDateFormatter();
        formatter.formatDates("dataset/password_classifier.csv", "dataset/passwords_formated_data.csv");

        PasswordClassifierFilter filterClassifier = new PasswordClassifierFilter();
        filterClassifier.filterPasswords("dataset/password_classifier.csv", "dataset/passwords_classifier.csv");

        CreateCasesByLength byLength = new CreateCasesByLength();

        String[] bestCaseByLength = byLength.bestCase();
        String[] mediumCaseByLength = byLength.mediumCase();
        String[] worstCaseByLength = byLength.worstCase();

        CreateCasesByMonth byMonth = new CreateCasesByMonth();

        String[] bestCaseByMonth = byMonth.bestCase();
        String[] mediumCaseByMonth = byMonth.mediumCase();
        String[] worstCaseByMonth = byMonth.worstCase();

        CreateCasesByDate byDate= new CreateCasesByDate();

        String[] bestCaseByDate = byDate.bestCase();
        String[] mediumCaseByDate = byDate.mediumCase();
        String[] worstCaseByDate = byDate.worstCase();

        System.out.println("\n\nCasos criados");

        SelectionSort selectionSort = new SelectionSort();
        InsertionSort insertionSort = new InsertionSort();
        QuickSort quickSort = new QuickSort();
        MergeSort mergeSort = new MergeSort();
        CountingSort countingSort = new CountingSort();
        HeapSort heapSort = new HeapSort();
        QuickSortMedianaTres quickSortMedianaTres = new QuickSortMedianaTres();

        System.out.println("Inicializando ordenações...\n\n");

        System.out.println("-----------ANALISE A PARTIR DO TAMANHO DA SENHA-----------\n");

        System.out.println("SelectionSort P/ Tamanho da Senha:");
        selectionSort.length(bestCaseByLength, "melhor caso");
        selectionSort.length(mediumCaseByLength, "médio caso");
        selectionSort.length(worstCaseByLength, "pior caso");

        System.out.println("\nInsertionSort P/ Tamanho da Senha:");
        insertionSort.length(bestCaseByLength, "melhor caso");
        insertionSort.length(mediumCaseByLength, "médio caso");
        insertionSort.length(worstCaseByLength, "pior caso");

        System.out.println("\nQuickSort P/ Tamanho da Senha:");
        quickSort.length(bestCaseByLength, "melhor caso");
        quickSort.length(mediumCaseByLength, "médio caso");
        quickSort.length(worstCaseByLength, "pior caso");

        System.out.println("\nMergeSort P/ Tamanho da Senha:");
        mergeSort.length(bestCaseByLength, "melhor caso");
        mergeSort.length(mediumCaseByLength, "médio caso");
        mergeSort.length(worstCaseByLength, "pior caso");

        System.out.println("\nCountingSort P/ Tamanho da Senha:");
        countingSort.length(bestCaseByLength, "melhor caso");
        countingSort.length(mediumCaseByLength, "médio caso");
        countingSort.length(worstCaseByLength, "pior caso");

        System.out.println("\nHeapSort P/ Tamanho da Senha:");
        heapSort.length(bestCaseByLength, "melhor caso");
        heapSort.length(mediumCaseByLength, "médio caso");
        heapSort.length(worstCaseByLength, "pior caso");

        System.out.println("\nQuickSort com Mediana 3 P/ Tamanho da Senha:");
        quickSortMedianaTres.length(bestCaseByLength, "melhor caso");
        quickSortMedianaTres.length(mediumCaseByLength, "médio caso");
        quickSortMedianaTres.length(worstCaseByLength, "pior caso");

        System.out.println("\n-----------------ANALISE A PARTIR DO MÊS-----------------");

        System.out.println("\nSelectionSort P/ Mês:");
        selectionSort.month(bestCaseByMonth, "melhor caso");
        selectionSort.month(mediumCaseByMonth, "médio caso");
        selectionSort.month(worstCaseByMonth, "pior caso");

        System.out.println("\nInsertionSort P/ Mês:");
        insertionSort.month(bestCaseByMonth, "melhor caso");
        insertionSort.month(mediumCaseByMonth, "médio caso");
        insertionSort.month(worstCaseByMonth, "pior caso");

        System.out.println("\nQuickSort P/ Mês:");
        quickSort.month(bestCaseByMonth, "melhor caso");
        quickSort.month(mediumCaseByMonth, "médio caso");
        quickSort.month(worstCaseByMonth, "pior caso");

        System.out.println("\nMergeSort P/ Mês:");
        mergeSort.month(bestCaseByMonth, "melhor caso");
        mergeSort.month(mediumCaseByMonth, "médio caso");
        mergeSort.month(worstCaseByMonth, "pior caso");

        System.out.println("\nCountingSort P/ Mês:");
        countingSort.month(bestCaseByMonth, "melhor caso");
        countingSort.month(mediumCaseByMonth, "médio caso");
        countingSort.month(worstCaseByMonth, "pior caso");

        System.out.println("\nHeapSort P/ Mês:");
        heapSort.month(bestCaseByMonth, "melhor caso");
        heapSort.month(mediumCaseByMonth, "médio caso");
        heapSort.month(worstCaseByMonth, "pior caso");

        System.out.println("\nQuickSort com Mediana 3 P/ Mês:");
        quickSortMedianaTres.month(bestCaseByMonth, "melhor caso");
        quickSortMedianaTres.month(mediumCaseByMonth, "médio caso");
        quickSortMedianaTres.month(worstCaseByMonth, "pior caso");

        System.out.println("\n-----------------ANALISE A PARTIR DA DATA-----------------");

        System.out.println("\nSelectionSort P/ Data:");
        selectionSort.date(bestCaseByDate, "melhor caso");
        selectionSort.date(mediumCaseByDate, "médio caso");
        selectionSort.date(worstCaseByDate, "pior caso");

        System.out.println("\nInsertionSort P/ Data:");
        insertionSort.date(bestCaseByDate, "melhor caso");
        insertionSort.date(mediumCaseByDate, "médio caso");
        insertionSort.date(worstCaseByDate, "pior caso");

        System.out.println("\nQuickSort P/ Data:");
        quickSort.date(bestCaseByDate, "melhor caso");
        quickSort.date(mediumCaseByDate, "médio caso");
        quickSort.date(worstCaseByDate, "pior caso");

        System.out.println("\nMergeSort P/ Data:");
        mergeSort.date(bestCaseByDate, "melhor caso");
        mergeSort.date(mediumCaseByDate, "médio caso");
        mergeSort.date(worstCaseByDate, "pior caso");

        System.out.println("\nCountingSort P/ Data:");
        countingSort.date(bestCaseByDate, "melhor caso");
        countingSort.date(mediumCaseByDate, "médio caso");
        countingSort.date(worstCaseByDate, "pior caso");

        System.out.println("\nHeapSort P/ Data:");
        heapSort.date(bestCaseByDate, "melhor caso");
        heapSort.date(mediumCaseByDate, "médio caso");
        heapSort.date(worstCaseByDate, "pior caso");


        System.out.println("\nQuickSort com Mediana 3 P/ Data:");
        quickSortMedianaTres.date(bestCaseByDate, "melhor caso");
        quickSortMedianaTres.date(mediumCaseByDate, "médio caso");
        quickSortMedianaTres.date(worstCaseByDate, "pior caso");
    }
}
