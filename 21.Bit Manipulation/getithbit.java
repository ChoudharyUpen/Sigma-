public class q2 {
    public static int getithbit(int n,int i) {
        //bitmask banja ga is sa jo hum add karenga 
        int bitMask=1<<i;
        if((n & bitMask) ==0){
            return 0;
        }
        else{
            return 1;
        }
        
    }
    public static void main(String[] args) {
        System.out.println(getithbit(10,4));
    }
}
