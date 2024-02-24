import java.util.Arrays;

public class CISStack<T> {

    // Array property.
    private T[] stack;

    // Size property.
    private int size;

    // Pointer property
    //points to the last added element, a.k.a. the top of the stack
    private int top;

    // Constructor.
    public CISStack(int stackSize){
        stack = (T[]) new Object[stackSize];
        size = 0;
        top = -1;
    }

    // Push. This method pushes a value onto the top of the stack.
    public void push(T data){
        if (size >= stack.length){
            System.out.println("ERROR! Stack is full");
        }
        else{
            top++;
            stack[top] = data;
            size++;
        }
    }

    // Pop. This method pops a value from the top of the stack.
    public T pop(){
        if (size == 0){
            System.out.println("ERROR! Stack is empty");
            return null;
        }
        else{
            T poppedValue = stack[top];
            stack[top] = null;
            top--;
            size--;
            return poppedValue;
        }
    }

    // isEmpty. Returns a boolean indicating whether the linked list is empty.
    public boolean isEmpty(){
        return (size == 0);
    }

    // size. Returns the size of the queue.
    public int size(){
        return this.size;
    }

    // toString. Returns a description of the queue in, for example, the following format:
    // CISStack{stack=[7, 11], size=2, pointer=1}
    public String toString(){
        String stackElements = "";
        for (int i = 0; i < stack.length - 1; i++){
            stackElements += stack[i] + ", ";
        }
        stackElements += stack[stack.length - 1];
        return "CISStack{stack=[" + stackElements + "], size=" + this.size + ", pointer=" + this.top + "}";
    }
}
