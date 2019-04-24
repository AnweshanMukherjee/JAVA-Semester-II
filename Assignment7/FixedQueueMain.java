//Question2
class FixedQueueMain{
    public static void main(String[] args) {
        FixedQueue obj = new FixedQueue();
        obj.insert(1);
        obj.displayQueue();
        obj.insert(2);
        obj.displayQueue();
        obj.insert(3);
        obj.displayQueue();
        System.out.println("Delete "+obj.delete());
        obj.displayQueue();
        obj.insert(4);
        obj.displayQueue();
        System.out.println("Delete "+obj.delete());
        obj.displayQueue();
    }
}
