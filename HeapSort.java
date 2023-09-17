public class HeapSort{

    public void sort (int [] array){
            int n = array.length;

            for (int i = n / 2 -1; i >= 0; i--)
                heapify (array, n, i);

            for (int i = n - 1; i >= 0; i--)
            {
                int t = array[0];
                array[0] = array[i];
                array[i] = t;
                heapify (array, i, 0);
            }
    }

    void heapify (int array[], int n, int i){
        int largest = i;
        int left = i*2 +1;
        int right = i*2+2;

        if (left < n && array[left] > array[largest])
            largest = left;

        if (right < n && array[right] > array[largest])
            largest = right;

        if (largest != i){
            int p = array[i];
            array[i] = array[largest];
            array[largest] = p;
            heapify(array, n, largest);
        }
    }


    public static void main(String[] args) {
        int array[] = {87,5,60,12,54,8,3};
        int n = array.length;

        HeapSort sorting = new HeapSort();
        sorting.sort(array);

        for (int i = 0; i < n; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

}