class Solution {
    public int maximumSwap(int num) {
      if(num==0) return 0;
        char[] digits = String.valueOf(num).toCharArray();
       
        //prepare the last index of digits 
       
        int[] li = new int[10];
        for(int i=0;i<digits.length;i++){
             li[digits[i]-'0']=i;
        }
        
        //figure out position of swapping 
        
        for(int i=0;i<digits.length;i++){
            for(int j=9;j>digits[i]-'0';j--){
                if(li[j]>i){
                    swap(digits,i,li[j]);
                    return Integer.parseInt(String.valueOf(digits));
                }
            }
        }
        return num;
        
    }
    static void swap(char[] arr,int i,int j){
        char t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }    
    
}