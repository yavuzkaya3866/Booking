package com.booking.pages;

import com.booking.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingReservationPages {

    public BookingReservationPages() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "ss")
    public WebElement destinationBox;

    @FindBy(className = "xp__dates-inner")
    public WebElement dateBox;

    @FindBy(className = "xp__guests__count")
    public WebElement GuestBox;

    @FindBy(xpath = "(//button[@aria-describedby='group_children_desc'])[2]")
    public WebElement childrenPlus;

    @FindBy(xpath = "(//button[@aria-describedby='group_children_desc'])[1]")
    public WebElement childrenMinus;

    @FindBy(xpath = "(//button[@aria-describedby='group_adults_desc'])[1]")
    public WebElement adultMinus;

    @FindBy(xpath = "(//button[@aria-describedby='group_adults_desc'])[2]")
    public WebElement adultPlus;

    @FindBy(xpath = "(//button[@aria-describedby='no_rooms_desc'])[1]")
    public WebElement roomMinus;

    @FindBy(xpath = "(//button[@aria-describedby='no_rooms_desc'])[2]")
    public WebElement roomPlus;

    @FindBy(xpath = "//select[@aria-label='Child 1 age']")
    public WebElement childOne;

    @FindBy(xpath = "//select[@aria-label='Child 2 age']")
    public WebElement childTwo;

    @FindBy(className = "sb-searchbox__button")
    public WebElement searchBox;


    public void Date(String date){
        Driver.get().findElement(By.xpath("//span[@aria-label='"+date+"']")).click();


    }






}
