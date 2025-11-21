class CustomStack {
     
    int maxSize;
    List<Integer> list;

    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
        list = new ArrayList<>();
    }
    
    public void push(int x) {
        if (list.size() < maxSize) {
            list.add(x);
        }
    }
    
    public int pop() {
        if (list.isEmpty()) return -1;
        return list.remove(list.size() - 1);
    }
    
    public void increment(int k, int val) {
        int limit = Math.min(k, list.size());
        
        for (int i = 0; i < limit; i++) {
          list.set(i , list.get(i) + val);
        }
    }
}
