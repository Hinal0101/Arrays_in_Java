package Arrays_in_Java;
public class linear_search {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7};
        int ele=7;
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele){
                flag=true;
            }
        }

        if(flag==true){
            System.out.println("The element is present in array");
        }
        else{
            System.out.println("The element is not present in array");
        }
    }
}
