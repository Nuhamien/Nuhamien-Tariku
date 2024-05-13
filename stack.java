package 2;
class stack {
    int [] numArray;
    int top;
    int size;
    public stack(int capacity) {
        numArray = new int[capacity];
        top = -1;
        size = 0;
    }

    public int size(){
    return size;
}
void push(int value) {
    if(top < numArray.length-1){
        numArray[++top] = value;
        size++;
    }
    else{
        System.out.println("Stack is full");
    }
}
public int pop(){
    if(top >= 0){
        int data = numArray[top--];
        size--;
        return data;
    }
    return -1;
}
public static void main(String[] args) {
    stack numstack = new stack(5);
    numstack.push(11);
    numstack.push(22);
    numstack.push(33);
    numstack.push(44);
    numstack.push(55);
    numstack.pop();
    numstack.pop();
    for(int i=0; i<numstack.size(); i++){
        System.out.println(numstack.numArray[i]);
    }
}
}

