import java.util.Arrays;

import static java.util.Arrays.*;

public class ArraysExampl {
    public static void main(String[] args) {
        int array [] = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for (int i=0; i <array.length; ++i)
            sum += array [i];
        double msum = (double) sum / array.length;
        Arrays.sort (array);
        double median = ((double)(array[array.length/2] + array[array.length/2 -1]))/2;
        System.out.println("Сумма значений: " + sum);
        System.out.println("Среднее значение: " + msum);
        System.out.println("Медиана: " + median);
    }

}
