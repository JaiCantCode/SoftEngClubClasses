import Pages.HealthClubHomePage;
import Entities.*;
import javax.swing.*;
import java.time.LocalDate;

public class SoftEngHealthClubSystem {

    public Guest user;

    public SoftEngHealthClubSystem(Guest g) {

        user = g;
        try {UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");}
        catch (Exception e) {System.out.println("Look and Feel not set");}

        HealthClubHomePage homePage = new HealthClubHomePage(null, user);
        homePage.welcomeText.setText("Welcome " + user.getName());
    }

    public static void main(String[] args){
        new SoftEngHealthClubSystem(new Guest("Jai","Fischer","jaifischer@gmail.com", LocalDate.of(2003,10,31), Long.parseLong("8477360066")));
    }
}
