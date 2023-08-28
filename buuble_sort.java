package sorting;
import java.util.Arrays;

public class buuble_sort {
    void buublesort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if (arr[j]<arr[j-1]){
                    //swampping
                    int temp=arr[j];
                     arr[j]=arr[j-1];
                     arr[j-1]=temp;

                }
              
            }
        
            
        }

    }
    public static void main(String[] args) {
        int arr[]={1,5,2,3,3,5,6,7,4,2,234,63,23,2 };
        buuble_sort bs=new buuble_sort();
        bs.buublesort(arr);
        System.out.println(Arrays.toString(arr));
        
          
    }
}
