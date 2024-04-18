import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileDataLoader implements DataLoader {
    private String filePath;
    private String fileContent;
    private String errorMessage = null;

    public FileDataLoader(String filePath) {
        this.filePath = filePath;
        this.fileContent = "";
    }

    @Override
    public void loadData() {
        StringBuilder contentBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                contentBuilder.append(line).append("\n");
            }
        } catch (IOException e) {
            errorMessage = "Erro ao carregar o arquivo: " + e.getMessage();
        }
        fileContent = contentBuilder.toString();
    }

    @Override
    public String getData() {
        return errorMessage != null ? errorMessage : fileContent;
    }
}

