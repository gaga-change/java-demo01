package a09_数组;

// 二维数组测试
public class Demo03 {
    public static void main(String[] args) {
        int[][] a = new int[4][6];
        a[1][2] = 1;
        for (int i = 0; i < a.length; i ++) {
            for (int j = 0; j < a[i].length; j ++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        int[][][] b = new int[3][3][3];
        for (int i = 0; i < b.length; i ++) {
            for (int j = 0; j < b[i].length; j ++) {
                for (int k = 0; k < b[i][j].length; k ++)
                System.out.print(b[i][j][k] + " ");
            }
            System.out.println();
        }
    }
}
