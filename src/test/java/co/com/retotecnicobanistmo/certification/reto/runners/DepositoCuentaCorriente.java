package co.com.retotecnicobanistmo.certification.reto.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@CucumberOptions(
        features = "src/test/resources/features/TiposDepositos.feature",
        glue = "co.com.retotecnicobanistmo.certification.reto.stepdefinitions")
@RunWith(CucumberWithSerenity.class)
public class DepositoCuentaCorriente {}
