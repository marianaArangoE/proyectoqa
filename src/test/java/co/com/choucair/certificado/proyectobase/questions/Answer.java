package co.com.choucair.certificado.proyectobase.questions;

import co.com.choucair.certificado.proyectobase.userinterface.SearchLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean>{
    private String question;
    public Answer(String question){
        this.question = question;
    }
    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        /*boolean result;
        Select options = new Select(driver.findElement(By.id("birthMonth")));
    options.selectByVisibleText("January");
    options.selectByIndex(1);
        String user = Text.of(SearchLoginPage.NAME).viewedBy(actor).asString;
        if (question.equals(user)){
            result = true;
        }
        else{
            result = false;

        }*/
        //return result;
        return null;
    }
}
