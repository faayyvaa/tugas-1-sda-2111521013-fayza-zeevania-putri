import java.util.ArrayList;
// Soal 5
//Tentukan hasil yang didapatkan ketika dilakukan perintah berikut ini : remove(0), remove(3), remove(2)
public class soal5 {  
      public static void main(String[] args) 
    {
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("u");
        nama.add("t");
        nama.add("r");
        nama.add("i");
        
        System.out.println("Soal 5");
        System.out.println("ArrayList sebelum remove:");

        for(String var : nama)
        {
             System.out.println(var);
        }

        nama.remove(0);
        nama.remove(3);
        nama.remove(2);

        System.out.println("ArrayList setelah remove:");

           for(String var0 : nama)
           {
                 System.out.println(var0);
           }
    }
} 