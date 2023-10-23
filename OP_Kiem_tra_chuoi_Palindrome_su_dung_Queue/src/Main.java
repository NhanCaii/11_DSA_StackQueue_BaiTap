import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(checkSymmetry("abcba"));
    }

    public static boolean checkSymmetry(String str){
        Stack<Character> stack = new Stack<>();
        int mid=str.length()/2;
        for (int i = 0; i < str.length()/2; i++) {
            stack.push(str.charAt(i));
        }

        if (str.length()%2!=0){
            mid=mid+1;
        }

        for (int i = mid; i < str.length() ; i++) {
            if(stack.isEmpty() || stack.pop()!=str.charAt(i)){
                return false;
            }

        }

        return true;
    }

}