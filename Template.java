import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class NewClass1
{
    static class FastReader {
        
        BufferedReader br;
        StringTokenizer st;
        
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        
        int nextInt() {
            return Integer.parseInt(next());
        }
        
        long nextLong() {
            return Long.parseLong(next());
        }
        
        double nextDouble() {
            return Double.parseDouble(next());
        }
        
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    
    static FastReader fs;

    static void in(int a[]) {
        for (int i = 0; i < a.length; i++) {
            a[i] = fs.nextInt();
        }
    }

    static void in(long a[]) {
        for (int i = 0; i < a.length; i++) {
            a[i] = fs.nextLong();
        }
    }

    static void in(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = fs.nextInt();
            }
        }
    }

    static void sort(int a[]) {
        Arrays.sort(a);
    }

    static void sort(long a[]) {
        Arrays.sort(a);
    }

    static void sort(String a[]) {
        Arrays.sort(a);
    }
    
    public static void main(String[] args) {
        fs = new FastReader();
        int t = fs.nextInt();
        while (t-- > 0) {
        }
        
    }     
}
