import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task2 {
    public String lastShorestString(String fileName) throws IOException{
        if(fileName == null)
            throw new NullPointerException("Путь не может быть NULL");
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName));){
            String result = reader.readLine();
            String tempResult;
            while((tempResult = reader.readLine()) != null){
                if(tempResult.length() <= result.length()){
                    result = tempResult;
                }
            }
            if(result == null)
                throw new NullPointerException("Файл является пустым");
            return result;
        }
    }
}
/*
    String lastShortestString(String filename)

    Знайти у текстовому файлі найкоротший рядок. Якщо є кілька рядків, довжина яких дорівнює мінімальній, повернути останній з них.
*/