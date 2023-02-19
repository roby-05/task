package web.pages

import org.openqa.selenium.Keys.ENTER
import org.openqa.selenium.NoSuchElementException
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import web.WebBasePage
import web.base.DynamicWebElement
import web.enums.LocatorType

open class TaskPage(driver: WebDriver) : WebBasePage(driver = driver) {

    @FindBy(xpath = "//p[@class='woocommerce-store-notice demo_store']")
    private lateinit var testingPurposeHeader: WebElement

    @FindBy(xpath = "//p[@class='woocommerce-store-notice demo_store']//a")
    private lateinit var dismissButton: WebElement

    @FindBy(id = "rev_slider_4_1_wrapper")
    private lateinit var homePageBackground: WebElement

    @FindBy(xpath = "//ul[@class='pull-right noo-topbar-right']//li[2]")
    private lateinit var myAccount: WebElement

    @FindBy(xpath = "//ul[@class='pull-right noo-topbar-right']//li[1]")
    private lateinit var myWishlist: WebElement

    @FindBy(xpath = "//h2[contains(text(), 'Login')]")
    private lateinit var loginHeader: WebElement

    @FindBy(id = "username")
    private lateinit var username: WebElement

    @FindBy(id = "password")
    private lateinit var password: WebElement

    @FindBy(name = "login")
    private lateinit var logIn: WebElement

    @FindBy(xpath = "//p[contains(text(), 'Hello')]")
    private lateinit var messageForSuccessfulLogin: WebElement

    @FindBy(xpath = "//div[@class='navbar-logo']//img[@alt='ToolsQA Demo Site']")
    private lateinit var mainLogo: WebElement

    @FindBy(xpath = "//a[contains(text(),'pink drop shoulder oversized t shirt')]")
    private lateinit var firstItemPinkDropTShirt: WebElement

    @FindBy(xpath = "//a[contains(text(),'playboy x')]")
    private lateinit var secondItemPlayboyX: WebElement

    @FindBy(xpath = "//div[@class=\"noo-woo-images__slide noo-woo-images__slide--active\"]")
    private lateinit var firstImageOnProduct: WebElement

    @FindBy(xpath = "//div[@class='pswp__item']//img[@class='pswp__img']")
    private lateinit var imagePreview: WebElement

    @FindBy(xpath = "//button[@class=\"pswp__button pswp__button--arrow--right\"]")
    private lateinit var rightArrowOnImagePreview: WebElement

    @FindBy(xpath = "//button[@class=\"pswp__button pswp__button--close\"]")
    private lateinit var closeButtonOnImagePreview: WebElement

    @FindBy(id = "pa_color")
    private lateinit var choseAnOptionColor: WebElement

    @FindBy(xpath = "//*[@id=\"pa_color\"]/option[2]")
    private lateinit var optionTwoForColor: WebElement

    @FindBy(xpath = "//*[@id=\"pa_color\"]/option[3]")
    private lateinit var optionThreeForColor: WebElement

    @FindBy(id = "pa_size")
    private lateinit var choseAnOptionSize: WebElement

    @FindBy(xpath = "//*[@id='pa_size']/option[2]")
    private lateinit var optionTwoForSize: WebElement

    @FindBy(xpath = "//*[@id=\"pa_size\"]/option[4]")
    private lateinit var optionFourForSize: WebElement

    @FindBy(xpath = "//button[@class='single_add_to_cart_button button alt wp-element-button']")
    private lateinit var addToCartButton: WebElement

    @FindBy(xpath = "//div[@class='woocommerce-message']")
    private lateinit var addedToCartMessage: WebElement

    @FindBy(xpath = "//div[@class=\"woocommerce-message\"]//a")
    private lateinit var viewCartButton: WebElement

    @FindBy(xpath = "//a[@class=\"continue\"]")
    private lateinit var continueShoppingButton: WebElement

    @FindBy(xpath = "//a[contains(text(),'black strappy')]")
    private lateinit var blackStrappyPolkaDress: WebElement

    @FindBy(xpath = "//*[@id=\"pa_size\"]/option[3]")
    private lateinit var optionThreeForSize: WebElement

    @FindBy(xpath = "//div[@class='wc-proceed-to-checkout']//a")
    private lateinit var proceedToCheckout: WebElement

    @FindBy(xpath = "//h1[@class=\"page-title\"]")
    private lateinit var checkoutPageHeader: WebElement

