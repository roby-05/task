package web.testcases

import org.testng.Assert.assertFalse
import org.testng.Assert.assertTrue
import org.testng.annotations.Test
import web.base.Helper
import web.base.retry
import web.pages.TaskPage

class Tests : Helper() {

    /**
     * Navigation to my account, login in, scroll to for ladies section and select first item
     * Click on all images, add item in cart, View cart and Continue with shopping
     * Scroll to specific item,add that item in cart, View cart Checkout and place order
     */
    @Test(priority = 1)
    fun verifyingItemsBuyingThemSelectingSpecificItemCheckoutAndPlacingOrder() {
        val taskPage = TaskPage(driver = driver)
        if (taskPage.isTestingPurposeHeaderDisplayed)
            taskPage.clickOnDismissButton()
        retry { assertTrue(taskPage.isHomePageBackgroundDisplayed) }
        taskPage.clickOnMyAccountTab()
        retry { assertTrue(taskPage.isLoginHeaderDisplayed) }
        taskPage.loginMemberIntoWebPage()
        retry { assertTrue(taskPage.isMessageForSuccessfulLoginDisplayed) }
        taskPage.clickOnMainLogo()
        retry { assertTrue(taskPage.isHomePageBackgroundDisplayed) }
        taskPage.scrollToForLadiesSectionAndSelectFirstItem()
        taskPage.clickOnFirstImageOnProduct()
        retry { assertTrue(taskPage.isFirstImageOpened) }
        repeat(4) { taskPage.clickOnRightArrowOnImagePreview() }
        taskPage.clickOncloseButtonOnImagePreview()
        retry {
            taskPage.clickOnChoseAnOptionColor()
            assertTrue(taskPage.isSecondOptionForColorDisplayed)
        }
        taskPage.clickOnOptionTwoForColor()
        retry {
            taskPage.clickOnChoseAnOptionSize()
            assertTrue(taskPage.isSecondOptionForSizeDisplayed)
        }
        taskPage.clickOnOptionTwoForSize()
        taskPage.clickOnAddToCartButton()
        retry { assertTrue(taskPage.isAddedToCartMessageDisplayed) }
        taskPage.clickOnViewCartButton()
        retry { assertTrue(taskPage.isProductNameDisplayed("black lux")) }
        taskPage.clickOnContinueShoppingButton()
        taskPage.clickOnBlackStrappyPolkaDress()
        taskPage.clickOnChoseAnOptionColor()
        taskPage.clickOnOptionTwoForColor()
        retry {
            taskPage.clickOnChoseAnOptionSize()
            assertTrue(taskPage.isThirdOptionForSizeDisplayed)
        }
        taskPage.clickOnOptionThreeForSize()
        taskPage.clickOnAddToCartButton()
        retry { assertTrue(taskPage.getTextAddedOrRemovedFromCartMessage.contains("Added")) }
        taskPage.clickOnViewCartButton()
        retry { assertTrue(taskPage.isProductNameDisplayed("pink drop")) }
        assertTrue(taskPage.isProductNameDisplayed("black"))
        taskPage.clickOnProceedToCheckoutButton()
        retry { assertTrue(taskPage.isCheckoutPageHeaderDisplayed) }
        taskPage.clickOnPlaceOrder()
        assertTrue(taskPage.areErrorMessagesDisplayed)
        taskPage.fillBillingInputDetailsWithValues()
        taskPage.clickOnPlaceOrder()
        retry { assertTrue(taskPage.isMessageForOrderReceived) }
        tearDown()
    }

