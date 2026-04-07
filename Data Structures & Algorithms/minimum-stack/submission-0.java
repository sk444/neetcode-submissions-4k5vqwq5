class MinStack 
{
    LinkedList<Integer> stack = new LinkedList<>();
    LinkedList<Integer> minStack = new LinkedList<>();

    public MinStack() {
    }
    
    public void push(int val)
    {
        stack.addFirst(val);

        if(minStack.isEmpty() || val <= minStack.getFirst())
        {
            minStack.addFirst(val);
        }  
    }
    
    public void pop()
    {
        if(stack.getFirst().equals(minStack.getFirst()))
        {
         minStack.removeFirst();
        }
        stack.removeFirst();
    }
    
    public int top() 
    {
        return stack.getFirst();
    }
    
    public int getMin() 
    {
      return minStack.getFirst();  
    }
}
