import java.util.ArrayList;
//soal 2
//tentukan hasil yang didapatkan ketika melakukan perintah
//size()
public class soal2 {
     public static void main(String[] args)
//String[] nama = {"u","t","r","i"} 
    {
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("u");
        nama.add("t");
        nama.add("r");
        nama.add("i");

        System.out.println("Soal 2");
        System.out.println("Size Array adalah :" + nama.size());
        
    }
}