package day4_Part2;
import java.io.File;

public class FileObject {
	  public static void main(String[] args) {

		    // creates a file object
		    File file = new File("G:\\CAPGEMINI");

		    // returns an array of all files
		    String[] fileList = file.list();

		    for(String str : fileList) {
		      System.out.println(str);
		    }
		  }

}
