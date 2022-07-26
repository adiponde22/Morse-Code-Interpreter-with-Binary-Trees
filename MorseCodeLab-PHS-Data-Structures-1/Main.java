import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
class Main
{
   public static void main(String[] args) throws FileNotFoundException 
    {
        File morseFile = new File("Morse.txt");
        Scanner morseScanner = new Scanner(morseFile);
        BinTree morseTree = new BinTree("");
        while (morseScanner.hasNextLine())
        {
          String full = morseScanner.nextLine();
          String letter = full.substring(0, 1);
          String morse = full.substring(2, full.length());
            morseTree.insert(letter, morse, 0);
        }
    }

    
}