public class Sub_Two_Matrices {
    public static void main(String[]args){
        int a[][]= {{ 9,8},{7,6}};
        int b[][]={{5,4},{3,2}};
        int result[][] = new int[2][2];

        for(int i =0; i<2; i++){
            for(int j=0; j<2;j++){
               result [i][j]=a[i][j]-b[i][j];
            }
        }
        System.out.println("Result of Matrix Substraction: ");
        for (int i=0; i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
