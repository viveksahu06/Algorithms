import javax.management.MBeanRegistrationException;

public class Merge_Sort { 
    public static void printArr(int arr[]){ 
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        } 
    } 
    public static void mergeSort(int arr[],int si,int ei){ 
        if(si>=ei){
            return ;
        }
            int mid=si+(ei-si)/2;
      //kaam for leftsub  
      mergeSort(arr,si,mid); 
      mergeSort(arr,mid+1,ei);  
             
          merge(arr,si,mid,ei);

    } 
    //merge method to image the sorted part 
    public static void merge(int arr[], int si, int mid, int ei){
        int temp[]=new int[ei-si+1]; 

          int i=si; //idx for 1st sorted part 

          int j=mid+1; //idx for 2nd sorted part 

          int k=0; //temp 
           
          while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i]; 
                i++;
            } 
            else {
                temp[k]=arr[j]; 
                j++;
            }  
            k++;

          } 
        // for leftover elements of 1st sorted part 
        while(i<=mid){
            temp[k++]=arr[i++];
        } 
        while(j<=ei){
            temp[k++]=arr[j++];
        } 
         
        //copy temp tp original array 
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }

    public static void main(String []args){ 
        int arr[]={2,1,-3,9,4,-6,5,8};   
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);

    }
}
