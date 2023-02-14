import java.util.Arrays;


public class ExtraTasks {
    public static void main(String[] args) {
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();

    }

    private static void task10() {
        System.out.println("Еще один вариант задачи 1");

        int arr1[] = new int [9];   //создание одномерного массива
        for (int i = 0; i < arr1.length; i++) {
            if(i % 2 == 0){
                arr1[i] = 1;        //заполнение массива 1 и 0
            }
        }
//        System.out.println(Arrays.toString(arr1));
        int arr2[][] = new int [3][3];  //создание двумерного массива на 9 элементов
        int k = 0;                      //счетчик элементов первого массива
        for(int i=0; i <= arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = arr1[k];   //пробегаем по массиву и присваиваем соответствующие значения.
                k++;                    // увеличиваем счетчик на 1
                System.out.print(arr2[i][j] + " "); //вывод элементов строк матрицы
            }
            System.out.println();                   //переход между строками матрицы
        }
        System.out.println();
    }


    private static void task9() {
        /*### Очень сложно. Задание 9
        Усложняем предыдущую задачу. Найдите все пары чисел, сумма которых равна −2. Напечатайте их в консоль.*/
        System.out.println("Задание 9");

        int[] arr = new int[]{-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < i; j++) {
                int sum = arr[i] + arr[j];
                if (sum == -2) {
                    System.out.println("итерация " + i + "_" + j + ": " + arr[i] + "+(" + arr[j] + ")= " + sum);
                }
            }
        }
        System.out.println();
    }

    private static void task8() {
         /*### Очень сложно. Задание 8
        Задача, которая используется/бывает/встречается на собеседованиях.
        Дан массив чисел {−6, 2, 5, −8, 8, 10, 4, −7, 12, 1}
        Необходимо найти два числа, сумма которых равна −2.
        Напечатать эти числа в консоль.
                - **Подсказка**
        Может потребоваться отсортировать массив с помощью Arrays.sort(arr).*/
        System.out.println("Задание 8");
        int num = 0;

        int[] arr = new int[]{-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < 0) {
                for (int j = 9; j > i; j--) {
                    num = arr[i] + arr[j];
                    if (num == -2) {
                        System.out.println("итерация " + i + "_" + j + ": " + arr[i] + "+(" + arr[j] + ")= " + num);
                    }
                }
            }

        }
        System.out.println();
    }

    private static void task7() {
        /* Повышенная сложность. Задание 7
        Решите предыдущее задание, но без использования дополнительного массива.
        Необходимо добиться того, чтобы исходный массив полностью соответствовал второму массиву из прошлого задания.
        Выведите результат программы в консоль тем же способом.
        **Уточнения**:
        - Это задание не на сортировку.
        - Не использовать Arrays.sort() и другие способы сортировок.
        - Числа в порядке убывания даны исключительно для указания направления чтения.
        - Массив может быть 5 8 2 3 9, нужно из него сделать 9 3 2 8 5.*/

        System.out.println("Повышенная сложность. Задание 7");

        int[] arr1 = new int[]{5, 4, 3, 2, 1};

        System.out.println(Arrays.toString(arr1));

        int j = arr1.length - 1;
        int k = 0;

        for (int i = 0; i < 2; i++) {

            int x = arr1[k];
            int y = arr1[j];

            arr1[k] = y;
            arr1[j] = x;

            j--;
            k++;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println();
    }

    private static void task6() {
       /*Повышенная сложность. Задание 6
       У нас есть массив, в котором содержатся целочисленные значения от 1 до 5.
        Наш коллега что-то напутал, в итоге массив читается не с начала, а с конца.
        Нам нужно исправить ошибку и переработать код так, чтобы массив читался в правильном порядке.
                  Нам дан массив чисел: {5, 4, 3, 2, 1}
        Необходимо привести его к виду: {1, 2, 3, 4, 5}
        Решите задачу с использованием дополнительного массива.
        Напечатайте массив до преобразования и после с помощью */

        System.out.println("Повышенная сложность. Задание 6");

        int[] arr1 = new int[]{5, 4, 3, 2, 1};
        int[] arr2 = new int[5];
        int x = 0;

        System.out.println(Arrays.toString(arr1));

        for (int i = arr1.length - 1; i >= 0; i--) {
            for (int j = 0; j <= x; j++) {
                arr2[i] = arr1[j];
            }
            x = x + 1;
        }
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr2[i];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println();
    }

    private static int factorial(int x) {
        int fact = 1;
        for (int i = 2; i <= x; i++) {
            fact = i * fact;
        }
        return fact;
    }

    private static void task5() {
    /* Создайте матрицу 3х3 (двумерный массив типа int). Заполните единицами обе диагонали
    матрицы и напечатайте ее в консоль. Постарайтесь заполнить обе диагонали в одном цикле.
    – В консоль выводится матрица 3х3 со значениями единицы по диагонали.
    – При изменении единицы на другое значение матрица выводится в консоль корректно.
    – Для вывода результата в консоль используется один цикл.*/

        System.out.println("Повышенная сложность. Задание 5 ");

        int[][] matrix = new int[3][3];

        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrix[i].length; j += 2) {
                    matrix[i][j] = 1;
                }
            } else {
                for (int j = 0; j < matrix[i].length; j += 2) {
                    matrix[i][1] = 1;
                }
            }
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
