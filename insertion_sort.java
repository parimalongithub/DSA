package sorting;
import java.util.Arrays;

public class insertion_sort {
    void insertionsort(int arr[]){
        for (int i =0;i<arr.length-1;i++){
            for (int j=i+1 ;j>0;j--){
                if(arr[j]<arr[j-1]){

                    //swapping
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp; 


                    

                }
                else{
                    break;
                }
            }
        }

    }
 public static void main(String[] args) {
    int arr[]={32,12,12,12};
    insertion_sort is=new insertion_sort();
    is.insertionsort(arr);
    System.out.println(Arrays.toString(arr));


    
 }   
}
