# Nop Commerce

![Nop Commerce Logo](https://demo.nopcommerce.com/Themes/DefaultClean/Content/images/logo.png)

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [TestScenarios](#testscenarios)
- [License](#license)

## Introduction

Nop Commerce is a E-Commerce Web application that provides various ecommerce services and features. This repository contains the source code for the Nop Commerce application.

## Features

- *Account Management*: Users manage accounts; admins add products.
- *Checkout Process*: Easy, secure checkout.
- *Product Listings*: Updated product info.
- *Security Measures*: Protect data and transactions.

## Installation

To set up the Nop Commerce application locally, follow these steps:

## Installation Steps for Selenium 4 (Java)

1. **Clone Repository**:
   - git clone <https:/github.com/islamtoba/Nop-Commerce>
2. **Navigate to Project Directory**:
   - cd NopCommerce
3. **Install Dependencies**:
   - Ensure Apache Maven is installed.
   - Add Selenium 4 dependency to pom.xml.
4. **Configure WebDriver**:
   - Set system property in test setup.
5. **Write Selenium Tests**:
   - Create test classes and methods.
6. **Run Tests**:
   - mvn test
7. **Review Results**:
   - Check test reports in target directory.
8. **Customize as Needed**.
9. **Happy Testing!**


* Update configuration files with necessary settings.
5. Run the application:
*   npm start

## Usage
* User Guide: Refer to the User Guide for detailed information on how to use the Nop Commerce application.

## Contributing
* We welcome contributions from the community. To contribute to Nop Commerce, follow these steps:

## Fork the repository.
* Create a new branch for your feature or bug fix.
* Make your changes and submit a pull request.

## Test Scenarios
* SC1 - User could register with valid data.
* SC2 - User could log in with valid email and password.
* SC3 - User could reset his/her password successfully ***Note**** in this case you just need to confirm that this message is displayed "Email with instructions has been sent to you."
 -using same mail from reg and login.
* SC4 - Logged User could search for any product
-login	
-search for any product
* SC5- Logged User could switch between currencies US-Euro
-login
-change currency
* SC6- Logged user could select different Categories ***Note*** *Select random category then hover and open sub-Category if found*.
--login
-hover for random categories.
(//a[i or 44]
* SC7- Logged user could filter with color ***Note*** *in this case you should select specific category like Apparel > Shoes*.
* SC8- Logged user could select different tags.
* SC9- Logged user could add different products to Shopping cart.
* SC10- Logged user could add different products to Wishlist.
* SC11- Logged user could add different products to compare list.
* SC12- Create successful Order.

  
## License
* Nop Commerce is licensed under the MIT License.
