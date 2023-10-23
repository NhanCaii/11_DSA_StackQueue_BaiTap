import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String str="aaAabbcdd";
        System.out.println(countChar(str));
    }
    public static String countChar(String str) {
        HashMap<Character, Integer> map= new HashMap<>();
        str=str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            } else {
                map.put(str.charAt(i),1);
            }
        }
        String result="";
        for (var item:map.entrySet()){
            result+= String.valueOf(item.getKey())+String.valueOf(item.getValue())+" ";
//            result+= item.getKey()+item.getValue()+" ";

        }
        return result;
    }
}