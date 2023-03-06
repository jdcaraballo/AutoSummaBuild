package co.com.tcs.certificacion.runners.benefits;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = {"co.com.tcs.certificacion.stepdefinitions", "co.com.tcs.certificacion.setup"},
        features = "src/test/resources/co/com/tcs/certificacion/features/benefits/check_detail_benefit.feature",
        snippets= CucumberOptions.SnippetType.CAMELCASE,
        //tags = @FailedRegister,
        monochrome=true
)
public class CheckDetailBenefitByR {
}