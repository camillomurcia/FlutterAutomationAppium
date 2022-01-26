package co.com.flutter.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/contador.feature",
        glue = "co.com.flutter.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class FlutterTest {

}