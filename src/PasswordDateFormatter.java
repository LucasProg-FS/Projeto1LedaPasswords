import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PasswordDateFormatter {

    public void formatDates(String inputFile, String outputFile) {
        String line;
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             FileWriter writer = new FileWriter(outputFile)) {


            writer.append(",password,length,date,class\n");


            int lineNumber = -1;
            while ((line = br.readLine()) != null) {
                lineNumber++;
                if (lineNumber == 0) continue;
                String[] data = line.split(csvSplitBy);
                if (data.length >= 4) {
                    String formattedDate = formatDate(data[3]);

                    writer.append(String.valueOf(lineNumber - 1)).append(",").append(String.join(",", data[1], data[2], formattedDate, data[4]));
                    writer.append("\n");
                }
            }

            System.out.println("Formatação de datas concluída. Novo arquivo gerado: " + outputFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String formatDate(String date) {
        String[] parts = date.split(" ");
        if (parts.length < 2) {
            return "";
        }
        String[] datePart = parts[0].split("-");
        if (datePart.length < 3) {
            return "";
        }
        return datePart[2] + "/" + datePart[1] + "/" + datePart[0] + " " + parts[1];
    }

}
