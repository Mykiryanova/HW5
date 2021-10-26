import java.io.Serializable;

public class AppData implements Serializable {
    private String[] header;
    private int data1;
    private int data2;
    private int data3;




    public AppData(int data1, int data2, int data3) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
    }



    public void printInfo(){
        System.out.println(data1 + " " + data2 + " " + data3);
    }
}
