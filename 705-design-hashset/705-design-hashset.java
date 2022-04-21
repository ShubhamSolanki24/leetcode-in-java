class MyHashSet {
 /* boolean[] set =null;
    public MyHashSet() {
   set= new boolean[1000001];        
    }
    
    public void add(int key) {
       set[key] =true; 
    }
    
    public void remove(int key) {
        set[key] =false;
    }
    
    public boolean contains(int key) {
        return set[key];
    }
    
    */
    
      ArrayList<Integer> arr;

    public MyHashSet() {
        arr = new ArrayList<>();
    }
    
    public void add(int key) {
         if(!arr.contains(key)){               // add only if the array doesnt contain the same key
             arr.add(key);
         }
    }
    
    public void remove(int key) {
        if(arr.contains(key)){
            arr.remove(arr.indexOf(key));               // remove only if array contains that key
        }
    }
    
    public boolean contains(int key) {
        return arr.contains(key);
}
}
/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */