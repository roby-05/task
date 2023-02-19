package web.base

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import web.enums.LocatorType

class DynamicWebElement(private val locatorValue: String) {

    /**
     * This will return the [WebElement] object using the dynamic locator.
     */
    fun parseDynamicLocator(dynamicPortion: String, driver: WebDriver, locatorType: LocatorType = LocatorType.XPATH): WebElement {
        val resolvedLocatorValue = String.format(locatorValue, dynamicPortion)
        val locator = when (locatorType) {
            LocatorType.XPATH -> By.xpath(resolvedLocatorValue)
            LocatorType.ID -> By.id(resolvedLocatorValue)
        }
        retry {
            driver.findElement(locator)
        }
        return driver.findElement(locator)
    }
}

