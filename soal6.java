import java.util.ArrayList;

//soal 6
//Tentukan hasil yang didapatkan ketika dilakukan perintah berikut ini :
// add(0,e), add(2,f), add(3,g), add(4,h), add(6,h), add(-3,j)
public class soal6{
    public static void main (String[] args)
    {
        ArrayList <String> nama = new ArrayList<String>();
        nama.add("u");
        nama.add("t");
        nama.add("r");
        nama.add("i");

       System.out.println("Soal 6 ");
       
       nama.add(0,"e");
       System.out.println("elemen setelah ditambahkan string e" + nama);
       nama.add(2,"f");
       System.out.println("elemen setelah ditambahkan string f" + nama);
       nama.add(3,"g");
       System.out.println("elemen setelah ditambahkan string g" + nama);
       nama.add(4,"h");
       System.out.println("elemen setelah ditambahkan string h" + nama);
       nama.add(6,"h");
       System.out.println("elemen setelah ditambahkan string h" + nama);
       nama.add(-3,"j");
       System.out.println("elemen setelah ditambahkan string j" + nama);
    }
}