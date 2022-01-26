package co.com.flutter.interactions;

import co.com.flutter.util.appium_flutter_driver.FlutterFinder;
import io.appium.java_client.AppiumDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class ClickFlutter implements Interaction {

    private String key;

    public ClickFlutter(String key) {
        this.key = key;
    }

    public static ClickFlutter on(String key){
        return instrumented(ClickFlutter.class, key);
    }

    @Step("{0} da Click en #key")
    public <T extends Actor> void performAs(T actor) {
        AppiumDriver driver = getProxiedDriver();
        FlutterFinder flutterFinder = new FlutterFinder(driver);
        flutterFinder.byValueKey(key).click();
    }

}
