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

        System.out.println("Inicializando ordenações...\n\n");

        System.out.println("SelectionSort P/ Tamanho da Senha:");
        selectionSort.length(bestCaseByLength, "melhor caso");
        selectionSort.length(mediumCaseByLength, "médio caso");
        selectionSort.length(worstCaseByLength, "pior caso");

        System.out.println("\nInsertionSort P/ Tamanho da Senha:");
        insertionSort.length(bestCaseByLength, "melhor caso");
        insertionSort.length(mediumCaseByLength, "médio caso");
        insertionSort.length(worstCaseByLength, "pior caso");


        System.out.println("\nSelectionSort P/ Mês:");
        selectionSort.month(bestCaseByMonth, "melhor caso");
        selectionSort.month(mediumCaseByMonth, "médio caso");
        selectionSort.month(worstCaseByMonth, "pior caso");

        System.out.println("\nInsertionSort P/ Mês:");
        insertionSort.month(bestCaseByMonth, "melhor caso");
        insertionSort.month(mediumCaseByMonth, "médio caso");
        insertionSort.month(worstCaseByMonth, "pior caso");

        System.out.println("\nSelectionSort P/ Data:");
        selectionSort.date(bestCaseByDate, "melhor caso");
        selectionSort.date(mediumCaseByDate, "médio caso");
        selectionSort.date(worstCaseByDate, "pior caso");

        System.out.println("\nInsertionSort P/ Data:");
        insertionSort.date(bestCaseByDate, "melhor caso");
        insertionSort.date(mediumCaseByDate, "médio caso");
        insertionSort.date(worstCaseByDate, "pior caso");
    }
}
