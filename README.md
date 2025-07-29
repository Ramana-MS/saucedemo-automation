#  SauceDemo Automation Project

#  SauceDemo Test Automation

This project contains test automation for the [SauceDemo](https://www.saucedemo.com) e-commerce application using **Selenium WebDriver**, **Java**, **TestNG**, and the **Page Object Model (POM)** design pattern.

---

# Tasks Automated

# Task 1: Filter and Add Item to Cart
- Login with standard user credentials
- Sort products using the dropdown:
  - Price (low to high)
  - Price (high to low)
  - Name (A to Z)
- Add the selected product to the cart
- Verify:
  -  Product name is correct
  -  Price matches
  - Quantity = 1
- Implemented using `@DataProvider` for dynamic sorting input

#Task 2: Extract Top 3 Sorted Products
- Sort by **Name (Z to A)**
- Extract the **top 3 product names and prices**
- Output displayed in console
- Code adapts to dynamic product listings (no hardcoding)

---

# Tech Stack

| Tool               | Purpose                          |
|--------------------|----------------------------------|
| Java               | Programming Language             |
| Selenium WebDriver | Web Automation Framework         |
| TestNG             | Test Framework                   |
| Maven              | Dependency Management            |
| Git / GitHub       | Version Control / Repo Hosting   |

---

##  Project Structure

AutomationTask_saucedemo/
├── src/
│ ├── main/java/pages/ → Page Object classes (LoginPage, ProductsPage)
│ └── test/java/tests/ → Test classes (AddToCartTest, ExtractSortedProductsTest)
├── pom.xml → Maven project file
├── testng.xml → TestNG Suite Runner
└── README.md → Project Overview (this file)



