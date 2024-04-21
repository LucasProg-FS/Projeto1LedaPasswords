import java.util.Arrays;
import java.util.Comparator;

public class CreateCasesByDate {
    GetVariables csvToArray = new GetVariables();
    String[] data = csvToArray.readDataToArray();

    Comparator<String> comparatorDateCrescent = Comparator.comparing((String str) -> {
        String[] piecesDate = str.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1)[3].split(" ")[0].split("/");
        return Integer.parseInt(piecesDate[2]) * 10000 + Integer.parseInt(piecesDate[1]) * 100 + Integer.parseInt(piecesDate[0]);
    });
    Comparator<String> comparatorDateDecreasing = Comparator.comparing((String str) -> {
        String[] piecesDate = str.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1)[3].split(" ")[0].split("/");
        return Integer.parseInt(piecesDate[2]) * 10000 + Integer.parseInt(piecesDate[1]) * 100 + Integer.parseInt(piecesDate[0]);
    }).reversed();

    public String[] bestCase() {
        String[] dataTransforming = Arrays.copyOf(data, data.length);
        Arrays.sort(dataTransforming, comparatorDateCrescent);
        return dataTransforming;
    }
    public String[] mediumCase() {
        return data;
    }
    public String[] worstCase() {
        String[] dataTransforming = Arrays.copyOf(data, data.length);
        Arrays.sort(dataTransforming, comparatorDateDecreasing);
        return dataTransforming;
    }
}
