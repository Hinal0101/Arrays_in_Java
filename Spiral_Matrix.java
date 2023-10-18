package Arrays_in_Java;
public class Spiral_Matrix {
    public static void main(String args[]){
        int arr[][]={{1 , 2 , 3 , 4},
                     {5 , 6 , 7 , 8},
                     {9 ,10 ,11 ,12},
                     {13,14 ,15 ,16}};
        int r1=0,c1=0;
        int r2=arr.length;
        int c2=arr[0].length;

        while(r2>r1){
            for(int i=c1;i<c2;i++){
                System.out.print(arr[r1][i]+" ");
            }
            for(int i=r1+1;i<r2;i++){
                System.out.print(arr[i][c2-1]+" ");
            }
            for(int i=c2-2;i>=c1+1;i--){
                System.out.print(arr[r2-1][i]+" ");
            }
            for(int i=r2-1;i>=r1+1;i--){
                System.out.print(arr[i][c1]+" ");
            }
            r1++;
            r2--;
            c1++;
            c2--;
        }
    }
}
