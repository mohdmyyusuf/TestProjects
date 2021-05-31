package DataStructures;

public class StackImp {
	
	int size;
	int top;
	char a[];
	
	 boolean isEmpty()
	    {
	        return (top < 0);
	    }
	 
	 StackImp(int n)
	    {
	        top = -1;
	        size = n;
	        a = new char[size];
	    }
	      
	 boolean push(char x)
	    {
	        if (top >= size)
	        {
	        	System.out.println("Stack Overflow");
	        	return false;
	        }
	        else
	        {
	            a[++top] = x;
	            return true;
	        }
	    }
	 
	 char pop()
	    {
	        if (top < 0)
	        {
	        	System.out.println("Stack Underflow");
	        	return 0;
	        }
	        else
	        {
	            char x = a[top--];
	            return x;
	        }
	    }
	 
	 public void displayStack() {
		 
		 int i = 0;
		 while(i<size) {
			 
			 System.out.println(a[i]);
			 i++;
		 }
		 
	 }
	  public static void main(String[] args) {
		
		  StackImp obj = new StackImp(5);
		  obj.push('m');
		  obj.push('o');
		  obj.push('h');
		  obj.push('d');
		  obj.push('y');
		  obj.pop();
		  obj.pop();
		  obj.isEmpty();
		  
		  obj.displayStack();
		  
	}

}
