public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        String a = "11101000";
        String b = "11001011";
        System.out.println(a + " + " + b + " = " + bins.sum(a, b));
        System.out.println(a + " * " + b + " = " + bins.mult(a, b));
    }
}
