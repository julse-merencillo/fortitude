/* Package */
package julse.fortitude;

/* Imports */
import javax.swing.UnsupportedLookAndFeelException;
import com.formdev.flatlaf.FlatLightLaf;
import java.io.IOException;
import javax.swing.plaf.metal.MetalLookAndFeel;

/**
 * The graphical front-end to Fortitude, the password manager.
 * 
 * @author julse
 * @version 1.0.0
 * @since 1.0.0
 */
public class Fortitude
{
    protected static PasswordList passwordLists = new PasswordList();
    
    public static void main(String[] args) 
            throws ClassNotFoundException, InstantiationException, 
                   IllegalAccessException, UnsupportedLookAndFeelException, 
                   IOException
    {
        try
        {
            /* Sets the look and feel to FlatLightLaf */
            javax.swing.UIManager.setLookAndFeel(new FlatLightLaf());
        }
        catch (UnsupportedLookAndFeelException err) 
        {
            /* Failsafe; sets the look and feel to Metal */
            javax.swing.UIManager.setLookAndFeel(new MetalLookAndFeel());
        }
                
        FortitudeMainPage mainpage = FortitudeMainPage.createSingleInstance();
        mainpage.setVisible(true);
        
        System.out.println("hello world");
        
        
    }
    
}
