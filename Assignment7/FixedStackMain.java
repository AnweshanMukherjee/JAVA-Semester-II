//Question1
class FixedStackMain{
    public static void main(String[] args) {
        FixedStack s = new FixedStack();
        s.push(7);
        s.displayStack();
        s.push(3);
        s.displayStack();
        System.out.println("Popped: "+s.pop());
        s.displayStack();
        s.push(4);
        s.displayStack();
        s.push(5);
        s.displayStack();
        System.out.println("Popped: "+s.pop());
        s.displayStack();
    }
}
