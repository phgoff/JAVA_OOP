import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Exception2 {
  public static void main(String[] args) {
    int total = 0;
    int num = 0;
    File myFile = null;
    Scanner inputFile = null;
    try{
		myFile = new File("inFile.txt");
		inputFile = new Scanner(myFile);
		while(inputFile.hasNext()){
				try{
					num = inputFile.nextInt();
					total += num;
				}
				catch(InputMismatchException ime)
				{
					System.out.println("Illegal value found");
					inputFile.next();
				}
		}
	}
    catch(FileNotFoundException fnf){
        System.out.println(fnf.getMessage());
    }
    System.out.println("The total value is " + total);
  }
}
