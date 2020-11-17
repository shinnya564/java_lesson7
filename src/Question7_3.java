import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question7_3 {
	public static void main(String[] args) {
		System.out.println("<!DOCTYPE html>");
		System.out.println("<html>");
		System.out.println("<head>");
		System.out.println("<title>My pages</title>");
		System.out.println("</head>");
		System.out.println("<body>");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line;
			while((line = reader.readLine()) != null) {
				String s =line;
				int square = line.indexOf("■");
				int triangle = line.indexOf("●");
				if(square >= 0){
					s = s.replace("■","<h1>");
					System.out.println(s + "</h1>");
				}else if(triangle >= 0){
					s = s.replace("●","<h2>");
					System.out.println(s + "</h2>");
				}else {
					System.out.println("<p>" + s + "</p>");
				}
			}
		}catch(IOException e){
			System.out.println(e);
		}
		System.out.println("</body>");
		System.out.println("</html>");
	}
}
