import java.util.*;

class matrix{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int [][] mat = new int[a][b];
        for(int i=0;i<a;i++) {
            for (int j = 0; j < b; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println((Arrays.deepToString(rotate(mat))));
    }
    static int[][] rotate(int[][] matrix)
    {
        int a = matrix.length;
        int b = matrix[0].length;
        int[][] newmat = new int[a][b];
        for(int j=0;j<matrix.length;j++)
        {
            for(int i=(matrix[0].length)-1;i>=0;--i)
            {
//                return matrix[j][i];
            }
        }
        return new int[][] {{1},{2}};
    }
}