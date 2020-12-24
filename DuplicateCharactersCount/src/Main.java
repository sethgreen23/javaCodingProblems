import java.util.*;
public class Main {
    public static void main(String args[]) {
        String word = "abraca$dabra$";
        
      System.out.println(countDuplicatedNumbers(word));
    }
    public static int countDuplicatedNumbers(String word) {
    	Map<String,Integer> map = new HashMap<String,Integer>();
        int count=0;
        for(int i=0;i<word.length();i++){
            String letter = Character.toString(word.charAt(i));
            if(map.get(letter)==null){
                map.put(letter,1);
            }else{
                if(map.get(letter)==1)
                    count++;
                map.replace(letter,map.get(letter)+1);
            }
        }
        return count;
    }
}
