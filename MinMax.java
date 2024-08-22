
class MinMax {
    public static int setmin(int [] A,int N){
        int mini = Integer.MAX_VALUE;
            for(int i=0 ; i<N ; i++){
                if(A[i]<mini){
                    mini = A[i];
                }
            }
            return mini;
        }
        
    public static int setmax(int []A,int N){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<N ; i++){
            if(A[i]>max){
                max = A[i];
            }
        }
        return max;
    }
        
    public static void main(String[] args) {
        int [] A = {1,2,4,32,21,12,11};
        int N = A.length;
        System.out.printf("mini" + setmin(A,N));
        System.out.println("Max" + setmax(A,N));
    }
}