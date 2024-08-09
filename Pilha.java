import jdk.jshell.spi.ExecutionControl;

public class Pilha<T> {
    private int top = -1;
    private T[] data;

    public Pilha(int size, T type){

        this.data = (T[]) new Object[size];
    }
    public void push(T value) throws Exception {
        if (this.isFull()) {
            throw new Exception("cheio");
        }
        this.top += 1;
        this.data[top] = value;
    }

    public T pop() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("vazio");
        }
        T lastValue = this.data[top];
        this.data[top] = null;
        this.top -= 1;

        return lastValue;
    }

    public void clear(){
        for (int i = 0; i < this.top; i++){
            this.data[i] = null;
        }
        this.top = -1;
    }

    public boolean isFull(){
        return this.data.length == this.top - 1;
    }

    public boolean isEmpty(){
        return top == -1;
    }
}
