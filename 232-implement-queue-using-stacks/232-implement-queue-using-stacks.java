class MyQueue {
    Stack<Integer> nstack;
    Stack<Integer>ostack;
    public MyQueue() {
        nstack=new Stack<>();
        ostack=new Stack<>();
    }
    
    public void push(int x) {
        nstack.push(x);
    }
    
    public int pop() {
        while(!nstack.isEmpty()){
            ostack.push(nstack.pop());
        }
        int temp= ostack.peek();
        ostack.pop();
        while(!ostack.isEmpty()){
            nstack.push(ostack.pop());
        }
        return temp;
    }
    
    public int peek() {
        while(!nstack.isEmpty()){
            ostack.push(nstack.pop());
        }
        int temp= ostack.peek();
        while(!ostack.isEmpty()){
            nstack.push(ostack.pop());
        }
        return temp;
        
    }
    
    public boolean empty() {
     if(nstack.isEmpty())return true;
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */