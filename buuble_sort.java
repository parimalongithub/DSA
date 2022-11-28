import java.util.Arrays;

public class buuble_sort {
    void buublesort(int arr[]){
        boolean swapped;
        for(int i=0;i<arr.length;i++){
            swapped=false;
            for(int j=1;j<arr.length-i;j++){
                if (arr[j]<arr[j-1]){
                    //swampping
                    int temp=arr[j];
                     arr[j]=arr[j-1];
                     arr[j-1]=temp;
                     swapped=true;

                }
              
            }
            if(swapped==false){
                break;
            }
            
        }

    }
    public static void main(String[] args) {
        int arr[]={1,5,2,3};
        buuble_sort bs=new buuble_sort();
        bs.buublesort(arr);
        System.out.println(Arrays.toString(arr));
        
          
    }
}
