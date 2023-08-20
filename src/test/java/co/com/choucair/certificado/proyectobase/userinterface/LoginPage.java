package co.com.choucair.certificado.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage extends PageObject{
    public static final Target LOGIN_USER = Target.the("write the username").located(By.id("username"));
    public static final Target LOGIN_PASSWORD = Target.the("write the password").located(By.id("password"));
    public static final Target LOGIN_BUTTON = Target.the("button show it us from the login").located(By.id("kc-form-buttons"));


}
