public class Demo {
    static int trailing_zeroe(int num){
        int count = 0;
        for(int i = 5;num/i>=1;i*=5){
            count += num/i;
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 1000000;
        System.out.println("The number of trailing zeroes in "+ num +" factorial is "+ trailing_zeroe(num));

    }
}
