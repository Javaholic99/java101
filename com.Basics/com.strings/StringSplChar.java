public class StringSplChar {
    public static void main(String[] args) {
        String myString = "ashfaq#313@$";
        String regex = "[^a-zA-Z0-9]";
        
        System.out.println(myString.replaceAll(regex, ""));
    }
}
