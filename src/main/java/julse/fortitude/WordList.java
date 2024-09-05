/* Package */
package julse.fortitude;

/* Imports */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;

/**
 *
 * @author julse
 * @version 1.0.0
 * @since 1.0.0
 */
public class WordList
        extends PasswordGenerator
{
    private ArrayList<String> wordList;
    
    public WordList(int length, String filePath) 
            throws FileNotFoundException, IOException
    {
        super(length);
        
        this.wordList = pullWordsFrom(new File(filePath));
    }
    
    @Override
    public String generate()
    {
        String output = "";
        SecureRandom randomizer = new SecureRandom();
        
        for (int i = 0; i < this.passLength; i++)
        {
            int selected = randomizer.nextInt(this.wordList.size());
            output += this.wordList.get(selected) + " ";
        }
        
        return output;
    }
    
    public ArrayList<String> getWordList() 
    {
        return wordList;
    }
    
    public void setWordList(String filePath) 
            throws FileNotFoundException, IOException
    {
        this.wordList = pullWordsFrom(new File(filePath));
    }
    
    private ArrayList<String> pullWordsFrom(File wordFile) 
            throws FileNotFoundException, IOException
    {        
        /* This method will fail if wordFile is non-existent */
        if (!wordFile.isFile())
        {
            return null;
        }
        
        BufferedReader reader = new BufferedReader(new FileReader(wordFile));
        ArrayList<String> output = new ArrayList<>();
        String row;
        
        /* Reads all the words in the file and adds them onto the list. */
        while ((row = reader.readLine()) != null)
        {
            output.add(row);
        }

        return output;
    }
}