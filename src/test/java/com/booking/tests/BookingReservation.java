package com.booking.tests;

import com.booking.pages.BookingReservationPages;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class BookingReservation extends TestBase {



    @Test
    public void test() throws InterruptedException {

        BookingReservationPages pages = new BookingReservationPages();
        pages.destinationBox.sendKeys("Atlanta");
        pages.dateBox.click();
        pages.Date("23 July 2021");
        Thread.sleep(2000);
        pages.Date("30 July 2021");
        pages.GuestBox.click();
        pages.childrenPlus.click();
        pages.childrenPlus.click();
        pages.roomPlus.click();
        Select select = new Select(pages.childOne);
        select.selectByValue("14");
        Select select1 = new Select(pages.childTwo);
        select1.selectByValue("17");
        pages.searchBox.click();





    }
}
