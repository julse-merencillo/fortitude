/* Package */
package julse.fortitude;

/* Imports */
import java.security.SecureRandom;

/**
 * The {@code RandomCharacters} class represents password generators that
 * randomly select characters from a list. This list can be defined by the user,
 * although if it is invalid (see {@code RandomCharacters}'s constructor for
 * details), {@link DEFAULT_CHARSET} is used instead.
 * 
 * @author julse
 * @version 1.0.0
 * @since 1.0.0
 */
public class RandomChars 
        extends PasswordGenerator
{
    /**
     * The default character set to be used. Applies whenever an invalid
     * character set is used.
     */
    public static final String DEFAULT_CHARSET =
            "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    
    /**
     * A list of characters which the password generator chooses from.
     */
    private String charList;
    
    /**
     * Creates a new password generator that generates passwords by randomly
     * selecting characters from a list. 
     * 
     * @param length The character length of the password to be generated. Must 
     * be a positive non-zero value; otherwise it is replaced with 
     * {@link DEFAULT_LENGTH}.
     * @param charSet A list of characters to be randomly chosen from. If the
     * number of distinct characters is less than 2, it is replaced with
     * {@link DEFAULT_CHARSET}.
     */
    public RandomChars(int length, String charSet)
    {
        super(length);
        
        /* If the number of distinct characters is 0, it is an empty string. */
        if (charSet.chars().distinct().count() < 2)
        {
            this.charList = DEFAULT_CHARSET;
        }
        else
        {
            this.charList = charSet;
        }
    }

    /**
     * Generates the password. This password is composed of random characters
     * selected from {@link charList}.
     * 
     * @return A string of random characters chosen from {@link charList}.
     */
    @Override
    public String generate()
    {
        String output = "";
        SecureRandom randomizer = new SecureRandom();
        
        for (int i = 0; i < this.passLength; i++)
        {
            int selected = randomizer.nextInt(this.charList.length());
            output += this.charList.charAt(selected);
        }
        
        return output;
    }
    
    /**
     * Gets the character list used by the password generator.
     * 
     * @return The list of characters from {@link charList}.
     */
    public String getCharList()
    {
        return this.charList;
    }
    
    /**
     * Sets the character list to be used by the password generator.
     * 
     * @param charSet A list of characters to be randomly chosen from. If the
     * number of distinct characters is less than 10, it is replaced with
     * {@link DEFAULT_CHARSET}.
     */
    public void setCharList(String charSet)
    {
        /* If the number of distinct characters is 0, it is an empty string. */
        if (charSet.chars().distinct().count() < 10)
        {
            this.charList = DEFAULT_CHARSET;
        }
        else
        {
            this.charList = charSet;
        }
    }   
}