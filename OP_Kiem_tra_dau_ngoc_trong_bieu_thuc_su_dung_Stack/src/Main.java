public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String str1="(– b + (b2 – 4*a*c)^0.5) / 2*a ";
        String str2="s * (s – a) * s – b) * (s – c)";

        System.out.println(str1+ BracketChecker.isBalanced(str1));
        System.out.println(str2+ BracketChecker.isBalanced(str2));

    }
}