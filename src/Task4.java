//Задание 4
//        На рисунке показан пример треугольника из чисел.
//       7
//      3 8
//     8 1 0
//    2 7 4 4
//   4 5 2 6 5
//        Написать метод:
//        ■ выводящий значения треугольника на консоль в таком
//        виде как на рисунке;
//        ■ вычисляющий наибольшую с умму чисел, через
//        которые проходит путь, начинающийся на вершине и
//        заканчивающийся где-то на основании.
//        1. Каждый шаг может идти диагонально вниз-направо
//        или диагонально вниз-налево.
//        2. Количество строк в треугольнике >1, но <100.
//        3. Числа в треугольнике все целые от 0 до 99 включительно (генерируются случайным образом).
//        В примере, описанном выше, это путь 7, 3, 8, 7, 5, дающий
//        максимальную сумму 30.
//        Программа должна выводить на экран треугольник и
//        путь, который даст максимальный результат. Для текущего
//        примера он будет такой – влево, влево, вправо, влево.
public class Task4 {
    public static void print(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int k = 1; k < arr.length - i; k++) {
                System.out.print("  ");
            }
            for (int j = 0; j < arr.length; j++) {
                if (j <= i) {
                    if (arr[i][j] <= 10) {
                        System.out.print(" " + arr[i][j] + "  ");
                    } else {
                        System.out.print(arr[i][j] + "  ");
                    }
                }
            }
            System.out.println();
        }
    }
    static int[][] generate(int length) {
        int min = 0;
        int max = 99;
        int[][] array = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                array[i][j] = (int) (Math.random() * (max - min) + min);
            }
        }
        return array;
    }

    public static int getMaxTrace(int [][] a, int col, int row) {
        int res = a[row][col];
        if (row != a.length - 1) {
            int left = getMaxTrace(a, col, row + 1);
            int right = getMaxTrace(a, col + 1, row + 1);
            res += Math.max(left, right);
        }
        return res;
    }
}
