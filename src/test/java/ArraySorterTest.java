import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArraySorterTest {
    @Test
    public void testOfSorting(){
        int[] array = {10,22,12,5,2,21,8};
        int[] resultOfMethod = ArraySorter.bubbleSortAscending(array);
        int[] expectedSortedArray = {2,5,8,10,12,21,22};
       assertArrayEquals(expectedSortedArray,resultOfMethod);
    }
}
