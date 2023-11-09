package seminar6.hw;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class AverageCompareTest {

    /*
        Тест 1.
        Проверка положительного результата, когда возвращается сообщение,
        что ср. значение массива 1 > ср. значения массива 2.
        Введеные значения массивов корректны.
     */
    @Test
    void testCompareArraysPositiveAverOfArray1IsBiggerThanAverArray2() {
        long[] array1 = {1, 2, 3};
        long[] array2 = {1, 2};

        String result = AverageCompare.compareArrays(array1, array2);

        assertThat(result).isEqualTo("Первый список имеет большее среднее значение");
    }

    /*
        Тест 2.
        Проверка положительного результата, когда возвращается сообщение,
        что ср. значение массива 1 < ср. значения массива 2.
        Введеные значения массивов корректны.
     */
    @Test
    void testCompareArraysPositiveAverOfArray2IsBiggerThanAverArray1() {
        long[] array1 = {1, 2};
        long[] array2 = {1, 2, 3};

        String result = AverageCompare.compareArrays(array1, array2);

        assertThat(result).isEqualTo("Второй список имеет большее среднее значение");
    }

    /*
        Тест 3.
        Проверка положительного результата, когда возвращается сообщение,
        что ср. значения массивов равны.
        Введеные значения массивов корректны.
     */
    @Test
    void testCompareArraysPositiveAverOfArray1AndArray2AreEquals() {
        long[] array1 = {1, 2, 3};
        long[] array2 = {1, 2, 3};

        String result = AverageCompare.compareArrays(array1, array2);

        assertThat(result).isEqualTo("Средние значения равны");
    }

    /*
        Тест 4.
        Проверка результата, когда на вход подается null вместо массива 1.
     */
    @Test
    void testCompareArraysWhenArray1IsNull() {
        long[] array1 = null;
        long[] array2 = {1, 2, 3};

        String result = AverageCompare.compareArrays(array1, array2);

        assertThat(result).isEqualTo("Array не должен быть null.");
    }

    /*
        Тест 5.
        Проверка результата, когда на вход подается null вместо массива 2.
     */
    @Test
    void testCompareArraysWhenArray2IsNull() {
        long[] array1 = {1, 2, 3};
        long[] array2 = null;

        String result = AverageCompare.compareArrays(array1, array2);

        assertThat(result).isEqualTo("Array не должен быть null.");
    }
}
