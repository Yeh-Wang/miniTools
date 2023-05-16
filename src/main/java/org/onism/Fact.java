package org.onism;

/**
 * @author : Yaxin-Wang
 * @version : V1.0.0
 */
public class Fact {

    /**
     * Bubble sort (ascending) of an integer array.
     *
     * @param _target The input target array
     * @return  The sorted array
     */
    public int[] BubSort(int[] _target) {
        for (int i = 0; i < _target.length - 1; i++) {
            for (int j = 0; j < _target.length - i - 1; j++) {
                if (_target[j] > _target[j + 1]) {
                    int temp = _target[j];
                    _target[j] = _target[j + 1];
                    _target[j + 1] = temp;
                }

            }
        }
        return _target;
    }

    /**
     * Bubble sort (ascending) of a double array.
     *
     * @param _target The input target array
     * @return  The sorted array
     */
    public double[] BubSort(double[] _target) {
        for (int i = 0; i < _target.length - 1; i++) {
            for (int j = 0; j < _target.length - i - 1; j++) {
                if (_target[j] > _target[j + 1]) {
                    double temp = _target[j];
                    _target[j] = _target[j + 1];
                    _target[j + 1] = temp;
                }

            }
        }
        return _target;
    }

    /**
     * Bubble sort (ascending) of a float array.
     *
     * @param _target The input target array
     * @return  The sorted array
     */
    public float[] BubSort(float[] _target) {
        for (int i = 0; i < _target.length - 1; i++) {
            for (int j = 0; j < _target.length - i - 1; j++) {
                if (_target[j] > _target[j + 1]) {
                    float temp = _target[j];
                    _target[j] = _target[j + 1];
                    _target[j + 1] = temp;
                }
            }
        }
        return _target;
    }

    /**
     *  Quicksort (ascending) an array of integers.
     *
     * @param _target Input target array
     * @param low start index
     * @param high end index
     */
    public void QuickSort(int[] _target, int low, int high) {
        int i, j, pivot;
        if (low >= high) {
            return;
        }
        i = low;
        j = high;
        pivot = _target[low];
        while (i < j) {
            while (_target[j] >= pivot && i < j) {
                j--;
            }
            while (_target[i] <= pivot && i < j) {
                i++;
            }
            if (i < j) {
                int temp = _target[i];
                _target[i] = _target[j];
                _target[j] = temp;
            }
        }
        _target[low] = _target[i];
        _target[i] = pivot;
        QuickSort(_target, low, i - 1);
        QuickSort(_target, i + 1, high);
    }

    /**
     * Quicksort (ascending) an array of doubles.
     *
     * @param _target Input target array
     * @param low start index
     * @param high end index
     */
    public void QuickSort(double[] _target, int low, int high) {
        int i, j;
        double pivot;
        if (low >= high) {
            return;
        }
        i = low;
        j = high;
        pivot = _target[low];
        while (i < j) {
            while (_target[j] >= pivot && i < j) {
                j--;
            }
            while (_target[i] <= pivot && i < j) {
                i++;
            }
            if (i < j) {
                double temp = _target[i];
                _target[i] = _target[j];
                _target[j] = temp;
            }
        }
        _target[low] = _target[i];
        _target[i] = pivot;
        QuickSort(_target, low, i - 1);
        QuickSort(_target, i + 1, high);
    }

    /**
     * Quicksort (ascending) an array of floats.
     *
     * @param _target Input target array
     * @param low start index
     * @param high end index
     */
    public void QuickSort(float[] _target, int low, int high) {
        int i, j;
        float pivot;
        if (low >= high) {
            return;
        }
        i = low;
        j = high;
        pivot = _target[low];
        while (i < j) {
            while (_target[j] >= pivot && i < j) {
                j--;
            }
            while (_target[i] <= pivot && i < j) {
                i++;
            }
            if (i < j) {
                float temp = _target[i];
                _target[i] = _target[j];
                _target[j] = temp;
            }
        }
        _target[low] = _target[i];
        _target[i] = pivot;
        QuickSort(_target, low, i - 1);
        QuickSort(_target, i + 1, high);
    }

}
