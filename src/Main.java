public class Main {

    public static void main(String[] args) {
         PasswordClassifier classifier = new PasswordClassifier();
         classifier.classifyPasswords("dataset/passwords.csv", "dataset/password_classifier.csv");

         PasswordDateFormatter formatter = new PasswordDateFormatter();
         formatter.formatDates("dataset/password_classifier.csv", "dataset/passwords_formated_data.csv");

        PasswordClassifierFilter filterClassifier = new PasswordClassifierFilter();
        filterClassifier.filterPasswords("dataset/password_classifier.csv", "dataset/passwords_classifier.csv");


    }
}
