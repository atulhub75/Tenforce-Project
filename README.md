# Tenforce Project

##  Project Framework Overview
This project is a test automation framework built using **Selenium WebDriver**, **Java**, **TestNG**, and **Maven**.  
It follows the **Page Object Model (POM)** design pattern to ensure maintainability, reusability, and scalability.


### Project Folder Structure

src
 ├── main
 │    └── java
 │         ├── base
 │         └── pages
 │
 ├── test
 │    └── java
 │         └── tests

 -> In base file have Baseclass and in which have launch browser method
 -> In pages file have to page class file in which have all locator of that page and method to perform action on locator
 -> In tests file have actual test case class file

### Project Architecture

This project is built using Java, Selenium WebDriver, TestNG, and Maven and follows the Page Object Model (POM) design pattern to maintain a clear separation of concerns.

### The project structure is organized as follows:

# src/main/java
 Contains the core framework code:
        Base Class: Handles WebDriver initialization, browser setup, and common reusable methods
        Page Classes: Contains web element locators and page-specific actions
# src/test/java
 Contains the Test Classes, where test scenarios and validations are implemented using TestNG
# pom.xml
 Manages all project dependencies and build configurations using Maven


### Steps to Execute:

# You can download the project using Git:
 git clone https://github.com/atulhub75/Tenforce-Project.git
 cd Tenforce-Project

OR
# Download ZIP:
  Click Code → Download ZIP
  Extract the project folder
  Import Project into Eclipse
  go to src/test/java right click on test file and run as testng











   
