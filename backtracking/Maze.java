public class Maze {

    static int count(int r , int c){
        if(r==1 || c==1){
            return 1;
        }

        int left = count(r-1, c);
        int right = count(r, c-1);

        return left+right;
    }


    public static void main(String[] args) {
        
        System.out.println(count(3,3));
        System.out.println(count(4, 3));
        System.out.println(count(10, 10));
    }
    
}