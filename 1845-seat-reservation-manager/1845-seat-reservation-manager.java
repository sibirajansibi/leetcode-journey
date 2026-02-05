class SeatManager {
     PriorityQueue<Integer> Q;
    public SeatManager(int n) {
        Q = new PriorityQueue<>();
        for(int i = 1;i<=n;i++){
            Q.add(i);
        }
    }
    
    public int reserve() {
     return  Q.poll();
    }
    
    public void unreserve(int seatNumber) {
        Q.offer(seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */