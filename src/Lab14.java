import java.io.FileNotFoundException;
import java.io.IOException;

public class Lab14 {
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        try{
            String result = task2.lastShorestString("C:\\Users\\user\\Desktop\\try.txt");
            System.out.println("Самая короткая строка: " + "\"" + result + "\"");
        }catch (NullPointerException exc){
            System.out.println(exc.getMessage());
        }catch (IOException exc){
            System.out.println(exc.getMessage());
        }



        Task8 task8 = new Task8();
        try{
            task8.cypher("C:\\Users\\user\\Desktop\\try.txt","C:\\Users\\user\\Desktop\\try1.txt", (byte) 2);
        }catch (NullPointerException exc){
            System.out.println(exc.getMessage());
        }catch (IOException exc){
            System.out.println(exc.getMessage());
        }

    }
}
