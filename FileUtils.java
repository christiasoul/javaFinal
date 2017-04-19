package movies;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import movies.MovieStorage;



public class FileUtils {
	
	//private static final String FILENAME = "E:\\test\\filename.txt";
	//private static final String FILENAME = "/Users/sanghamitrachowdhury/Documents/Personal/Cogswell/CS212/readFile.txt";
	private static final String FILENAME = "/";

	public static ArrayList<MovieStorage> readFileWithScanner(){
		System.out.println("readFileWithScanner");
		Scanner input = new Scanner(FILENAME);
		File file = new File(input.nextLine());
		ArrayList<MovieStorage> inputMovies = new ArrayList<MovieStorage>();
		//input = new Scanner(file);
		try {

//            File file = new File(input.nextLine());
//			
			int invoiceNum = 0;
            input = new Scanner(file);
			

            while (input.hasNextLine()) {
				String [] newLine = input.nextLine().split(",");
				String [] inGenres = newLine[3].split(" : ");
				if (newLine.length != 4) System.out.printf("Error improper formatting");
                inputMovies.add(new MovieStorage(newLine[0], newLine[1],
					newLine[2], inGenres));
            }
			
            //input.close();

        } catch (Exception ex) {
            System.out.printf("Some file error in FileUtils, readFilWithScanner");
        }
		finally{
			if (input != null){
				input.close();
				
			}
		}
		return inputMovies;
    }
	
   public static void readFileWithReader(){
	   BufferedReader br = null;
		FileReader fr = null;
		System.out.println("readFileWithReader");
		try {

			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);

			String sCurrentLine;

			br = new BufferedReader(new FileReader(FILENAME));

			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}

		} catch (IOException e) {
			System.out.println(" Error in opening file");
			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}
   }
	
	
	public static void main(String[] args) {
	
		readFileWithScanner();
		readFileWithReader();

	}

}

