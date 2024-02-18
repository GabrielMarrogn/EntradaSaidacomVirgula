import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();

        String[] arr = a.split(",");

        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}
