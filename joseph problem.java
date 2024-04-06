public class Main
{
    public static int print(int sum,int index){
        if(sum==1){
            return 0;
        }
        return  (print(sum-1,index) +index)%sum;
  
    } 
	public static void main(String[] args) {
	    System.out.print(print(7,3));
	}
}