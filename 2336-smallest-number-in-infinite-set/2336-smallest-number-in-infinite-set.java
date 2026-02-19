class SmallestInfiniteSet {

    private Queue<Integer> q;
    private Set<Integer> set;
    private  int marker;

    public SmallestInfiniteSet() {
        q = new PriorityQueue<>();
        set = new HashSet<>();
        marker = 1;
    }
    
    public int popSmallest() {   
        if(!q.isEmpty()){
            int small = q.remove();
            set.remove(small);
            return small;
        }
        return marker++;
    }
    
    public void addBack(int num) {
        if(num < marker && !set.contains(num)){
            set.add(num);
            q.offer(num);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */