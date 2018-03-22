import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;

public class CSVdata {
	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new FileReader(new File("books.csv")));
			System.out.println("File succesfully read! :)\n");
			String line = in.readLine();
			while (line != null) {
				String[] words = line.split(",");
				System.out.println("Title: " + words[0] + " - Price: "
						+ words[1] + " - Author: " + words[2]);
				line = in.readLine();
			}
			
		}
		catch (IOException ee) {
			System.out.println("IO EXCEPTION !! :(");
		}
	}
}
