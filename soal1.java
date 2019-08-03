public class soal1 {
    public static void main(String[] args) {
        System.out.println("1. Cara Mengatasi Error");
        int a = 50;
        try{
            int b = a / 0;
            System.out.println("Data : " + b);
        } catch(Exception xx){
            System.out.println(xx);
        }
        System.out.println("Akhir Program");
    }
}
