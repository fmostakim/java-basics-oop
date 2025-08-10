public class PalindromeCheck{
    public static void main(String[] args) {
        String str = "madam";
        String reverseString = "";
        int strLength = str.length();
        for(int i = (strLength-1); i>=0;i--){
            reverseString += str.charAt(i);

        }
        if (str.equalsIgnoreCase(reverseString)){
            System.out.println(str +" is a Palindrome String.");
        } else{
            System.out.println(str+" is not a Palindrome String.");
        }
    }
}