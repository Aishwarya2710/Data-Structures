public class MaxHeap {
    static int arr[] = new int[]{7,4,11,13,9,2,5,10};
    int left(int i)
    {
        return 2*i + 1;
    }
    int right(int i)
    {
        return 2*i + 2;
    }
    void heapify(int i)
    {
        int leftIndex = left(i);
        int rightIndex = right(i);
        int max = i;
        if(leftIndex<arr.length && arr[leftIndex] > arr[max])
            max = leftIndex;
        if(rightIndex<arr.length && arr[rightIndex] > arr[max])
            max = rightIndex;
        if(max != i)
        {
            arr[i] = arr[i] + arr[max] - (arr[max] = arr[i]);
            heapify(max);
        }
    }
    void build_heap()
    {
        for(int i=arr.length/2-1;i>=0;i--)
            heapify(i);
    }
    public static void main(String[] args) {
        MaxHeap root = new MaxHeap();
        root.build_heap();
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
    
}
