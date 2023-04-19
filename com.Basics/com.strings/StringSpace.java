public class StringSpace {
    public static void main(String[] args) {
        String myString= "ash faq ad en i";
        String modify= new String();
        char a[]= myString.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if(a[i]==' '){
               modify= myString.replace(" ", "");
            }
        }
       
        System.out.println(modify);
    }
    
    
}
