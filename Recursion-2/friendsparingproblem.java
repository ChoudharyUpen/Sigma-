public class friendsparingproblem {
    public static int friendspairing(int n) {
        if(n==1 || n==2){
            return n;
        }
        //fnm1le calculate
        int fnm1=friendspairing(n-1);
        //in a pair
        int fnm2=friendspairing(n-2);
        int pairWays=(n-1)*fnm2;
        return pairWays + fnm1;
    }
    public static void main(String[] args) {
        System.out.println(friendspairing(3));      
    }
}