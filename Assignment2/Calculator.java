//Question5
class Calculator{
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[2]);
        String operator = args[1];
        int result = 0;

        switch(operator){
            case "+":
                result = x+y;
                break;
            case "-":
                result = x-y;
                break;
            case "X":
            case "x":
                result = x*y;
                break;
            case "/":
                result = x/y;
                break;
            default:
                System.out.println("Invalid expression");
                result = -1;
        }

        if(result!=-1)
            System.out.println("Result = "+result);
    }
}
