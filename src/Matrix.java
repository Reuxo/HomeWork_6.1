public class Matrix {

//    Задание 1
//    Написать и протестировать методы работы с квадратными матрицами (матрицы представить в виде двухмерных
//            массивов).
//    Должны присутствовать методы:
//■ создания единичной (диагональной) матрицы;
//■ создания нулевой матрицы;
//■ сложение матриц;
//■ умножения матриц;
//■ умножение матрицы на скаляр;
//■ определение детерминанта матрицы;
//■ вывод матрицы на консоль.

    int[][] matrix;
    int length;

    public int[][] getMatrix() {
        return matrix;
    }

    public int getLength() {
        return length;
    }

    public Matrix(int[][] matrix) {
        this.matrix = matrix;
        this.length = matrix.length;
    }

    public Matrix(int length, boolean isNormId) {
        this.length = length;
        this.matrix = new int[length][length]; //создания нулевой матрицы;
        if (isNormId) {                         // создания единичной (диагональной) матрицы.
            for (int i = 0; i < this.length; i++) {
                for (int j = 0; j < this.length; j++) {
                    if (i == j) {
                        matrix[i][j] = 1;
                    }
                }
            }
        }
    }

    public void sum(Matrix m) {  //сложение матриц;
        for (int i = 0; i < this.length; i++) {
            for (int j = 0; j < this.length; j++) {
                this.matrix[i][j] += m.matrix[i][j];
            }
        }

    }

    public static Matrix multiply(Matrix matrix1, Matrix matrix2) {
        int sumTmp;
        int[][] matrix3 = new int[matrix1.length][matrix1.length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                sumTmp = 0;
                for (int k = 0; k < matrix1.length; k++) {
                    sumTmp += matrix1.matrix[i][k] * matrix2.getMatrix()[k][j];
                }
                matrix3[i][j] = sumTmp;
            }
        }
        return new Matrix(matrix3);
    }

    public void multScalar(int scalar) {  //умножение матрицы на скаляр;
        for (int i = 0; i < this.length; i++) {
            for (int j = 0; j < this.length; j++) {
                this.matrix[i][j] *= scalar;
            }
        }
    }

    public static double determinant(int A[][]) {
        int n = A.length;
        if (n == 1) {
            return A[0][0];
        }
        int ans = 0;
        int B[][] = new int[n-1][n-1];
        int l = 1;
        for(int i = 0; i < n; ++i){

            int x = 0, y = 0;
            for(int j = 1; j < n; ++j){
                for(int k = 0; k < n; ++k){
                    if(i == k) continue;
                    B[x][y] = A[j][k];
                    ++y;
                    if(y == n - 1){
                        y = 0;
                        ++x;
                    }
                }
            }
            ans += l * A[0][i] * determinant(B);
            l *= (-1);
        }
        return ans;

    }

    public void print() { //вывод матрицы на консоль.
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}


