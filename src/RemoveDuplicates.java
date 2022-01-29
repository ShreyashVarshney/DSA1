 public class RemoveDuplicates {
        public void removeConsecutiveDuplicates(int arr[]){
            int arr1[] = new int[arr.length];
            int j = 0;
            for(int i = 0;i < arr.length-1; i++){
                if(arr[i] != arr[i+1]){
                    arr1[j] = arr[i];
                    j = j+1;
                }
            }
            if(arr[arr.length-1] != arr[arr.length-2]){
                arr1[j] = arr[arr.length-1];
                j=j+1;
            }
            for(int i=0; i<j; i++){
                System.out.println(arr1[i] + " ");
            }
        }

        public static void main(String[] args) {
            RemoveDuplicates r1 = new RemoveDuplicates();
            int arr[]  = {10,10,20,30,40,40,50,60,60,70,80};
            r1.removeConsecutiveDuplicates(arr);
        }
    }


