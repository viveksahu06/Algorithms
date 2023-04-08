/*Tower of Hanoi is a mathematical puzzle where we have three rods (A, B, and C) and N disks.
Initially, all the disks are stacked in decreasing value of diameter i.e., the smallest disk 
is placed on the top and they are on rod A. The objective of the puzzle is to move the entire
stack to another rod (here considered C), obeying the following simple rules: 

Only one disk can be moved at a time.
Each move consists of taking the upper disk from one of the stacks and placing it on top of 
another stack i.e. a disk can only be moved if it is the uppermost disk on a stack.
No disk may be placed on top of a smaller disk.*/


public class RecursionTowerOfHanoi { 
    public static void towerOfHanoi(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println("transfer disk "+n+"from"+src+"to"+dest); 
            return;
        } 
        //transfer top n-1 from src to helper using dest as helper
        towerOfHanoi(n-1, src, dest, helper); 
        //transfer nth from src to dest 
        System.out.println("transfer disk "+n+"from"+src+"to"+dest); 
        //transfer n-1 from the helper to dest using source as helper 
        towerOfHanoi(n-1,helper,src,dest);
    }
    public static void main(String []args){
           int n=3; 
            towerOfHanoi(n,"A","B","C");
    }
}
