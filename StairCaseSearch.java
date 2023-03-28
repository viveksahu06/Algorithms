public class StairCaseSearch {
    //prerequistic is that element in the matrix is always sortted form  
    // approach 1 started from column;  
    //time complexity O(m+n);
    public static boolean stairCaseSearch(int matrix[][],int key) {
    int row=0; 
    int col=matrix[0].length-1; 
    while(row<matrix.length && col>=0){
        if(matrix[row][col]==key){
            System.out.println("Element found in the cell no. : ("+row+","+col+")"); 
            return true;
        } 
        else if(key< matrix[row][col]){
            col--;
        } 
        else{
            row++;
        }
    } 
    System.out.println("oops !element not found "); 
    return false;

    } 
    public static boolean stairsSearchBottomToUp(int matrix[][],int key){   
        int row=matrix.length-1; 
        int col=0; 
        while(row>=0 && col<matrix[0].length){
            if(matrix[row][col]==key){
                System.out.println("Element found in the cell no. : ("+row+","+col+")"); 
                return true;
            } 
            else if(key>matrix[row][col]){
                col++;
            } 
            else {
                row--;
            }
        } 
        System.out.println("oops !element not found "); 
        return false;
    

    }
     public static void main(String []args){
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},  
                        {27,29,37,48},
                        {32,33,39,50}}; 
         int key=33; 
         stairCaseSearch(matrix,key); 
         stairsSearchBottomToUp(matrix, 45);
    }
}
