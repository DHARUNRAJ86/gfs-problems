public class pattern3 {
    public static void main(String[] args){
        int n=5;
        patterns(n);
    }
    public static void patterns(int n){
        for(int i=0;i<n;i++) {
        	 for(char ch='A';ch<='A'+ n-i-1;ch++) {
        		 System.out.print(ch+" ");
        	 }
        	 System.out.println();
         }
    }
}
