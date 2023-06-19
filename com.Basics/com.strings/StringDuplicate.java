import java.util.LinkedHashSet;
import java.util.Set;

public class StringDuplicate {
    public static void main(String[] args) {
        String myString = "ashfaqqad";
        char a[]= myString.toCharArray();
        
        Set <Character> mySet=new LinkedHashSet<>();
        for (char c : a) {
            mySet.add(c);
        }
        System.out.println(mySet);
        StringBuilder sb= new StringBuilder();
        for (Character character : mySet) {
            sb.append(character);
        }
        System.out.println(sb.toString());
    }
}
