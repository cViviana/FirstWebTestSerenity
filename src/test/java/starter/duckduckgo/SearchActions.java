package starter.duckduckgo;

import org.openqa.selenium.Keys;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

public class SearchActions extends UIInteractions{
    @Step("Search for '{0}'")
    public void byKeyWord(String keyWord) {
        $("#searchbox_input").sendKeys(keyWord, Keys.ENTER);
    }
    
}