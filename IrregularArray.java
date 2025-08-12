public class IrregularArray{
    public static void main(String[] args){
        int [][] irregularArray = new int[3][];

        irregularArray[0] = new int[3];
        irregularArray[1] = new int[1];
        irregularArray[2] = new int[4];

        irregularArray[0][0] = 10;
        irregularArray[0][1] = 20;
        irregularArray[0][2] = 30;
        
        irregularArray[1][0] = 40;

        irregularArray[2][0] = 50;
        irregularArray[2][1] = 60;
        irregularArray[2][2] = 70;
        irregularArray[2][3] = 80;


        System.out.println("Printing the irregular array: ");

        for(int i = 0; i <irregularArray.length; i++){
            for(int j = 0; j<irregularArray[i].length; j++){
                System.out.print(irregularArray[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
}