package LeetCode;

public class M62_Unique_Path {

    public static void main(String[] args) {
        System.out.println(uniquePaths(3,7));
    }

    public static int uniquePaths(int m, int n) {
        int[][] arr = new int[m][n];
        return helper(arr,0,0);
    }

    public static int helper(int[][] arr, int i, int j){
        if(arr.length-1==i && arr[0].length-1==j){
            return 1;
        }

        if(i<0 || j<0 || i>=arr.length || j>=arr[0].length){
            return 0;
        }

        if(arr[i][j] != 0)return arr[i][j];

        arr[i][j] = helper(arr,i+1,j)+helper(arr,i,j+1);
        return arr[i][j];
    }

}