    @FindBy(xpath = "//input[@class=\"select2-search__field\"]")
    private lateinit var searchFieldOnCheckoutPage: WebElement

    @FindBy(xpath = "//li[@class=\"select2-results__option select2-results__option--highlighted\"]")
    private lateinit var firstItemOnTypeaheadList: WebElement

    @FindBy(id = "select2-billing_country-container")
    private lateinit var billingCountry: WebElement

    @FindBy(id = "billing_first_name")
    private lateinit var billingFirsName: WebElement

    @FindBy(id = "billing_last_name")
    private lateinit var billingLastName: WebElement

    @FindBy(id = "billing_address_1")
    private lateinit var billingAddress: WebElement

    @FindBy(id = "billing_postcode")
    private lateinit var billingPostcode: WebElement

    @FindBy(id = "billing_city")
    private lateinit var billingCity: WebElement

    @FindBy(id = "billing_phone")
    private lateinit var billingPhone: WebElement

    @FindBy(id = "billing_email")
    private lateinit var billingEmail: WebElement

    @FindBy(id = "place_order")
    private lateinit var placeOrder: WebElement

    @FindBy(id = "terms")
    private lateinit var terms: WebElement

    @FindBy(xpath = "//ul[@class='woocommerce-error']")
    private lateinit var errorMessages: WebElement

    @FindBy(xpath = "//p[@class='woocommerce-thankyou-order-received']")
    private lateinit var messageForOrderReceived: WebElement

    @FindBy(xpath = "//p[@class='woocommerce-result-count']")
    private lateinit var resultsMessage: WebElement

    @FindBy(xpath = "//h3//a[contains(text(), 'black lux')]")
    private lateinit var blackLuxTShirt: WebElement

    @FindBy(xpath = "//span[@class='tagged_as'] //a[contains(text(), 'shirt')]")
    private lateinit var tShirtTag: WebElement

    @FindBy(xpath = "//h3//a[contains(text(), 'blue sinner ripped')]")
    private lateinit var blueRippedSkinnyJeans: WebElement

    @FindBy(xpath = "//span[contains(text(),'Products')]")
    private lateinit var products: WebElement

    @FindBy(xpath = "//select[@class='orderby']")
    private lateinit var sortBy: WebElement

    @FindBy(xpath = "//select[@class=\"orderby\"]//option[6]")
    private lateinit var highToLowestSort: WebElement

    @FindBy(xpath = "//h3//a[contains(text(), 'red satin round')]")
    private lateinit var redSatinDress: WebElement

    @FindBy(xpath = "//a[@class=\"icon_close_alt2\"][@data-product_id='1485']")
    private lateinit var closeButton: WebElement

    @FindBy(xpath = "//div[@class=\"cart_totals calculated_shipping\"]//span[@class=\"woocommerce-Price-amount amount\"]")
    private lateinit var cartTotalPrice: WebElement

    @FindBy(xpath = "//div[@class = 'product-essential__description']")
    private lateinit var productDetails: WebElement

    @FindBy(xpath = "//a[@class='noo-search']")
    private lateinit var searchOnHomePage: WebElement

    @FindBy(xpath = "//input[@class='form-control']")
    private lateinit var searchOnPopUpOnHomepage: WebElement

    @FindBy(xpath = "//a[contains(text(),'black ribbed short sleeve lettuce hem midi dress')]")
    private lateinit var blackRibbedShortSleeveDress: WebElement

    @FindBy(xpath = "//a[@class=\"compare button\"][@data-product_id='1441']")
    private lateinit var blackRibbedDressCompareButton: WebElement

    @FindBy(xpath = "//h1[contains(text(),'Compare products')]")
    private lateinit var compareProductsHeader: WebElement

    @FindBy(id = "cboxClose")
    private lateinit var closeButtonOnCompareProductsPopUp: WebElement

    @FindBy(xpath = "//a[contains(text(),'white milkmaid')]")
    private lateinit var whiteMilkmaidDress: WebElement

    @FindBy(xpath = "//a[@class=\"compare button\"][@data-product_id='1473']")
    private lateinit var whiteMilkmaidDressCompareButton: WebElement

    @FindBy(xpath = "//tr[@class='title odd']//td[@class='odd product_1441']")
    private lateinit var blackDressTitleOnComparePopUp: WebElement

    @FindBy(xpath = "//tr[@class='title odd']//td[@class='even product_1473']")
    private lateinit var whiteDressTitleOnComparePopUp: WebElement

