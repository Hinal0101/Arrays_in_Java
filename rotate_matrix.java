package Arrays_in_Java;

public class rotate_matrix {
    public static void main(String args[]){
        int[][] arr={{1 , 2 , 3 , 4},
                     {5 , 6 , 7 , 8},
                     {9 , 10, 11, 12},
                     {13, 14, 15, 16}};
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length-i-1;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[arr.length-j-1][arr.length-i-1];
                arr[arr.length-j-1][arr.length-i-1]=temp;
            }
        }
        for(int i=0;i<arr.length/2;i++){
            for(int j=0;j<arr[0].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[arr.length-i-1][j];
                arr[arr.length-i-1][j]=temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
