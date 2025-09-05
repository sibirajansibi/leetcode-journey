class Solution {
    public int distributeCandies(int[] candyType) {
        int size = candyType.length/2;
        int max = 0;
    Set<Integer> set = new HashSet<>();
    for(int num : candyType){
        set.add(num);
    }if(set.size()<size){
        return set.size();
    }


    return size;


        

    }
}