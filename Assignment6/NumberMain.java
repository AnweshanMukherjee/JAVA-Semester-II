//Question5
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class NumberMain{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Decimal num = ");
        int num = Integer.parseInt(br.readLine());
        HexNum obj1 = new HexNum(num);
        OctalNum obj2 = new OctalNum(num);
        obj1.displayNum();
        obj2.displayNum();
    }
}
