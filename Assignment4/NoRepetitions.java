//Question 5
class NoRepetitions{
    public static void main(String[] args) {
        int i, j;
        for(i=0;i<args.length;i++){
            for(j=i+1;j<args.length;j++)
                if(args[i].equals(args[j]))
                    break;
            if(j==args.length)
                System.out.print(args[i]+" ");
        }
        System.out.println();
    }
}
