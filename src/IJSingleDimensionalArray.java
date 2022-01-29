public class IJSingleDimensionalArray {
    int arr[];

    public IJSingleDimensionalArray() {
        arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i = Integer.MIN_VALUE;
        }
    }

    public void print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public void insert(int index, int value) {
        try {
            if (arr[index] == Integer.MIN_VALUE) {
                arr[index] = value;
            } else {
                System.out.println("already filled");
            }
        } catch (ArrayIndexOutOfBoundsException obj) {
            System.out.println("Invalid index");
        }
    }

    public void search(int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println("value found");
                return;
            }
        }
        System.out.println("value not found");
    }

    public void printindexvalue(int index) {
        System.out.println(arr[index]);
    }
}
class  Test35{
    public static void main(String[] args) {
        IJSingleDimensionalArray obj = new IJSingleDimensionalArray();
        obj.search(30);
    }

}
