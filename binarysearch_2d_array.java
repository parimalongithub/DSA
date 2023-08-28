package searching;
import java.util.*;


public class binarysearch_2d_array {

    //binary search for sorted row and sorted column ------->
    static int []search (int matrix [][],int target ){
        int col=matrix.length-1;
        int row =0;
        while (row<matrix.length&&col>=0){
            if(matrix[row][col]==target){ 
                return new int[]{row,col};

            }
            if(matrix[row][col]<target){
                row++;
            }
            else{
                col--;
            } 
        }
        return new int [] {-1,-1};
    }



    //binary search for strictly sorted array
    static int [] binarysearch(int [][] matrix,int row ,int cstart,int cend,int target){
        while(cstart<=cend){
            int mid =(cend+cstart)/2;
            if(matrix[row ][mid]==target){
                return new int []{mid,row};
            }
            if(matrix[row][mid]<target){
                cstart=mid+1;
            }
            else{
                cend=mid-1; 
            }
        }
        return new int[]{-1,-1};


    }
    static int [] search2(int matrix[][],int target){
        int rows=matrix.length;
        int col=matrix[0].length;


        


        if(rows ==1){
            return binarysearch(matrix,0,0,col-1,target);
                  
            
        }
        int rowstart=0;
        int rowend=rows-1;
        int cmid=col/2;
        while(rowstart<(rowend-1)){
           int mid =  (rowend+rowstart)/2;
           if(matrix[mid][cmid]==target ){
            return new int []{mid,cmid};

           }
           if(matrix[mid][cmid]<target){
            rowstart=mid;

           }else{
            rowend=mid;
           }
 

           if(matrix[rowstart][cmid]==target){
            return new int[]{rowstart,cmid};
            
           }
           if(matrix[rowstart+1][cmid]==target){
            return new int[]  {rowstart+1,rowend};
           }



           // for 1 half
           if(target<=matrix[rowstart][cmid-1]){
            return binarysearch(matrix, rowstart, 0, cmid-1, target);

           }
         // for 2 half
        if(target<matrix[rowstart+1][cmid -1 ]&& target<=matrix[rowstart][col-1]){
            return binarysearch(matrix, rowstart, cmid+1, col-1, target);

        }
        //for 3 half 
        if(target<=matrix[rowstart+1][cmid-1]){
            return binarysearch(matrix, rowstart+1, 0, cmid-1, target);
        }
        else{
            return binarysearch(matrix, rowstart+1, cmid+1, col-1, target);
        }
             
        }
        return new int[]{-1,-1};
        





        }
    
 
  
    
    public static void main(String[] args) {
        int [][] array={{12,5,34},{28,36,56},{34,67,69}};
        System.out.println(Arrays.toString(search(array,5)));
        int [][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(Arrays.toString(search2(arr, 12)));
        

        
    }
}


