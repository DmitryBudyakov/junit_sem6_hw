package seminar6.hw;

import java.util.Arrays;

public class AverageCompare {

     public static String compareArrays(long[] array1, long[] array2) {
         if (array1 == null || array2 == null){
             return "Array не должен быть null.";
         }
        if (caclAverage(array1) > caclAverage(array2)){
            return "Первый список имеет большее среднее значение";
        } else if (caclAverage(array1) < caclAverage(array2)) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
     }

    private static double caclAverage(long[] array) {
        return Arrays.stream(array).average().getAsDouble();
    }
}
