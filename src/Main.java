import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static  void main (String [] args) throws IOException{
        File file = new File("src/file.csv");
System.out.println(file.isFile());
        System.out.println(file.exists());

        AppData appdateOneOut = new AppData (1, 100, 3);
        AppData appdateTwoOut = new AppData (1, 85, 3);


        try (ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream(file))) {
            objOut.writeObject(appdateOneOut);
            objOut.writeObject(appdateTwoOut);
        } catch (IOException e) {
            e.printStackTrace();
        }

        int count;

        ArrayList<AppData> arrayList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            while((count = bufferedReader.read()) != -1) {
                System.out.print((char) count);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        for (AppData appdd:arrayList) {
            appdd.printInfo();
        }

    }
}
