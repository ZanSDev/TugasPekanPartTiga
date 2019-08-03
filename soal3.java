public class soal3 {
    public static void main(String[] args) {
        System.out.println("3. Cara mengerorkan program");
        try{
            int x = 10;
            System.out.println(x/0);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
