package co.com.flutter.task;

import co.com.flutter.interactions.ClickFlutter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static co.com.flutter.userinterfaces.HomePage.BTN_INCREMENTO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IncrementarODisminuir implements Task {

    private int taps;
    private String element;

    public IncrementarODisminuir(int taps, String element) {
        this.taps = taps;
        this.element = element;
    }

    public static IncrementarODisminuir elContador(int taps, String element){
        return instrumented(IncrementarODisminuir.class,taps, element);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (int i = 0; i< taps;i++){
            actor.attemptsTo(
                    ClickFlutter.on(element)
            );
        }
    }
}
