package co.com.choucair.certificado.proyectobase.task;

import co.com.choucair.certificado.proyectobase.userinterface.ChoucairAcademyPage;
import co.com.choucair.certificado.proyectobase.userinterface.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(LoginPage.LOGIN_BUTTON),
                Enter.theValue("Ingresa el usuario").into(LoginPage.LOGIN_USER),
                Enter.theValue("Ingresa la contraseña").into(LoginPage.LOGIN_PASSWORD),
                Click.on(LoginPage.LOGIN_BUTTON)
                );


    }
}
