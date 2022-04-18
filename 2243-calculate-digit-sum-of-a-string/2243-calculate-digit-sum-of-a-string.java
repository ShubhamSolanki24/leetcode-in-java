class Solution {
    public String digitSum(String s, int k) {
        while(s.length() >k){
            char[] arr= s.toCharArray();
            s = "";
            int i =0;
            while(i<arr.length){
                int k1= k;
                int sum =0;
                while(i <arr.length && k1-- >0){
                    sum+= (arr[i] -'0');
                    i++;
                }
                s= s+""+sum;
            }
        }
        return s;
    }
}