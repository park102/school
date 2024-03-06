public class school {

    public static void main(String[] args) {
        for (int i = 0; i <= 13; i++) {
            switch (i) {
                case 8:
                    System.out.print("{");
                    break;
                case 12:
                    System.out.print("(");
                    break;
                case 13:
                    System.out.print("@");
                    break;
                default:
                    System.out.print("-");
            }
        }
        System.out.println("");
    }
}
