public class ClassResult{
    static  double[] cgpaList = {3.56,3.7, 3.75, 3.92};
    static  String[] name = {"Tahmid", "Jubair", "Labib", "Mostakim"};

    public static void main(String[] args) {
        int topper = 0;

        for(int i = 0; i<cgpaList.length;i++){
            System.out.println("Your name is "+ name[i] + " and cgpa is "+cgpaList[i]);
            if(cgpaList[topper]<cgpaList[i]){
                topper = i;
            }
        }
        System.out.println("Topper is " + name[topper] +" and his cgpa is "+cgpaList[topper]);
    }

}