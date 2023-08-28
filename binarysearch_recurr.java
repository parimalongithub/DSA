package searching;
public class binarysearch_recurr {

    static int search(int [] arr,int target,int s ,int e ){
        int mid =(s+e)/2;
        if(s>e){
            return -1;
        }
        else if (arr[mid]==target){
            return mid;

        }
        else if(arr[mid]<target){
            return search(arr, target, mid+1, e);
        }
        return search(arr, target, s, mid-1);


         
    }
    public static void main(String[] args) {

        int arr []={1,3,4,6,8,221,226};
        int target=5;
        System.out.println(search(arr, target, 0,arr.length-1));
        
    }
}
