import java.util.Arrays;
import java.util.Comparator;

public class CreateCasesByLength {
    GetVariables csvToArray = new GetVariables();
    String[] data = csvToArray.readDataToArray();

    Comparator<String> comparatorLengthPasswordCrescent = Comparator.comparingInt((String str) -> {
        if (str == null) {
            return 0;
        }
        String[] pieces = str.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
        if (pieces.length < 3) {
            return 0;
        }
        return Integer.parseInt(pieces[2]);
    });
    Comparator<String> comparatorLengthPasswordDecreasing = Comparator.comparingInt((String str) -> {
        if (str == null) {
            return 0;
        }
        String[] pieces = str.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
        if (pieces.length < 3) {
            return 0;
        }
        return Integer.parseInt(pieces[2]);
    }).reversed();

    public String[] bestCase() {
        String[] dataTransforming = Arrays.copyOf(data, data.length);
        Arrays.sort(dataTransforming, comparatorLengthPasswordDecreasing);
        return dataTransforming;
    }
    public String[] mediumCase() {
        return data;
    }
    public String[] worstCase() {
        String[] dataTransforming = Arrays.copyOf(data, data.length);
        Arrays.sort(dataTransforming, comparatorLengthPasswordCrescent);
        return dataTransforming;
    }

}
