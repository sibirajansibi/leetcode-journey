import java.util.*;

class Allocator {

    private int[] mem;

    public Allocator(int n) {
        mem = new int[n];
    }
    
    public int allocate(int size, int mID) {
        int count = 0;
        
        for(int i = 0; i < mem.length; i++) {
            
            if(mem[i] == 0) {
                count++;
            } else {
                count = 0;
            }
            
            if(count == size) {
                int start = i - size + 1;
                
                for(int j = start; j <= i; j++) {
                    mem[j] = mID;
                }
                
                return start;
            }
        }
        
        return -1;
    }
    
    public int freeMemory(int mID) {
        int count = 0;
        
        for(int i = 0; i < mem.length; i++) {
            if(mem[i] == mID) {
                mem[i] = 0;
                count++;
            }
        }
        
        return count;
    }
}

/**
 * Your Allocator object will be instantiated and called as such:
 * Allocator obj = new Allocator(n);
 * int param_1 = obj.allocate(size,mID);
 * int param_2 = obj.freeMemory(mID);
 */