class SmallestInfiniteSet {


    HashMap<Integer, Integer>map;
    public SmallestInfiniteSet() {
        map = new LinkedHashMap<>();
       for(int i  = 1;i<=1000;i++){
        map.put(i , 1);
       }
    }
    
    public int popSmallest() {
        for(int key : map.keySet()){
            if(map.get(key) >=1){
              map.put(key , 0);
              return key;
            }
        }
        return -1;
    }
    
    public void addBack(int num) {
    
       if(map.get(num) == 0){
        map.put(num , 1);
       }
     

       
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */