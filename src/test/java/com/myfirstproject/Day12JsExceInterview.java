package com.myfirstproject;

public class Day12JsExceInterview {
    /*
     * What is JS Executor?
     * It is an API which is used to execute javascript commands in Selenium
     *
     * Why are we learning JavaScript Executor?
     * We might need some js executor method to interact with some webelements
     * When traditional methods are not enough
     * click, scrolling into a specific element
     *
     * What can we do by using JS Executor?
     * Click. It is good especially when we want to click a hidden element.
     * Scroll onto a specific webelement, scroll down/up/right/left
     * Type an input
     * Change the value of an element
     * Hover over
     * Change background colour...
     *
     *
     * */
    /*
    What is javascript executor?
js executor is an API to execute javascript comments in selenium
When did you use it?
when we can not interact with some webelements with a traditional selenium methods
For example, when we cannot click, scroll, get text… then we can use js executor
How do you scroll with selenium?
There are 2 ways: actions class, js executor
Actually, I am using js executor, since it is better
For example, with js executor, I can scroll to a specific element(scrollIntoView), or right, left, all the way bottom,… We have a reusable method that I can call to scroll on a specific element
How do you get the text in an input?
I use getText() method for getting the text on a page. HOWEVER, we need to use jsexecutor to get the input value. I have a reusable method to get the value from an input.
What would you do if your selenium click doesn’t work?
I can use javascript executor click. I can get the element and click using javascript.
     */

}
