package searching;
import java.util.Arrays;

public class linear_search { 



  //normal linear search ----------------->>
      static int linearsearch(int arr[],int target){
        if (arr.length==0){
          return -1 ;
        }
        for (int i=0;i<arr.length;i++){
          if(arr[i]==target){
            return i;
          }
        }
        return -1;  
      }

      //seraching in particular range -------------------------->
       static int linearsearch_inrange(int arr[],int target,int start,int end){
        if (arr.length==0){
            return -1 ;
          }
          for (int i=start;i<=end;i++){
            if(arr[i]==target){
              return i;
            }
          }
          return -1;  


      }
      static int finding_minimum(int arr[]){
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;


      }





          //seraching in multidimensional array -------------------------->

      static int []search_2d_array(int arr[][],int target){
        for (int i=0;i<arr.length;i++){
          for (int j=0;j<arr[i].length;j++){
            if (arr[i] [j]==target){
              return new int [] {i,j};
            }
          }
        }
        return new int [] {-1 ,-1};

      


      }




    public static void main(String[] args) {
        int array []={12,23,34,21,4123,42,1,56,12,899999,343424,345,234,123,555555,32};
        int target=90;
        
        System.out.println("The element is found at the index of "+linearsearch(array, target));
        System.out.println("The element in particular range is at the index of "+linearsearch_inrange(array, target, 1,4));
        System.out.println("the minimum element in the array is  "+finding_minimum(array));

        int [] [] multidimensional_araay ={
          {23,12,432,453},
          {45,89,90,111,56},
          {67,89,12,34,65,77}};
          int []ans =search_2d_array(multidimensional_araay, target);
          System.out.println(Arrays.toString(ans));  



    
          
          

        
}

}
