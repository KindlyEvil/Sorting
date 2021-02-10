
public class bubbleSort {

    void bubblesort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                }
    }
    void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,3,7,9,12,6,8};
		bubbleSort b=new bubbleSort();
		b.bubblesort(arr);
		b.printArray(arr);

	}

}
