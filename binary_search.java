package Arrays_in_Java;

public class binary_search {
    public static int BinarySearch(int arr[],int ele,int low,int high){
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==ele){
                return mid;
            }
            else{
                if(ele<arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7};
        int ele=1;

        int ans=BinarySearch(arr,ele,0,arr.length-1);

        if(ans==-1){
            System.out.println("The element is not present in array");
        }
        else{
            System.out.println("The element is present in array");
        }
    }
}
