public class AdvanceLoop
{
    public static void main(String a[])
    {
        int arr[]=new int[9];
        for(int i=0;i<9;i++){
            arr[i] = (int)(Math.random()*10);
           // System.out.print(arr[i]+" "); 
        }
        // Advance Loop
        for(int i : arr)
        {
           // System.out.print(i+" ");
        }
        // 2D Array
        int arr2[][]=new int[3][4];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
               arr2[i][j] = (int)(Math.random()*10); 
            }
        }
        for(int i[]:arr2)
        {
            for(int j : i ){

                System.out.print(j+" ");
            }
            System.out.println();
        }
        
    }
}