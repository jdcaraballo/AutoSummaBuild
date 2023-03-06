package co.com.tcs.certificacion.interactions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class SecondTabs implements Interaction {

    private String tabTitle;

    public SecondTabs(String tabTitle) {
        this.tabTitle = tabTitle;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver=BrowseTheWeb.as(actor).getDriver();
        Set<String> tabLists;
        tabLists=driver.getWindowHandles();
        for(String tabs:tabLists){
            driver.switchTo().window(tabs);
            if(driver.getTitle().contains(tabTitle)){
                break;
            }
        }
    }
    public static SecondTabs secondTabs(String tabTitle){
        return Tasks.instrumented(SecondTabs.class,tabTitle);
    }
}