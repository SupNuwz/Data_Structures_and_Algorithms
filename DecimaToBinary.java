
import java.util.*;
class DecimaToBinary{

int maxsize;
int stack[];
int top;

DecimaToBinary(int x)
{
this.maxsize=x;
stack=new int[maxsize];
top=-1;
}

public boolean isFull(){
return(top=maxsize-1);
}

public void push(int y)
{ if (!isFull())
 stack[++top]=y;
 }

 public static void main(String[]args){
	 int d;
 DecimaToBinary obj=new DecimaToBinary();

  Scanner scan = new Scanner(System.in);


         System.out.println("Enter decimal number");

         int num = scan.nextInt();

         while(num!=0)
          d=(num%2);
         obj.push(d);
         num=num/2;


         }
         }





