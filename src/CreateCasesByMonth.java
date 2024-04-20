import java.util.Arrays;
import java.util.Comparator;

public class CreateCasesByMonth {
    GetVariables csvToArray = new GetVariables();
    String[] data = csvToArray.readDataToArray();

    Comparator<String> comparadorMesDataCrescente = Comparator.comparingInt((String str) -> {
        String[] partesData = str.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1)[3].split("/");
        return Integer.parseInt(partesData[1]);
    });
    Comparator<String> comparadorMesDataDecrescente = Comparator.comparingInt((String str) -> {
        String[] partesData = str.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1)[3].split("/");
        return Integer.parseInt(partesData[1]);
    }).reversed();

    public String[] bestCase() {
        String[] dataTransforming = Arrays.copyOf(data, data.length);
        Arrays.sort(dataTransforming, comparadorMesDataCrescente);
        return dataTransforming;
    }
    public String[] mediumCase() {
        return data;
    }
    public String[] worstCase() {
        String[] dataTransforming = Arrays.copyOf(data, data.length);
        Arrays.sort(dataTransforming, comparadorMesDataDecrescente);
        return dataTransforming;
    }

}
