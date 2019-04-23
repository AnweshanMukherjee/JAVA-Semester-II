//Question2
class MyString{
    private char str[];
    private int length;
    MyString(){
        str = new char[80];
        str[0] = '0';
        length = 80;
    }
    MyString(char s[]){
        str = new char[s.length];
        for(int i=0;i<s.length;i++)
            str[i] = s[i];
        length = s.length;
    }
    MyString(MyString obj){
        this(obj.str);
    }
    boolean myStartsWith(char ar[]){
        for(int i=0;i<ar.length;i++)
            if(str[i]!=ar[i])
                return false;
        return true;
    }
    boolean myEndsWith(char ar[]){
        int pos = 1;
        for(int i=ar.length-1;i>=0;i--){
            if(ar[i]!=str[length-pos])
                return false;
            pos++;
        }
        return true;
    }
    char myCharAt(int pos){
        return str[pos];
    }
    public static void main(String[] args) {
        char s1[] = {'a', 'b', 'c', '1'};
        char s2[] = {'a', 'b'};
        char s3[] = {'c', '1'};
        MyString obj = new MyString(new MyString(s1));
        System.out.println(obj.myEndsWith(s2));
        System.out.println(obj.myEndsWith(s3));
        System.out.println(obj.myCharAt(2));
    }
}
