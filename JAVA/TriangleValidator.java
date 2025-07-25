public class TriangleValidator{
    public static void main(String[] args) {
        int angleA = 60;
        int angleB = 70;
        int angleC = 40;

        int sum = angleA+angleB+angleC;
        if(sum == 180){
            System.out.println("The angles form a valid triangle! ");
        }else{
            System.out.println("The angles do not form a valid triangle.");
        }

    }
}