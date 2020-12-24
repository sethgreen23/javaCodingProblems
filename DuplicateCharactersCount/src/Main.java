import java.util.*;
public class Main {
    public static void main(String args[]) {
        String word = "abraca$dabra$";
        
      System.out.println(countDuplicatedNumbers(word));
    }
    public static int countDuplicatedNumbers(String word) {
    	//create memorization object 
    	//it is a map
    	Map<String,Integer> map = new HashMap<String,Integer>();
        int count=0;
        //iterate throw the word
        for(int i=0;i<word.length();i++){
        	//get each character in a form of String
            String letter = Character.toString(word.charAt(i));
            //if the letter is not in the map
            //we create an entry for it with value 1
            if(map.get(letter)==null){
                map.put(letter,1);
            }else{
            	//each time we find a character a second time
            	//we increment the count 
            	//with that we will have the number of duplicated caracter
                if(map.get(letter)==1)
                    count++;
                map.replace(letter,map.get(letter)+1);
            }
        }
        return count;
    }
}
