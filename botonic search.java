public class Main
{
    public static int abinnary(int []a,int k,int range){
        int l=0;
        int r=range;
        int mid=0;
        while(l<=r){
            mid=(l+r)/2;
            if(a[mid]==k){
                return mid;
            }
            else if(a[mid]<k){
                l=mid+1;
            }
            else{
                r=mid;
            }
        }
        return -1;
    }
    public static int dbinnary(int []a,int k,int range){
        int l=range;
        int r=a.length-1;
        int mid=0;
        while(l<=r){
            mid=(l+r)/2;
            if(a[mid]==k){
                return mid;
            }
            else if(a[mid]<k){
                r=mid;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    }
    public static int bbinnary(int []a){
        int l=0;
        int r=a.length-1;
        int mid=0;
        while(l<=r){
            mid=(l+r)/2;
           if(a[mid]>a[mid-1] && a[mid]>a[mid+1]){
               return mid;
           }
           else if(a[mid]>a[mid-1] && a[mid]<a[mid+1]){
               l=mid;
           }
           else{
               r=mid;
           }
        }
        return -1;
    }
    public static int search(int a[],int k,int bi){
        if(k ==a[bi]){
            return bi;
        }
        if(k>a[bi]){
            return -1;
        }
        int res=abinnary(a, k,bi-1);
        if(res!=-1){
            return res;
        }
        int res1=dbinnary(a,k,bi+1);
            if(res1!=-1){
                return res1;
            }
            return -1;
        
    } 
	public static void main(String[] args) {
	    int a[]={5,6,7,8,9,10,3,2,1};
	    int b=10;
	    int bi=bbinnary(a);
	    System.out.print(search(a,b,bi));
	
	}
}
