import java.util.Arrays;

class S541 {
    public String reverseStr(String s, int k) {
        char[] a=s.toCharArray();

        int i=k-1, j=k-2;
        while(i<a.length){
            char x=a[i];
            a[i]=a[j];
            a[j]=x;
            i +=2*k;
            j +=2*k;
        }
        s= Arrays.toString(a);
        return s;
    }
}
public class ProblemNo541 {
    public static void main(String[] args) {
        String s="abcdefgh";
        int k=2;
        S541 sc=new S541();
         String as=sc.reverseStr(s, k);
        System.out.println(as);
    }
}
