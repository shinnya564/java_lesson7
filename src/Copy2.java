import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Copy2 {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line;
			while((line = reader.readLine()) != null){
				System.out.println(line);
				line = reader.readLine();
			}
		}catch(IOException e){
			System.out.println(e);
		}
	}
}
