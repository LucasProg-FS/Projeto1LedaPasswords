import java.util.Arrays;
import java.util.Comparator;

public class CreateCasesByLength {
    GetVariables csvToArray = new GetVariables();
    String[] data = csvToArray.readDataToArray();

    Comparator<String> comparadorTamanhoSenhaCrescente = Comparator.comparingInt((String str) -> {
        if (str == null) {
            return 0; // Ou algum outro valor padrão, dependendo do seu requisito
        }
        String[] partes = str.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
        if (partes.length < 3) {
            return 0; // Ou algum outro valor padrão, dependendo do seu requisito
        }
        return Integer.parseInt(partes[2]);
    });
    Comparator<String> comparadorTamanhoSenhaDecrescente = Comparator.comparingInt((String str) -> {
        if (str == null) {
            return 0;
        }
        String[] partes = str.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
        if (partes.length < 3) {
            return 0;
        }
        return Integer.parseInt(partes[2]);
    }).reversed();

    public String[] bestCase() {
        String[] dataTransforming = Arrays.copyOf(data, data.length);
        Arrays.sort(dataTransforming, comparadorTamanhoSenhaDecrescente);
        return dataTransforming;
    }
    public String[] mediumCase() {
        return data;
    }
    public String[] worstCase() {
        String[] dataTransforming = Arrays.copyOf(data, data.length);
        Arrays.sort(dataTransforming, comparadorTamanhoSenhaCrescente);
        return dataTransforming;
    }

}
