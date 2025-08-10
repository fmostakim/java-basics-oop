public class ReverseString{
    public static void main(String[] args) {
        String originalString = "Hello Bangladesh";
        String reveString = "";
        
        for (int i = originalString.length()-1;i>=0;i--){
            reveString += originalString.charAt(i);
        }
        System.out.println("Original String: "+ originalString);
        System.out.println("Reversed String: "+ reveString);
    }
}