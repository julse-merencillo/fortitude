/* Package */
package julse.fortitude;

/* Imports (none) */

/**
 * The {@code PasswordGenerator} class represents password generators of many
 * kinds, defined by its various implementations. Password generators output
 * strings of characters to serve as passwords, depending on what rule is set
 * for each generator.
 * <p>
 * Users are allowed to set the length of passwords to be generated. This length
 * usually means character length, but implementations ultimately decide what
 * length means for generating passwords. However, if the user sets an invalid
 * password length, it is automatically set to the default length of
 * {@value DEFAULT_LENGTH}.
 * 
 * @author julse
 * @version 1.0.0
 * @since 1.0.0
 */
public abstract class PasswordGenerator
{
    /**
     * The default password length to be used, which is {@value DEFAULT_LENGTH}.
     * Applies whenever an invalid password length is supplied.
     */
    public static final int DEFAULT_LENGTH = 20;
    
    /**
     * The length of the password to be generated.
     */
    protected int passLength;
    
    /**
     * Creates a new password generator that generates passwords of a certain
     * length. Can only be invoked by its subclasses.
     * 
     * @param length The length of the password to be generated. Must be a 
     * positive non-zero value; otherwise it is replaced with 
     * {@link DEFAULT_LENGTH}.
     */
    protected PasswordGenerator(int length)
    {
        if (length <= 0)
        {
            this.passLength = DEFAULT_LENGTH;
        }
        else
        {
            this.passLength = length;
        }
    }
    
    /**
     * Generates the password. Serves as the main interface across all password
     * generators.
     * 
     * @return A string of characters representing the password.
     */
    public abstract String generate();
    
    /**
     * Gets the password length to be generated.
     * 
     * @return The length of the password to be generated.
     */
    public int getPassLength()
    {
        return this.passLength;   
    }
    
    /**
     * Sets the password length to be generated.
     * 
     * @param length The length of the password to be generated. Must be a 
     * positive non-zero value; otherwise it is replaced with 
     * {@link DEFAULT_LENGTH}.
     */
    public void setPassLength(int length)
    {
        if (length <= 0)
        {
            this.passLength = DEFAULT_LENGTH;
        }
        else
        {
            this.passLength = length;
        }
    }
}