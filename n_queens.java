
public class Main
{
	public static void main(String[] args) {
		int n=4;
		boolean [][]board=new boolean[n][n];
		System.out.print(queens(board,0));
	}
	public static int queens(boolean[][]board,int row){
	    if(row==board.length){
	        display(board);
	        System.out.println();
	        return 1;
	    }
	    int count=0;
	    for(int col=0;col<board.length;col++){
	        if(safe(board,row,col)){
	            board[row][col]=true;
	            count+=queens(board,row+1);
	            board[row][col]=false;
	        }
	    }
	    return count;
	}
	public static boolean safe(boolean [][]board,int row,int col){
	    for(int i=0;i<board.length;i++){
	        if(board[i][col]){
	            return false;
	        }
	    }
	    int maxleft=Math.min(row,col);
	    for(int i=1;i<=maxleft;i++){
	        if(board[row-i][col-i]){
	            return false;
	        }
	    }
	     int maxrigth=Math.min(row,board.length-col-1);
	    for(int i=1;i<=maxrigth;i++){
	        if(board[row-i][col+i]){
	            return false;
	        }
	    }
	    return true;
	}
	public static void display(boolean board[][]){
	    for(boolean []row:board){
	        for(boolean col :row){
	            if(col){
	                System.out.print("1");
	            }
	            else{
	                System.out.print(".");
	            }
	        }
	        System.out.println();
	    }
	}
}