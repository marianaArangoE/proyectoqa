package co.com.choucair.certificado.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchLoginPage {
    public static final Target NAME = Target.the("write the username").located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("write the password").located(By.id("lastName"));
    //public static final Target LOGIN_BUTTON = Target.the("button show it us from the login").located(By.id("kc-form-buttons"));
    public static final Target EMAIL = Target.the("write the password").located(By.id("email"));
    public static final Target MONTH = Target.the("write the password").located(By.id("birthMonth"));
    public static final Target DAY = Target.the("write the password").located(By.id("birthDay"));
    public static final Target YEAR = Target.the("write the password").located(By.id("birthYear"));
    public static final Target BUTTON_NEXT = Target.the("write the password").located(By.className("btn btn-blue"));
    public static final Target BUTTON_DEVICES = Target.the("write the password").located(By.className("btn btn-blue pull-right"));
    public static final Target PASSWORD = Target.the("write the password").located(By.name("password"));
    public static final Target PASSWORD_CONFIRMED = Target.the("write the password").located(By.name("confirmPassword"));
    public static final Target BUTTON_COMPLETE = Target.the("write the password").located(By.className("btn btn-blue"));




}

