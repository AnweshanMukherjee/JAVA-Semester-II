//Question1
class FixedStack implements InterfaceStack{
    int ar[], top;
    FixedStack(){
        ar = new int[10];
        top = -1;
    }
    public void push(int val){
        if(top==ar.length-1)
            System.out.println("Stack Overflow");
        else
            ar[++top] = val;
    }
    public int pop(){
        if(top<0){
            System.out.println("Stack Underflow");
            return -1;
        }
        int v = ar[top];
        ar[top] = 0;
        top--;
        return v;
    }
    void displayStack(){
        for(int i=0;i<ar.length;i++)
            if(ar[i]!=0)
                System.out.print(ar[i]+"  ");
        System.out.println();
    }
}
