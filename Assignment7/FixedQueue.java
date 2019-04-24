//Question2
class FixedQueue{
    int ar[], front, rear;
    FixedQueue(){
        ar = new int[10];
        front = -1;
        rear = -1;
    }
    public void insert(int v){
        if(rear==ar.length-1)
            System.out.println("Queue Overflow");
        else{
            if(front==-1)
                front = 0;
            ar[++rear] = v;
        }
    }
    public int delete(){
        if(front==-1 || front>rear){
            System.out.println("Queue Underflow");
            return -1;
        }
        else{
            int v = ar[front];
            ar[front] = 0;
            front++;
            if(front>rear){
                front = 0;
                rear = 0;
            }
            return v;
        }
    }
    public void displayQueue(){
        for(int i=0;i<ar.length;i++)
            if(ar[i]!=0)
                System.out.print(ar[i]+"  ");
        System.out.println();
    }
}
