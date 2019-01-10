public class ExpressionEvaluation {
    public static void main(String[] args) {
        double x = 3 - (double) (56 - 12) / 44 * 4 / 2;
        System.out.println("Х равняется " + x);
        double y = 2 * x / (33 - x);
        System.out.println("Y равняется " + y);
        double z = - x / (2 * y);
        System.out.println("Z равняется " + z);
    }
}
