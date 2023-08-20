package co.com.choucair.certificado.proyectobase.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
@RunWith(CucumberWithSerenity.class) //-> Para trabajar con Cucumber y Serenity
//@RunWith(SerenityRunner.class)
//@RunWith(JUnit4.class)
@CucumberOptions(
        features = "src/test/resources/features/prueba.feature",
        glue = "co.com.choucair.certificado.proyectobase.stepdefinitions", //POM
        snippets = CucumberOptions.SnippetType.CAMELCASE, //navegarPaginaWeb
        plugin = "pretty",
        tags = "@InicioSesionExitoso"
)
//@RunWith(CucumberWithSerenity.class)
//@CucumberOptions(features = "src/test/resources/features/demo.feature",
  //      tags = "@tag1",
    //    glue = "co.com.choucair.certificado.proyectobase.stepdefinitions",
      //  snippets = SnippetType.CAMELCASE)
public class runnerTags {
}
