import java.util.Arrays;
import java.util.Comparator;

public class CreateCasesByDate {
    GetVariables csvToArray = new GetVariables();
    String[] data = csvToArray.readDataToArray();

    Comparator<String> comparadorDataCompletaCrescente = Comparator.comparing((String str) -> {
        String[] partesData = str.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1)[3].split(" ")[0].split("/");
        return Integer.parseInt(partesData[2]) * 10000 + Integer.parseInt(partesData[1]) * 100 + Integer.parseInt(partesData[0]);
    });
    Comparator<String> comparadorDataCompletaDecrescente = Comparator.comparing((String str) -> {
        String[] partesData = str.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1)[3].split(" ")[0].split("/");
        return Integer.parseInt(partesData[2]) * 10000 + Integer.parseInt(partesData[1]) * 100 + Integer.parseInt(partesData[0]);
    }).reversed();

    public String[] bestCase() {
        String[] dataTransforming = Arrays.copyOf(data, data.length);
        Arrays.sort(dataTransforming, comparadorDataCompletaCrescente);
        return dataTransforming;
    }
    public String[] mediumCase() {
        return data;
    }
    public String[] worstCase() {
        String[] dataTransforming = Arrays.copyOf(data, data.length);
        Arrays.sort(dataTransforming, comparadorDataCompletaDecrescente);
        return dataTransforming;
    }
}
