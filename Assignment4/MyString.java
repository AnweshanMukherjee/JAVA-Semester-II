//Question2
class MyString{
    private char str[];
    private int length;
    MyString(){
        str = new char[80];
        length = 80;
        str[0] = '0';
    }
    MyString(char str1[]){
        str = new char[str1.length];
        length = str1.length;
        for(int i=0;i<str1.length;i++)
            str[i] = str1[i];
    }
}
