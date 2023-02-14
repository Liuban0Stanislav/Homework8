import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task12();
        task3();
        task4();
    }

    private static void task4() {
        /*Задача 4
        Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания используйте циклы.
        Распечатайте результат преобразования в консоль.*/

        System.out.println("Задача 4");

        int[] arr1 = new int[]{1, 2, 3};

        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] % 2 != 0){
                arr1[i]++;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }

    private static void task3() {
        /*Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую.
        В конце строки запятую ставить не надо.
        Если в задаче № 2 в консоль у вас вывелся результат:
        1, 2, 3
        1.57, 7.654, 9.986
        // произвольные элементы третьего массива
        то в этой задаче результат должен быть таким:
        3, 2, 1
        9.986, 7.654, 1.57
        // произвольные элементы третьего массива в обратном порядке*/

        System.out.println("Задача 3");

        int[] arr1 = new int[]{1, 2, 3};
        double[] arr2 = {1.57, 7.654, 9.986};
        String[] arr3 = new String[]{"каждый", "охотник", "желает", "знать", "где", "сидит", "фазан"};

        int j = arr1.length - 1;
        int k = 0;
        for (int i = 0; i < arr1.length; i++) {
            int x = arr1[k];
            int y = arr1[j];
            arr1[k] = y;
            arr1[j] = x;
            j--;
            k++;
        }
        System.out.println(Arrays.toString(arr1));

        j = arr2.length - 1;
        k = 0;
        for (int i = 0; i < arr2.length; i++) {
            double box1 = arr2[k];
            double box2 = arr2[j];
            arr2[k] = box2;
            arr2[j] = box1;
            j--;
            k++;
        }
        System.out.println(Arrays.toString(arr2));

        j = arr3.length - 1;
        k = 0;
        for (int i = 0; i < arr3.length; i++) {
            String box1 = arr3[k];
            String box2 = arr3[j];
            arr3[k] = box2;
            arr3[j] = box1;
            j--;
            k++;
        }
        System.out.println(Arrays.toString(arr3));
        System.out.println();
    }


    private static void task12() {
        /*Задача 2
        Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую. 
        В конце строки запятую ставить не надо.*/
        System.out.println("Задача 1 и 2");

        int[] arr1 = new int[]{1, 2, 3};
        double[] arr2 = {1.57, 7.654, 9.986};
        String[] arr3 = new String[]{"каждый", "охотник", "желает", "знать", "где", "сидит", "фазан"};

        int index = 0;
        for (int i = 1; i <= arr1.length; i++) {
            System.out.print(arr1[index]);
            if(i != arr1.length){
                System.out.print(", ");
                index++;
            }
        }
        System.out.println();
        index = 0;
        for (int i = 1; i <= arr2.length; i++) {
            System.out.print(arr2[index]);
            if(i != arr2.length){
                System.out.print(", ");
                index++;
            }
        }
        System.out.println();
        index = 0;
        for (int i = 1; i <= arr3.length; i++) {
            System.out.print(arr3[index]);
            if(i != arr3.length){
                System.out.print(", ");
                index++;
            }
        }
        System.out.println();
        System.out.println();
    }

}