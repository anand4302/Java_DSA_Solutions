public class reverse_no {

    static void reverse(int n){
        int rev = 0;
        while (n>0) {
            int rem = n%10;
            rev = rev*10 +rem;
            n=n/10;
        }
        System.out.println(rev);
    }
    
    public static void main(String[] args) {
        int n=4321;
        reverse(n);
    }
}
