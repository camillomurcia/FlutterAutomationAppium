package co.com.flutter.stepdefinitions;

import co.com.flutter.interactions.ClickFlutter;
import co.com.flutter.question.ObtenerTexto;
import co.com.flutter.task.IncrementarODisminuir;
import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.flutter.userinterfaces.HomePage.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class ContadorSetpDefinition {


    @Before
    public void onStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Cuando("^(.*) incrementa el contador a (\\d+)$")
    @Dado("^que (.*) quiere incrementar el contador a (\\d+)$")
    public void invrementarContador(String actorName, int cantidadTaps) {
        theActorCalled(actorName).attemptsTo(
                IncrementarODisminuir.elContador(cantidadTaps, BTN_INCREMENTO)
        );
    }

    @Cuando("^el disminuye el contador a (\\d+)$")
    public void disminuirContador(int disminuirCantidadTaps) {
        theActorInTheSpotlight().attemptsTo(
                IncrementarODisminuir.elContador(disminuirCantidadTaps, BTN_DISMINUIR_CONTADOR)
        );
    }

    @Cuando("^el reinicia el contador$")
    public void reiniciarContador() {
        theActorInTheSpotlight().attemptsTo(
                ClickFlutter.on(BTN_REINICIAR_CONTADOR)
        );
    }



    @Entonces("^el debe observar el contador en (\\d+)$")
    public void verificarContador(int arg1) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.thatTheAnswerTo(ObtenerTexto.delElementoFlutter(LBL_CONTADOR)).isEqualTo(String.valueOf(arg1))
        );
    }
}
