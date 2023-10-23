public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] arr={1,2,3,4,5};
        stack.reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println(stack.reverseString("helloworld"));
    }
}