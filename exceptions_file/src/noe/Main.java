package noe;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        File txtf = new File("textfile.txt");
        writeToFile(txtf);
        readFromFile(txtf);
        File w = new File("wew.txt");
        readFromFile(w);
    }

    public static void readFromFile(File file){
        try (BufferedReader bf = new BufferedReader(new FileReader(file))){
            String line;
            while ((line = bf.readLine())!=null){
                System.out.println(line);
            }
        }catch (FileNotFoundException e){
            System.err.printf("file \"%s\" not found",file.getName());
        } catch (IOException e) {
            System.err.println("Reading file went wrong");
        }
    }

    public static void writeToFile(File file){
        try (FileWriter fw = new FileWriter(file)){
            fw.append("programming is fun!\n");
            fw.append("At least when i don't get errors...\n");
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
