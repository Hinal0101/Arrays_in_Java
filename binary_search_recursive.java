package Arrays_in_Java;
public class binary_search_recursive {
    public static int BinarySearch(int arr[],int ele,int low,int high){
        if(low>high){
            return -1;
        }
        else{
            int mid=low+(high-low)/2;
            if(arr[mid]==ele){
                return mid;
            }
            else{
                if(ele<arr[mid]){
                    return BinarySearch(arr, ele, low,mid-1);
                }
                else{
                    return BinarySearch(arr, ele, mid+1, high);
                }
            }
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7};
        int ele=1;

        int ans=BinarySearch(arr,ele,0,arr.length);
        if(ans==-1){
            System.out.println("Element is not present in array");
        }
        else{
            System.out.println("Element is present in array");
        }
    }
}
