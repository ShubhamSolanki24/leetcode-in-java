class CombinationIterator {

   Queue<String> combinationQueue;
    
    public CombinationIterator(String characters, int combinationLength) {
        combinationQueue = new LinkedList<>();
        generateCombinations(characters, 0, "", combinationLength);
    }
    
    private void generateCombinations(String chars, int start, String soFar, int k) {
        if(k == 0) {
            combinationQueue.add(soFar);
            return;
        }
        for(int i=start;i<chars.length();i++) {
            generateCombinations(chars, i+1, soFar + chars.charAt(i), k-1);
        }
    }
    
    public String next() {
        return combinationQueue.poll();
    }
    
    public boolean hasNext() {
        return !combinationQueue.isEmpty();
    }
}

/**
 * Your CombinationIterator object will be instantiated and called as such:
 * CombinationIterator obj = new CombinationIterator(characters, combinationLength);
 * String param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */