package web

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.support.PageFactory
import web.base.retry

open class WebBasePage constructor(driver: WebDriver) {

    protected var dDriver = driver

    init {
        PageFactory.initElements(dDriver, this)
    }

    /**
     * [scrollToElement] and then click on [element]
     */
    fun clickOnElement(element: WebElement?, scrollToElement: Boolean = true) {
        if (scrollToElement) {
            scrollToElement(element)
        }
        element!!.isDisplayed
        retry { element.click() }
    }

    /**
     * Scroll to [element].
     */
    fun scrollToElement(element: WebElement?) {
        val action = Actions(dDriver)
        action.moveToElement(element)
        action.perform()
    }

    fun isElementDisplayed(element: WebElement?): Boolean {
        return try {
            element!!.isDisplayed
        } catch (exception: Throwable) {
            false
        }
    }

    fun hoverOnElement(aWebElement: WebElement?) {
        val actionBuilder = Actions(dDriver)
        actionBuilder.moveToElement(aWebElement).build().perform()
    }
}

