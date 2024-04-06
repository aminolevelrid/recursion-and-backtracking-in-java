public class Main
{
     public static boolean print(int n,int counter){{
         if(n<counter){
             return true;
         }
         if(n%counter==0){
             return false;
         }
         return print(n-(n/counter),counter+1);
     }
        
}
	public static void main(String[] args) {
		System.out.print(print(13,2));
	}
}