class MinStack {
    Stack<Long> stack = new Stack<>();
    Long min = Long.MAX_VALUE;
    public MinStack() {
    }
    
    public void push(int value) {
        Long val = (long)value;
        if(stack.isEmpty()){
            stack.push(val);
            min=val;
        }
        else{
            if(val>=min){
                stack.push(val);
            }
            else{
                stack.push((2*val)-min);
                min=val;
            }
        }
    }
    
    public void pop() {
        Long temp=stack.pop();
        if(temp<min){
            min=(2*min)-temp;
        }
    }
    
    public int top() {
        Long temp=stack.peek();
        if(temp<min){
            return min.intValue();
        }
        return temp.intValue();
    }
    
    public int getMin() {
        if(stack.isEmpty()){
            return 0;
        }
        return min.intValue();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */