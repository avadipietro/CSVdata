import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;

public class CSVdata {
	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new FileReader(new File("books.csv")));
			System.out.println("File read!\n");
			String line = in.readLine();
			while (line != null) {
				System.out.println(line);
				line.split(",");
				line = in.readLine();
			}
			
		}
		catch (IOException ee) {
			System.out.println("IO EXCEPTION !! :(");
		}
	}
}