    @FindBy(xpath = "//a[contains(text(),'Tokyo')]")
    private lateinit var tokyoDress: WebElement

    @FindBy(xpath = "//div[@class='summary entry-summary']//div[@class='yith-wcwl-add-button']")
    private lateinit var addToFavoriteButton: WebElement

    @FindBy(xpath = "//div[@class = 'woocommerce-product-details__short-description']")
    private lateinit var productEssentialDescription: WebElement

    @FindBy(xpath = "//a[contains(text(),'pink')]")
    private lateinit var pinkFloralDress: WebElement

    private val productNameOnCart = DynamicWebElement("//td[@class='product-name']/a[contains(text(),'')]")

    fun isProductNameDisplayed(productLabel: String): Boolean {
        return isElementDisplayed(productNameOnCart.parseDynamicLocator(productLabel, dDriver, LocatorType.XPATH))
    }

    val isHomePageBackgroundDisplayed = homePageBackground.isDisplayed
    val isMessageForSuccessfulLoginDisplayed = messageForSuccessfulLogin.isDisplayed
    val isFirstImageOpened = imagePreview.isDisplayed
    val isSecondOptionForColorDisplayed = optionTwoForColor.isDisplayed
    val isThirdOptionForColorDisplayed = optionThreeForColor.isDisplayed
    val isSecondOptionForSizeDisplayed = optionTwoForSize.isDisplayed
    val isThirdOptionForSizeDisplayed = optionThreeForSize.isDisplayed
    val isFourthOptionForSizeDisplayed = optionFourForSize.isDisplayed
    val isAddedToCartMessageDisplayed = addedToCartMessage.isDisplayed
    val isCheckoutPageHeaderDisplayed = checkoutPageHeader.isDisplayed
    val areErrorMessagesDisplayed = errorMessages.isDisplayed
    val isMessageForOrderReceived = messageForOrderReceived.isDisplayed
    val isResultsMessage = resultsMessage.isDisplayed
    val isProductDetailsDisplayed = productDetails.isDisplayed
    val isCartTotalPriceDisplayed = cartTotalPrice.isDisplayed
    val isBlackRibbedShortSleeveDressDisplayed = blackRibbedShortSleeveDress.isDisplayed
    val isCompareProductsHeaderDisplayed = compareProductsHeader.isDisplayed
    val isWhiteMilkmaidDressDisplayed = whiteMilkmaidDress.isDisplayed
    val isHighToLowestFilterOnSortDisplayed = highToLowestSort.isDisplayed
    val isBlackDressTitleOnComparePopUpDisplayed = blackDressTitleOnComparePopUp.isDisplayed
    val isWhiteDressTitleOnComparePopUpDisplayed = whiteDressTitleOnComparePopUp.isDisplayed
    val isProductEssentialDescriptionDisplayed = productEssentialDescription.isDisplayed
    val isTestingPurposeHeaderDisplayed = testingPurposeHeader.isDisplayed
    val isLoginHeaderDisplayed = loginHeader.isDisplayed
    val getProcedureDetailsText: String = productDetails.text
    val getTextAddedOrRemovedFromCartMessage: String = addedToCartMessage.text

    fun clickOnDismissButton() {
        clickOnElement(dismissButton)
    }

    fun isRedSatinDressDisplayed(): Boolean {
        return try {
            redSatinDress.isDisplayed
        } catch (exception: NoSuchElementException) {
            false
        }
    }

    //clicking and navigating functions
    fun clickOnMyAccountTab() {
        clickOnElement(myAccount)
    }

    fun clickOnMyWishlist() {
        clickOnElement(myWishlist)
    }

    fun clickOnMainLogo() {
        clickOnElement(mainLogo)
    }

    fun clickOnFirstImageOnProduct() {
        clickOnElement(firstImageOnProduct)
    }

    fun clickOnRightArrowOnImagePreview() {
        clickOnElement(rightArrowOnImagePreview)
    }

    fun clickOncloseButtonOnImagePreview() {
        hoverOnElement(imagePreview)
        clickOnElement(closeButtonOnImagePreview)
    }

    fun clickOnChoseAnOptionColor() {
        clickOnElement(choseAnOptionColor)
    }

    fun clickOnChoseAnOptionSize() {
        clickOnElement(choseAnOptionSize)
    }

    fun clickOnOptionTwoForSize() {
        clickOnElement(optionTwoForSize)
    }

