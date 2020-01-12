package codility1;

class SolutionOld {
    public int solution(int X, int[] A) {
        int steps = X;
        boolean bitmap[] = new boolean[steps+1];


        for(int j=0;j<A.length;j++){
            if(bitmap[A[j]]!=true){
                bitmap[A[j]]=true;
                steps--;
            }
            if(steps ==0){
                return j;
            }

            //System.out.println(bitmap[j]);
        }
        return -1;


    }
}