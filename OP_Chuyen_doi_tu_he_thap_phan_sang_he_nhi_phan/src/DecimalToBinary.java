import java.util.Stack;

public class DecimalToBinary {
    public static String decimalToBinary(int decimal){
        Stack<Integer> stack= new Stack<>();

        while (decimal>0){
            int remain= decimal %2;
            stack.push(remain);
            decimal /= 2;
        }
        String bina = new String();
        while (!stack.isEmpty()){
            bina+=stack.pop();
        }
        return bina.toString();
    }
}