    /**
     * Scroll to for ladies section and open second item. Select color and size, but size 36 is unavailable
     * Scroll down and choose BLACK LUX GRAPHIC T-SHIRT. Since size and price are okay we add that to cart.
     * Click on view cart and then on product to see more available items. Find ripped jeans and buy them
     * Red satin dress caught our eyes, and we open that item and buy it.
     * Navigate to cart
     * Unfortunately we do not have money, so we will remove one item
     */
    @Test(priority = 2)
    fun verifyingBuyingThreeItemsRemovingOneItemOnCart() {
        val taskPage = TaskPage(driver = driver)
        navigateToPage()
        taskPage.clickOnSecondItemOnHomePageInForLadiesSection()
        retry {
            taskPage.clickOnChoseAnOptionColor()
            assertFalse(taskPage.isThirdOptionForColorDisplayed)
        }
        taskPage.clickOnOptionTwoForColor()
        taskPage.clickOnChoseAnOptionSize()
        taskPage.clickOnTShirtTag()
        retry { assertTrue(taskPage.isResultsMessage) }
        taskPage.clickOnBlackLuxTShirt()
        retry {
            taskPage.clickOnChoseAnOptionColor()
            assertTrue(taskPage.isSecondOptionForColorDisplayed)
        }
        taskPage.clickOnOptionTwoForColor()
        retry {
            taskPage.clickOnChoseAnOptionSize()
            assertTrue(taskPage.isFourthOptionForSizeDisplayed)
        }
        taskPage.clickOnFourthOptionForSize()
        taskPage.clickOnAddToCartButton()
        retry { assertTrue(taskPage.getTextAddedOrRemovedFromCartMessage.contains("Added")) }
        taskPage.clickOnViewCartButton()
        taskPage.clickOnProducts()
        taskPage.clickOnBlueRippedSkinnyJeans()
        retry { taskPage.isProductDetailsDisplayed }
        retry {
            taskPage.clickOnChoseAnOptionColor()
            assertTrue(taskPage.isSecondOptionForColorDisplayed)
        }
        taskPage.clickOnOptionTwoForColor()
        taskPage.clickOnChoseAnOptionSize()
        taskPage.clickOnOptionTwoForSize()
        taskPage.clickOnAddToCartButton()
        while (!taskPage.isRedSatinDressDisplayed())
            driver.navigate().refresh()
        taskPage.clickOnrRedSatinDress()
        retry { assertTrue(taskPage.getProcedureDetailsText.contains("red")) }
        retry {
            taskPage.clickOnChoseAnOptionColor()
        }
        taskPage.clickOnOptionThreeForColor()
        taskPage.clickOnChoseAnOptionSize()
        taskPage.clickOnOptionThreeForSize()
        taskPage.clickOnAddToCartButton()
        retry { assertTrue(taskPage.isAddedToCartMessageDisplayed) }
        taskPage.clickOnViewCartButton()
        taskPage.clickOnCloseButton()
        retry { assertTrue(taskPage.isCartTotalPriceDisplayed) }
        tearDown()
    }

    /**
     * Click on search query and search for DRESS
     * Compare two dresses for example BLACK RIBBED SHORT SLEEVE LETTUCE HEM MIDI DRESS and WHITE MILKMAID HOOK MIDI DRESS
     * We than sort by price, from highest to lowest
     * We open one dress and we favorite it.
     * Navigate back and favorite other dress
     * Navigate to My Wishlist and verify are those two dress displayed
     */
    @Test(priority = 3)
    fun comparingTwoDressesSortingByPriceFavoritingDressesNavigatingToWishListAndVerifyingAreDressesVisible() {
        val taskPage = TaskPage(driver = driver)
        navigateToPage()
        taskPage.clickOnSearchOnHomePage()
        taskPage.fillInputFieldAndSearch("DRESS")
        retry { assertTrue(taskPage.isBlackRibbedShortSleeveDressDisplayed) }
        taskPage.hoverOverBlackRibbedShortDress()
        taskPage.clickOnBlackRibbedDressCompareButton()
        retry { assertTrue(taskPage.isCompareProductsHeaderDisplayed) }
        taskPage.clickOnCloseButtonOnCompareProductsPopUp()
        retry { assertTrue(taskPage.isWhiteMilkmaidDressDisplayed) }
        taskPage.hoverOverWhiteMilkmaidDress()
        taskPage.clickOnWhiteMilkmaidDressCompareButton()
        retry {
            assertTrue(taskPage.isBlackDressTitleOnComparePopUpDisplayed)
            assertTrue(taskPage.isWhiteDressTitleOnComparePopUpDisplayed)
        }
        taskPage.clickOnCloseButtonOnCompareProductsPopUp()
        taskPage.clickOnSortBy()
        retry { assertTrue(taskPage.isHighToLowestFilterOnSortDisplayed) }
        taskPage.clickOnHighToLowestFilterOnSort()
        taskPage.clickOnTokyoDress()
        retry { taskPage.isProductEssentialDescriptionDisplayed }
        taskPage.clickOAddToFavoriteButton()
        driver.navigate().back()
        taskPage.clickOnPinkFloralDress()
        retry { taskPage.isProductEssentialDescriptionDisplayed }
        taskPage.clickOAddToFavoriteButton()
        taskPage.clickOnMyWishlist()
        retry { assertTrue(taskPage.isProductNameDisplayed("pink floral")) }
        assertTrue(taskPage.isProductNameDisplayed("Tokyo"))
        tearDown()
    }
}
