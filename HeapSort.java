public  class HeapSort{ 
          public static void swap(int arr[],int i,int j){
            int temp=arr[i]; 
            arr[i]=arr[j]; 
            arr[j]=temp;
           }
        public static void printArr(int arr[]){ 
            for(int i=0;i<arr.length;i++){
                                   System.out.print(arr[i]+" ");
                                }  
                            }
        public static void heapify(int arr[],int n,int index){
            int largest=index;  
            int l=2*index;
            int r=2*index+1;
            if(l<n && arr[l]>arr[largest]){
                largest=l;
             }
            if(r<n && arr[r]>arr[largest]){
                largest=r;
             }
            if(largest!=index){
            swap(arr,index,largest); 
            heapify(arr,n,largest);
         } 
    
        } 
        public static void buildHeap(int arr[],int n){
            for(int i=(n/2);i>=0;i--){
                heapify(arr, n, i);
            }
        } 
        public static void heapSort(int arr[],int n){
            for(int i=n-1;i>=0;i--){
                swap(arr,0,i); 
                heapify(arr,i-1,0);
            }
        }
    
        public static void main(String []args){
            int arr[]={20,10,30,5,40,50,1,4,3,5,3,6};  
            buildHeap(arr,arr.length); 
            heapSort(arr,arr.length);
          printArr(arr);
        }
 }

    

