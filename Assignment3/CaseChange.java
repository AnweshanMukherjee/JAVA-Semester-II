//Question8
class CaseChange{
    public static void main(String[] args) {
        System.out.println("Initial array:");
        displayArray(args);
        changeCase(args);
        System.out.println("Case changed array:");
        displayArray(args);
    }
    public static void changeCase(String ar[]){
        for(int i=0;i<ar.length;i++){
            String word = "";
            for(int j=0;j<ar[i].length();j++){
                if(ar[i].charAt(j)>='A' && ar[i].charAt(j)<='Z')
                    word += Character.toLowerCase(ar[i].charAt(j));
                else if(ar[i].charAt(j)>='a' && ar[i].charAt(j)<='z')
                word += Character.toUpperCase(ar[i].charAt(j));
            }
            if(word!="")
                ar[i] = word;
        }
    }
    public static void displayArray(String ar[]){
        for(int i=0;i<ar.length;i++)
            System.out.print(ar[i]+" ");
        System.out.println();
    }
}
