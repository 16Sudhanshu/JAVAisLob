package arrmatrix;

public class ArrMatrix {
    public static void Sopln(String str){
        System.out.println(str);
    }
    public static void Sop(String str){
        System.out.print(str);
    }
    public static void main(String[] args) {
        int a[][] = {{9,8,7},{6,5,4},{3,2,1}};
        int b[][] = {{80,71,62},{53,44,35},{26,17,8}};
        int A[][] = new int[3][3];
        int P[][] = new int[3][3];
        Sopln("Sum of matrices [a] and [b] is ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                A[i][j] = a[i][j] + b[i][j];
                Sop(A[i][j]+" ");
            }
            System.out.println();
        }
        Sopln("and Product of matrices [a] and [b] is ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                P[i][j] = 0;
                for(int k=0;k<3;k++){
                    P[i][j] += a[i][k] * b[k][j];
                }
                Sop(P[i][j]+" ");
            }
            System.out.println();
        }
    }
}
