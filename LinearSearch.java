
class LinearSearch {
    static int findLinear(int arr[], int key, int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int key = 5;
        int n = arr.length;

        int result = findLinear(arr, key, n);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}