import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int No3 = A * (B % 10);
        int No4 = A * (B / 10 % 10);
        int No5 = A * (B / 100);
        int result = A * B;

        sb.append(No3).append("\n")
            .append(No4).append("\n")
            .append(No5).append("\n")
            .append(result);

        System.out.print(sb);
    }
}