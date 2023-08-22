package co.com.choucair.certificado.proyectobase.task;

import co.com.choucair.certificado.proyectobase.userinterface.SearchLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Write implements Task {
    private String Credentials;
    public Write (String Credentials){
        this.Credentials = Credentials;
    }
    public static Write the(String Credentials) {
        return Tasks.instrumented(Write.class,Credentials);
    }
    @Override
    public <T extends Actor> void performAs (T actor){
        actor.attemptsTo(Click.on(SearchLoginPage.NAME),
                Enter.theValue("Ingresa el nombre").into(SearchLoginPage.NAME),
                Enter.theValue("Ingresa el apellido").into(SearchLoginPage.LAST_NAME),
                Enter.theValue("Ingresa el email").into(SearchLoginPage.EMAIL),
                Enter.theValue("Ingresa el mes de nacimiento").into(SearchLoginPage.MONTH),
                Click.on(SearchLoginPage.BUTTON_NEXT),
                Click.on(SearchLoginPage.BUTTON_DEVICES)


                );

    }
}
