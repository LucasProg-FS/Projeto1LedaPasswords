import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class CreateCasesByLength {

    String[] data = readDataToArray();


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
    public  String[] mediumCase() {
        return data;
    }
    public String[] worstCase() {
        String[] dataTransforming = Arrays.copyOf(data, data.length);
        Arrays.sort(dataTransforming, comparadorTamanhoSenhaCrescente);
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
