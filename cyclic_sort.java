package sorting;
import java.util.Arrays;

public class cyclic_sort {
    void cyclicsort(int arr []){
        int i=0;
        while(i<arr.length){
            int correct=arr[i];
     
            if (arr[i]!=arr[correct]){
                //swap
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else{
                i++;
            }
         
            
        }

    }
    public static void main(String[] args) {
        cyclic_sort cs=new cyclic_sort();
        int arr[]={5,4,3,2,1,0};
        cs.cyclicsort(arr);
        System.out.println(Arrays.toString(arr));

       
        
    }
}