    fun clickOnOptionTwoForColor() {
        clickOnElement(optionTwoForColor)
    }

    fun clickOnAddToCartButton() {
        clickOnElement(addToCartButton)
    }

    fun clickOnBlackStrappyPolkaDress() {
        clickOnElement(blackStrappyPolkaDress)
    }

    fun clickOnOptionThreeForSize() {
        clickOnElement(optionThreeForSize)
    }

    fun clickOnViewCartButton() {
        clickOnElement(viewCartButton)
    }

    fun clickOnProceedToCheckoutButton() {
        clickOnElement(proceedToCheckout)
    }

    fun clickOnPlaceOrder() {
        clickOnElement(placeOrder)
    }


    fun clickOnTokyoDress() {
        clickOnElement(tokyoDress)
    }

    fun clickOAddToFavoriteButton() {
        clickOnElement(addToFavoriteButton)
    }

    fun clickOnPinkFloralDress() {
        clickOnElement(pinkFloralDress)
    }

    fun clickOnSecondItemOnHomePageInForLadiesSection() {
        clickOnElement(secondItemPlayboyX)
    }

    fun clickOnTShirtTag() {
        clickOnElement(tShirtTag)
    }

    fun clickOnBlackLuxTShirt() {
        clickOnElement(blackLuxTShirt)
    }

    fun clickOnFourthOptionForSize() {
        clickOnElement(optionFourForSize)
    }

    fun clickOnBlueRippedSkinnyJeans() {
        clickOnElement(blueRippedSkinnyJeans)
    }

    fun clickOnProducts() {
        clickOnElement(products)
    }

    fun clickOnrRedSatinDress() {
        clickOnElement(redSatinDress)
    }

    fun clickOnOptionThreeForColor() {
        clickOnElement(optionThreeForColor)
    }

    fun clickOnCloseButton() {
        clickOnElement(closeButton)
    }

    fun clickOnSearchOnHomePage() {
        clickOnElement(searchOnHomePage)
    }

    fun clickOnBlackRibbedDressCompareButton() {
        clickOnElement(blackRibbedDressCompareButton)
    }

    fun clickOnCloseButtonOnCompareProductsPopUp() {
        clickOnElement(closeButtonOnCompareProductsPopUp)
    }

    fun clickOnWhiteMilkmaidDressCompareButton() {
        clickOnElement(whiteMilkmaidDressCompareButton)
    }

    fun clickOnSortBy() {
        clickOnElement(sortBy)
    }

    fun clickOnHighToLowestFilterOnSort() {
        clickOnElement(highToLowestSort)
    }

    fun clickOnContinueShoppingButton() {
        clickOnElement(continueShoppingButton)
    }

    //hover functions
    fun hoverOverBlackRibbedShortDress() {
        hoverOnElement(blackRibbedShortSleeveDress)
    }

    fun hoverOverWhiteMilkmaidDress() {
        hoverOnElement(whiteMilkmaidDress)
    }

    //scrolling functions
    fun scrollToForLadiesSectionAndSelectFirstItem() {
        scrollToElement(firstItemPinkDropTShirt)
        clickOnElement(firstItemPinkDropTShirt)
    }

    fun fillInputFieldAndSearch(value: String) {
        searchOnPopUpOnHomepage.sendKeys(value)
        searchOnPopUpOnHomepage.sendKeys(ENTER)
    }

    fun fillBillingInputDetailsWithValues() {
        billingFirsName.sendKeys(USERNAME.take(6))
        billingLastName.sendKeys(USERNAME.takeLast(7))
        clickOnElement(billingCountry)
        clickOnElement(searchFieldOnCheckoutPage)
        searchFieldOnCheckoutPage.sendKeys("Bosnia")
        clickOnElement(firstItemOnTypeaheadList)
        billingAddress.sendKeys("Tuzla bb")
        billingPostcode.sendKeys("75000")
        billingCity.sendKeys("Tuzla")
        billingPhone.sendKeys("+0123456789")
        billingEmail.sendKeys("emailaddress@gmail.com")
        clickOnTerms()
    }

    fun loginMemberIntoWebPage() {
        username.sendKeys(USERNAME)
        password.sendKeys(STRONG_PASSWORD)
        clickOnElement(logIn)
    }

    private fun clickOnTerms() {
        clickOnElement(terms)
    }

    private companion object {
        const val USERNAME = "robert jozeljic"
        const val STRONG_PASSWORD = "aA_11111#"
    }
}
