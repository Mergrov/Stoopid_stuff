
public class Main {
    public static void boxGenerator(int hight, int width){
        for(int i=0; i<width;i++){
            System.out.print("*");
        }
        System.out.println();

            for(int i=0;i<hight-2;i++) {
                System.out.print("*");
                for (int j = 0; j < width-2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();

            }
        for(int i=0; i<width;i++) {
            System.out.print("*");
        }
    }

    public static void main(String[] args) {


}

}
