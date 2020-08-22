/**
* The Heap Program shows the heap operations i.e., insertion, removal and traversal.
*
* @author  Yug Rawal
* @version 1.0
* @since   2020-08-22
*/

package DS;
public class Heap {
	public static void main(String args[]) {
		HeapOperations ho=new HeapOperations();
		int heap[]= {-1,2,5,6,9,7};
		heap=ho.insertion(heap, 1);
		ho.traverse(heap);
		heap=ho.removal(heap);
		ho.traverse(heap);
		
		
	}
}
class HeapOperations{
	int[]insertion(int heap[],int a){
		int heap2[]=new int[heap.length+1];
		int i;
		for(i=0;i<heap.length;i++) {
			heap2[i]=heap[i];
		}
		heap2[heap2.length-1]=a;
		for(i=heap2.length-1;i>=1;) {
			int x=heap2[i/2];
			if(x>heap2[i]) {
				//int temp=x;
				heap2[i/2]=heap2[i];
				heap2[i]=x;
			i=i/2;
		
			}
			else {
				break;
			}
		
		}
			
		return heap2;
	}
	int[]removal(int heap[]){
		int heap2[]=new int[heap.length-1];
		heap2[1]=heap[heap.length-1];
		heap2[0]=-1;
		int i,x;
		for(i=2;i<heap.length-1;i++) {
			heap2[i]=heap[i];
		}
		for(i=1;i<=heap2.length/2;) {
			x=heap2[i];
			
			if((2*i<=heap2.length-1)&&(2*i+1<=heap2.length-1)&&(heap2[2*i]<heap2[2*i+1])&&(x>heap2[2*i])) {
				heap2[i]=heap2[2*i];
				heap2[2*i]=x;
				i=i*2;
			}
			else if((2*i<=heap2.length-1)&&(2*i+1<=heap2.length-1)&&(heap2[2*i]>heap2[2*i+1])&&(x>heap2[2*i+1])) {
				heap2[i]=heap2[2*i+1];
				heap2[2*i+1]=x;
				i=i*2;
			}
			else {
				break;
			}
			
			
		}
		
		return heap2;
	}
	
	void traverse(int heap[]) {
		int i=0;
		for(i=1;i<heap.length;i++) {
			System.out.print(heap[i]);
			
		}
		System.out.println();
	}

}
