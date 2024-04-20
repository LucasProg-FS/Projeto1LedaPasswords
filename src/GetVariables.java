public class GetVariables {

    public int getTamanhoSenha(String str) {
        int startIndex = str.lastIndexOf('"') + 2;
        int endIndex = str.indexOf(',', startIndex);
        if (startIndex > 0 && endIndex > startIndex) {
            return Integer.parseInt(str.substring(startIndex, endIndex));
        }
        return 0;

    }

    public static int getMesData(String str) {
        String[] partesData = str.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1)[3].split(" ")[0].split("/");
        if (partesData.length >= 2) {
            return Integer.parseInt(partesData[1]);
        }
        return 0;
    }

    public int getDataCompleta(String str) {
        String[] partesData = str.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1)[3].split(" ")[0].split("/");
        return Integer.parseInt(partesData[2]) * 10000 + Integer.parseInt(partesData[1]) * 100 + Integer.parseInt(partesData[0]);
    }
}
