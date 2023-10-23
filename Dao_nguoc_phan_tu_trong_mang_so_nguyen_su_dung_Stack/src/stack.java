import java.util.Stack;

public class stack {

    public static int[] reverse(int[] arr){
        Stack<Character> stacktemp = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stacktemp.push((char) arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stacktemp.pop();
        }
        return arr;
    }
    public static String reverseString(String str){
        Stack<Character> stacktemp=new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stacktemp.push(str.charAt(i));
        }
        String newStr = "";
        while (!stacktemp.isEmpty()){
            newStr+=stacktemp.pop();
        }

        return newStr;
    }
}
