class StringRev{
    public static void main(String[] args) {
        String myString="amar";
        char [] a= myString.toCharArray();
        char [] b= new char[myString.length()];
        int j= myString.length()-1;
        for(int i=0;i< myString.length();i++){
            b[j]=a[i];
            j=j-1;
        }

        String rev= new String(b);
        System.out.println(rev);
    }
}