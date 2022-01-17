package one;

public class work {
        public static void main(String[] args) {
            int[] a={6,5,3,2,1,15,23,89,77};
            boolean A;
            int t;
            for(int pass=1;pass<9;pass++){
                A=true;
                for(int k=0;k<9-pass;k++){
                    if(a[k]>a[k+1]){
                        A=false;
                        t=a[k];a[k]=a[k+1];a[k+1]=t;
                    }
                }
                if(A) break;
            }
            for(int k=0;k<9;k++) System.out.println(a[k]);
    }

}
