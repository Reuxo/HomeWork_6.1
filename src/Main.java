public class Main {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(5, true);
        Matrix matrix2 = new Matrix(5, true);
//        int[][] mat = new int[5][5];
//        for (int i = 0; i < mat.length; i++) {
//            for (int j = 0; j < mat.length; j++) {
//                mat[i][j] = (int) Math.round(Math.random() * 100) ;
//                System.out.print(mat[i][j] + " ");
//            }
//            System.out.println();
//        }
        int A[][] = {{1,2,5}, {3,4,6}, {3,5,8}};
        int B[][] = {{2,3,6}, {2,3,4}, {8,5,2}};
        int[][] array = {{7, 0, 0, 0, 0},
                {3, 8, 0, 0, 0},
                {8, 1, 0, 0, 0},
                {2, 7, 4, 4, 0},
                {4, 5, 2, 6, 5}};


        Matrix a = new Matrix(A);
        Matrix b = new Matrix(B);
//        a.multiplication(b);
//        a.print();
        Task4.print(Task4.generate(20));
        //Task4.print(array);
        System.out.println(Task4.getMaxTrace(array, 0, 0));






    }
}
