/* Package */
package julse.fortitude;

/* Imports (none) */

/**
 *
 * @param <Generator>
 * 
 * @author julse
 * @version 1.0.0
 * @since 1.0.0
 */

public class Password
        <Generator extends PasswordGenerator>
{
    private String description;
    private String password;
    private Generator generator;
    
    public Password(String desc, Generator passGen)
    {
        this.description = desc;
        this.generator = passGen;
        this.password = generator.generate();
    }
    
    public Password(String desc, String newPass, Generator passGen)
    {
        this.description = desc;
        this.generator = passGen;
        this.password = newPass;
    }
    
    public String getDescription()
    {
        return this.description;
    }
    
    public void setDescription(String desc)
    {
        this.description = desc;
    }
    
    public String getPassword()
    {
        return this.password;
    }
    
    public void setPassword(String newPass)
    {
        this.password = newPass;
    }
    
    public void resetPassword()
    {
        this.password = this.generator.generate();
    }
    
    public void setGenerator(Generator passGen)
    {
        this.generator = passGen;
    }
}
