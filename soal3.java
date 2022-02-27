import java.util.ArrayList;
//soal3
//Tentukan hasil yang didapatkan ketika dilakukan perintah berikut ini :
//get(0),get(2),get(6),get(-3)
public class soal3 {
    public static void main(String[]args) 
//String[] nama = {"u","t","r","i"}
    {
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("u");
        nama.add("t");
        nama.add("r");
        nama.add("i");

        System.out.println("Soal 3");
        System.out.println("Indeks ke-0 = " + nama.get(0));
        System.out.println("Indeks ke-2 = " + nama.get(2));
        System.out.println("Indeks ke-6 = " + nama.get(6));
        System.out.println("Indeks ke--3 = " + nama.get(-3));
    }
}