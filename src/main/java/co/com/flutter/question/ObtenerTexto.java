package co.com.flutter.question;

import co.com.flutter.util.appium_flutter_driver.FlutterFinder;
import io.appium.java_client.AppiumDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.thucydides.core.annotations.Step;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class ObtenerTexto implements Question<String> {

    private String elementFlutter;

    public ObtenerTexto(String elementFlutter) {
        this.elementFlutter = elementFlutter;
    }

    public static ObtenerTexto delElementoFlutter(String elementFlutter){
        return new ObtenerTexto(elementFlutter);
    }

    public String answeredBy(Actor actor) {
        AppiumDriver driver = getProxiedDriver();
        FlutterFinder flutterFinder = new FlutterFinder(driver);
        return flutterFinder.byValueKey(elementFlutter).getText();
    }

}
