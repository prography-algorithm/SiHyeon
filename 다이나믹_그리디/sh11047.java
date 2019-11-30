import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Main11047_동전 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] value = new int[N];
        for (int i = 0; i < N; i++) {
            int Ai = Integer.parseInt(br.readLine());
            value[i] = Ai;
        }
        
        int count = 0;
        for (int i = value.length-1; i >=0; i--) {
            if(value[i] > K) continue;
            else {
                int cnt = K / value[i];;
                count += cnt; 
                K = K - (cnt * value[i]);
            }
            
            if(K ==0) {
                break;
            }
        }
        
        System.out.println(count);
    }//end of main
}//end of class