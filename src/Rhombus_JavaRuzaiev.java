public class Rhombus_JavaRuzaiev {
    /**
     * Rhombus
     * Ромб
     * --*--
     * -***-
     * --*--
     */
    public static void main(String[] args) {

        int diagonal = 0, num_str = 0, count = 0, space = 0, star = 0;

        diagonal = 10;

        System.out.println("Rhombus");

        num_str = (diagonal * 2) - 1;
        star = 1;
        space = diagonal;

        for (int i = 1; i <= num_str; i++) {
            count++;
            for (int і = 1; і < space; і++) {
                System.out.print(" " + " ");
            }
            for (int і = 1; і <= star; і++) {
                System.out.print("*" + " ");
            }
            for (int і = 1; і < space; і++) {
                System.out.print(" ");
            }
            if (count < diagonal) {
                space = space - 1;
                star = star + 2;
            } else {
                space = space + 1;
                star = star - 2;
            }
            System.out.print("\n");
        }

    }

}
