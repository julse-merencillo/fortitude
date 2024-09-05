/* Package */
package julse.fortitude;

/* Imports */
import java.util.ArrayList;

/**
 *
 * 
 * @author julse
 * @version 1.0.0
 * @since 1.0.0
 * 
 */
public class PasswordList
{
    private final ArrayList<Password> passwordList;
    
    public PasswordList()
    {
        this.passwordList = new ArrayList<>();
    }
    
    public void add(Password pwd)
    {
        this.passwordList.add(pwd);
    }
    
    public Password retrieveAt(int index)
    {
        return this.passwordList.get(index);
    }
    
    public void resetPassAt(int index)
    {
        this.passwordList.get(index).resetPassword();
    }
    
    public void resetAllPass()
    {
        for (Password pwd : this.passwordList)
        {   
            pwd.resetPassword();
        }
    }
    
    public void deleteAt(int index)
    {
        this.passwordList.remove(index);
    }
    
    public int getSize()
    {
        return this.passwordList.size();
    }
}
