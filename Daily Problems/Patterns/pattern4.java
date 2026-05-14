public class pattern4 {
    public static void main(String[] args){
        int n=5;
        patterns(n);
    }
    public static void patterns(int n){
        for(int i=0;i<n;i++) {
        	 char c=(char)('A'+ i);
        	 for(int j=0;j<=i;j++) {
        		 System.out.print(c+" ");
        	 }
        	 System.out.println();   	 
         }
    }
}
