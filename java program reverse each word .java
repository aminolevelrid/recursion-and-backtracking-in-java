public class Main
{
	public static void main(String[] args) {
	String s="I am an educator";
	String h="";
	StringBuilder k=new StringBuilder("");
	for(int i=0;i<s.length();i++){
	    char p=s.charAt(i);
	    if(p!=' '){
	       k.append(p);
	    }
	    else{
	        k.reverse();
	       h+=k;
	       h+=" ";
	        k=new StringBuilder();
	    }
	}
	k.reverse();
	h+=k;
	System.out.print(h);
}
}