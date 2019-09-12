 class StackArray {
private int maxSize; // size of stack array
private int[] stackData;
private int top; // top of stack
// ------------------------------------------
public StackArray(int s) {
top = -1;//no items yet
maxSize = s;//set array size
stackData = new int[maxSize];//create array
} // constructor
public boolean isEmpty() {
return top == -1;
} // true if stack is empty
public boolean isFull() {
return (top == maxSize - 1);
}
public void push(int j) {
stackData[++top] = j;
} // put item on top of stack
public int pop() throws Exception {
int result;
if (isEmpty()) {
throw new Exception("Stack is Empty");
} else {
result = stackData[top];
//stackData[top] = 0;
top--;
}
return result;
} // take item from top of stack
public int peek() throws Exception {
int result = 0;
if (isEmpty()) {
throw new Exception("Stack is Empty");
} else {
result = stackData[top];
}
return result;
} // peek at top of stack
public void display() {
System.out.println("Current List Values are :");
for (int i = top; i >= 0; i--) {
System.out.println(stackData[i]); //print array values
}
System.out.println(stackData.length); //check the length of array
System.out.println(top); //check the value of the top
}
}public class StackArrayApp {
public static void main(String[] args) {
StackArray sa = new StackArray(5);
try {
System.out.println(sa.isFull()); //false
System.out.println(sa.isEmpty()); //true
sa.push(10);
sa.push(11);
sa.push(12);
sa.push(20);
sa.push(30);
sa.display(); //top=4 length=5
System.out.println(sa.isFull()); //true
System.out.println(sa.isEmpty()); //false
System.out.println(sa.peek() + " is the current first value of the List");
System.out.println(sa.pop() + " is deleted");
System.out.println(sa.pop() + " is deleted");
System.out.println(sa.peek() + " is the current first value of the List");
sa.display();//top=2 length=5
System.out.println(sa.isFull()); //false
System.out.println(sa.isEmpty()); //false
Conversion obj2 = new Conversion();
obj2.decimalToBinary(20);
} catch (Exception e) {
System.out.println(e.getMessage());
}
}
}
 class Conversion { private int remainder; private int count; private int val; public Conversion() { remainder = 0; count = 0; } public void decimalToBinary(int num)throws Exception { StackArray sa =new StackArray(8); while(num > 0) { remainder = num % 2; sa.push(remainder); num = num/2; count++; } System.out.print("Binary Number : "); for(int x=1; x<=count; x++) { val = sa.pop(); System.out.print(val); } System.out.println();
}
}