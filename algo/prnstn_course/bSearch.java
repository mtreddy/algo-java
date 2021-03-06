import java.util.Arrays;
import java.io.*;
public class bSearch{
    public static int rank(int key, int[] a){
        int lo = 0;
        int hi = a.length - 1;
        while(lo <= hi) {
            int mid = lo + (hi - lo)/2;
            if (key < a[mid]) hi = mid - 1;
            else if( key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }
    public static int main(String args[]){
        int whitelist = System.in.readInts(args[0]);
        Arrays.sort(whitelist);
        while(!StdIn.isEmpty()) {
            key = StdIn.readInt();
            if(rank(key, whitelist) < 0) {
                StrdOut.println(key);
            }

        }
    }

}
