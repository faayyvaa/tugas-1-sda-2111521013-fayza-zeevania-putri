import java.util.ArrayList;

//Soal 4
////tentukan hasil yang didapatkan ketika melakukan perintah
//indexOf(a),indexOf(c),indexOf(q)
public class soal4 {
    public static void main(String[] args)
//String[] nama = {"u","t","r","i"} 
   {
       ArrayList<String> nama = new ArrayList<String>();
       nama.add("u");
       nama.add("t");
       nama.add("r");
       nama.add("i");

       System.out.println("Soal 4");
       System.out.println(nama.indexOf("a"));
       System.out.println(nama.indexOf("c"));
       System.out.println(nama.indexOf("q"));
   }
}