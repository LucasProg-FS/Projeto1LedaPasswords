import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PasswordClassifierFilter {

    public void filterPasswords(String inputFile, String outputFile) {
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
                if (data.length >= 5 && (data[4].equals("Boa") || data[4].equals("Muito Boa"))) { // Verifica se há dados suficientes na linha e se a classificação é "Boa" ou "Muito Boa"
                    // Escrever no novo arquivo CSV
                    writer.append(line);
                    writer.append("\n");
                }
            }

            System.out.println("Filtragem concluída. Novo arquivo gerado: " + outputFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
