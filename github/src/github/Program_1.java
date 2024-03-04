package github;
import java.io.File;
import java.io.IOException;

public class Program_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("c:\\hello/abc.txt");
		if(f.exists()==false) {
			try {
				f.createNewFile();
				System.out.println("file created");
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
		else {
			System.out.println("file already exist");
		}

	}

}

