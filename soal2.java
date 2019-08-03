public class soal2 {
    public static void main(String[] args) {
        System.out.println("2. Menggunakan Finally ");
        try{
            int bil = 5;
            System.out.println(bil/0);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("Baris di dalam finally akan dieksekusi");
        }
        System.out.println("Akhir Program");
    }
}
