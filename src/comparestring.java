class comparestring {
    public static void main(String[] args){
        String str1 = "Hello";
        String str2 = "Hello";
        if (str1.length() != str2.length()){
            System.out.println("Strings are not equal");
            return;
        }
        {
            for (int i = 0; i < str1.length(); i++){
                if (str1.charAt(i) != str2.charAt(i)){
                    System.out.println("Strings are not equal");
                    return;
                }
            }
        }
        System.out.println("Strings are equal");
    }
}