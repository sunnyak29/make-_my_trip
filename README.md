# MakeMyTrip Automation

Java/Maven automation framework using Cucumber BDD, Selenium WebDriver, TestNG, WebDriverManager, Page Objects, and ExtentReports.

## Run Tests

Requirements: Java 25, Maven, and a locally available Chrome, Firefox, or Edge browser.

```bash
mvn clean test
```

The default build runs `@smoke` scenarios. Run the current regression scenarios explicitly after confirming the target site's locators:

```bash
mvn clean test -Dcucumber.filter.tags=@regression
```

The Cucumber feature is under `src/test/java/com/makemytrip/automation/feature`, and the TestNG suite is `src/test/resources/testng.xml`. Reports are written to `target/cucumber-reports` and `target/surefire-reports`.

## Configuration

Default browser and locator configuration is loaded from `src/main/resources/Config/Config.properties`. Optional overrides can be placed in `config/config.properties`; system properties take precedence when supplied, for example:

```bash
mvn test -DbrowserName=firefox -DURL=https://www.makemytrip.com
```

The framework owns browser startup and teardown in Cucumber hooks and uses explicit Selenium waits for page interactions. Keep credentials, tokens, and environment-specific secrets outside source control.

For local MCP setup, install `uvx` with Homebrew when required.