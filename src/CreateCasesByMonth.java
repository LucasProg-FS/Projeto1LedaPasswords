import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class CreateCasesByMonth {
    String[] data = readDataToArray();


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
    public  String[] mediumCase() {
        return data;
    }
    public String[] worstCase() {
        String[] dataTransforming = Arrays.copyOf(data, data.length);
        Arrays.sort(dataTransforming, comparadorMesDataDecrescente);
        return dataTransforming;
    }

    public String[] readDataToArray() {
        try (BufferedReader br = new BufferedReader(new FileReader("dataset/passwords_test.csv"))) {
            br.readLine();

            int numLines = 0;
            String line;
            while ((line = br.readLine()) != null) {
                numLines++;
            }

            String[] dataArray = new String[numLines];

            br.close();

            BufferedReader br2 = new BufferedReader(new FileReader("dataset/passwords_test.csv"));

            br2.readLine();

            int index = 0;
            while ((line = br2.readLine()) != null) {
                dataArray[index++] = line;
            }

            return dataArray;
        } catch (IOException e) {
            e.printStackTrace();
            return new String[0];
        }
    }
}
