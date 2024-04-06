public class Main
{
	   public static void main(String[] args) {
	       int n=15;
	       print(n,0);
	}
	public static void print(int n,int s){
	    if(s<=n && s!=0){
	        System.out.println(s);
	    }
	    if(s>n){
	        return;
	    }
	    int i=0;
	    if(s==0){
	        i=1;
	    }
	    for(;i<=9;i++){
	        print(n,s*10+i);
	    }
	}
}