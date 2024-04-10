class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
    Deque <Integer>dq=new ArrayDeque <>();
    Arrays.sort(deck);
    int arr[]=new int[deck.length];

    for(int i=deck.length-1;i>=0;i--){
        if(!dq.isEmpty()){
            dq.addFirst(dq.removeLast());
        }
        dq.addFirst(deck[i]);
    }
    for(int i=0;i<arr.length;i++){
        arr[i]=dq.removeFirst();
    }
    return arr;
    
    }
}