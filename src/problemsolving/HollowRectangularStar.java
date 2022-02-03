package problemsolving;

public class HollowRectangularStar {
    public static void main(String[] args) {
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 4; j++) {
                if (i == 0 || i == 2 || j == 0 || j == 4) {
                    System.out.print("*" + "\t");
                } else {
                    System.out.print(" " + "\t");
                }

            }
            System.out.println();

        }
    }
}
