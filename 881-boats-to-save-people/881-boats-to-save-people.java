class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        
        int start =0;
        int end  =people.length-1;
        int count =0;
        
        while(end>=start){
            if(people[end]==limit){
                end--;count++;
            }else if(people[end] +people[start] <=limit){
                start++;
                end--;
                count++;  
            }else{
                end--;
                count++;
            }
        }
        return count;
    }
}