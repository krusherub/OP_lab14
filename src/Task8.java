import java.io.*;
import java.util.ArrayList;

public class Task8 {
    public void cypher(String path, String destination, byte key) throws IOException{
        if(path == null || destination == null)
            throw new NullPointerException("Путь не может быть NULL");
        try (FileInputStream fileInput = new FileInputStream(path);
             FileOutputStream fileOutput = new FileOutputStream(destination))
        {
            byte[] buffer = new byte[512];
            while(fileInput.read(buffer)>0) {
                for(int i = 0; i < buffer.length; i++){
                    buffer[i] ^= key;
                }
                fileOutput.write(buffer);
            }
        }
    }
}