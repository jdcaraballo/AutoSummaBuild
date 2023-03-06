package co.com.tcs.certificacion.runners.credits.add_new_fee;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = {"co.com.tcs.certificacion.stepdefinitions", "co.com.tcs.certificacion.setup"},
        features = "src/test/resources/co/com/tcs/certificacion/features/credits/new_fee/dtf_add_new_fee.feature",
        snippets= CucumberOptions.SnippetType.CAMELCASE,
        //tags = @FailedRegister,
        monochrome=true
)
public class DtfAddNewFee {
}
