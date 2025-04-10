public class Arrays {
    public static void main(String[] args) {
        
    
    int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int size = myArray.length;
        int y = myArray[0];
        System.out.println(size);
        System.out.println(myArray);
        System.out.println(y);

        int[][] matrix = new int[3][3];
        matrix[0][0] = 1;
        System.out.println(matrix);


        for( int i = 0 ; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }
        for (int num : myArray){
            System.out.println(num);
        }
            
    }
 
}