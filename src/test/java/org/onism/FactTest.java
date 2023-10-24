package org.onism;

import org.junit.Test;

/**
 * @author : Yaxin-Wang
 * @date : 2023/5/16
 */
public class FactTest {

    @Test
    public void testFact() {
        //nothing to do
        Fact demo = new Fact();
        float[] array = {1,5, 7, 4, 3,2, 6};
//        demo.QuickSort(array, 0, array.length - 1);
        demo.QuickSort(array, 0, array.length - 1);
        for  (float i: array) {
            System.out.print(i + " ");
        }
    }

}
