public class Controlls06 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0){
                System.out.println(i + " parzysta");
            } else 
            System.out.println(i + " nieparzysta");
        }
        int i = 0;
        while (i <= n){
            if(i % 2 == 0){
                System.out.println(i + " parzysta");
            } else
            System.out.println(i + " nieparzysta");
            i++;
        }
    }
}
