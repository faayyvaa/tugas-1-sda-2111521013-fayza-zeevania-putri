//soal 1
//Tentukan hasil yang didapatkan ketika dilakukan perintah berikut ini :
// 1. isEmpty
public class soal1 {
    public static void main(String[] args)
//String[] nama = {"u","t","r","i"} 
    {
        String[] nama = {"u","t","r",""};
        
        System.out.println("Soal 1");
        System.out.println("Apakah Arraylist 1 kosong? " + nama[0].isEmpty());
        System.out.println("Apakah Arraylist 2 kosong? " +nama[1].isEmpty());
        System.out.println("Apakah Arraylist 3 kosong? " +nama[2].isEmpty());
        System.out.println("Apakah Arraylist 4 kosong? " +nama[3].isEmpty());  
    }
}