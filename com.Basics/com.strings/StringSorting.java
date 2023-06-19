import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StringSorting {
    public static void main(String[] args) {
        String myString = "Spoon";
        char[] a = myString.toCharArray();
        // Set<Character> charSet= new HashSet<>();
        // for (int i = 0; i < a.length; i++) {
        // charSet.add(a[i]);
        // }
        // Set<Character> sortedSet=new TreeSet<>(charSet); //tree set sorts the
        // elements

        List<Character> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }
            Collections.sort(list, new Comparator<Character>() {
            @Override
            public int compare(Character s1, Character s2) {
                return Character.toLowerCase(s1)-Character.toLowerCase(s2);
            }
        });

        StringBuilder sb = new StringBuilder();
        for (Character character : list) {
            sb.append(character);
        }
        System.out.println(sb.toString());
    }
}