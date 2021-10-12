/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        return st.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    public String nextLing() {
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            System.out.println(e);
        }
        return str;
    }
}

class Codechef
{
    public static boolean check2dMat(long[][] a, long[][] b, long r, long c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (a[i][j] != b[i][j])
                    return false;
            }
        }
        return true;
    }

    public static String consecutiveAdding(long a[][], long b[][], long r, long c, long x) {
        int k;long diff;
        if (c < x && r < x) {
            if (check2dMat(a, b, r, c))
                return "Yes";
            else return "No";
        } else if (r < x) {
            for(int i=0;i<r;i++){
                for(int j=0;j<=(c-x);j++){
                    if(a[i][j]==b[i][j]){
                        continue;
                    }else{
                        diff=b[i][j]-a[i][j];
                        a[i][j]+=diff;
                        k=1;
                        while(k<x){
                            a[i][j+k]+=diff;
                            k++;
                        }
                    }
                }
            }
            if (check2dMat(a, b, r, c))
                return "Yes";
            else return "No";
        } else if (c < x) {
            for(int i=0;i<c;i++){
                for(int j=0;j<=(r-x);j++){
                    if(a[j][i]==b[j][i]){
                        continue;
                    }else{
                        diff=b[j][i]-a[j][i];
                        a[j][i]+=diff;
                        k=1;
                        while(k<x){
                            a[j+k][i]+=diff;
                            k++;
                        }
                    }
                }
            }
            if (check2dMat(a, b, r, c))
                return "Yes";
            else return "No";
        } else if (r >= x && c >= x) {
            for(int i=0;i<r;i++){
                for(int j=0;j<=(c-x);j++){
                    if(a[i][j]==b[i][j]){
                        continue;
                    }else{
                        diff=b[i][j]-a[i][j];
                        a[i][j]+=diff;
                        k=1;
                        while(k<x){
                            a[i][j+k]+=diff;
                            k++;
                        }
                    }
                }
            }
            for(int i=0;i<c;i++){
                for(int j=0;j<=(r-x);j++){
                    if(a[j][i]==b[j][i]){
                        continue;
                    }else{
                        diff=b[j][i]-a[j][i];
                        a[j][i]+=diff;
                        k=1;
                        while(k<x){
                            a[j+k][i]+=diff;
                            k++;
                        }
                    }
                }
            }
            if (check2dMat(a, b, r, c))
                return "Yes";
            else return "No";
        }
        return "none";
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try {
		            FastReader sc = new FastReader();
		    int t = sc.nextInt();
        while (t-- > 0) {
            long r = sc.nextInt();
            long c = sc.nextInt();
            long x = sc.nextInt();
            long[][] a = new long[(int)r][(int)c];
            for (int i = 0; i < r; ++i) {
                for (int j = 0; j < c; ++j) {
                    a[i][j] = sc.nextInt();
                }
            }
            long[][] b = new long[(int)r][(int)c];
            for (int i = 0; i < r; ++i) {
                for (int j = 0; j < c; ++j) {
                    b[i][j] = sc.nextInt();
                }
            }
//            for (int i = 0; i < r; ++i) {
//                for (int j = 0; j < c; ++j) {
//                    System.out.print(a[i][j]+" ");
//                }
//                System.out.println("");
//            }for (int i = 0; i < r; ++i) {
//                for (int j = 0; j < c; ++j) {
//                    System.out.print(b[i][j]+" ");
//                }
//                System.out.println("");
           
//              }
             System.out.println(consecutiveAdding(a, b, r, c, x));
        }
		}catch(Exception e) {
		}
	}
}
