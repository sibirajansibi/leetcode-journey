class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        
        for(int num : students){
            q.offer(num);
        }
        for(int i = sandwiches.length-1;i>=0;i--){
            stack.push(sandwiches[i]);
        }
        int ro =0;
        while(!stack.isEmpty()&& !q.isEmpty()){
             int k = q.peek();
            if(stack.isEmpty()){
                break;
            }
            if(!stack.isEmpty()&& stack.peek()== q.poll()){
                stack.pop();
                ro= 0;
            }else{
                q.offer(k);
                ro++;
            }

            if( ro == q.size()){
                return q.size();
            }
        }
        
            return q.size();    
    }
}