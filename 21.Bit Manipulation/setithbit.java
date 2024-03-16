public class q3 {
    public static int setithbit(int n, int i) {
        //only 1 value will be 1 and rest all will be 0
        int bitMask=1<<i;
        //result will be printed after adding n and bitmask
        return n | bitMask;
        
    }
    public static void main(String[] args) {
        System.out.println(setithbit(10,2));
    }
}
