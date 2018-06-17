package countingsort;

public class CountingSort {
	public void sort(int []a,int b[],int k){
		int []c=new int[k+1];
		for(int i=1;i<a.length;i++){
			c[a[i]]+=1;
		}
		for(int i=1;i<c.length;i++){
			c[i]+=c[i-1];
		}
		for(int i=a.length;i>=1;i--){
			b[c[a[i]]]=a[i];
			c[a[i]]--;
		}
	}
}
