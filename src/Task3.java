public class Task3 {
        public static void print(int[] array) {
            System.out.print("[");
            for (int i = 0; i < array.length - 1; i++) {
                System.out.print(array[i] + ", ");
            }
            System.out.println(array[array.length - 1] + "]");
        }

        public static void print(String[] array) {
            System.out.print("[");
            for (int i = 0; i < array.length - 1; i++) {
                System.out.print(array[i] + ", ");
            }
            System.out.println(array[array.length - 1] + "]");
        }

        public static void print(int[][] array) {
            for (int i = 0; i < array[0].length; i++) {
                for (int j = 0; j < array.length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }

        public static void print(float[][] array) {
            for (int i = 0; i < array[0].length; i++) {
                for (int j = 0; j < array.length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

