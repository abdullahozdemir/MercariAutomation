$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/mercari.feature");
formatter.feature({
  "name": "Visit Mercari web page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Compare the shoes price",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Go to main page and verify the correct page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.mercari.step_definitions.ProductStepdefs.goToMainPageAndVerifyTheCorrectPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click search bar",
  "keyword": "When "
});
formatter.match({
  "location": "com.mercari.step_definitions.ProductStepdefs.clickSearchBar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "type shoes and select ascending sort",
  "keyword": "And "
});
formatter.match({
  "location": "com.mercari.step_definitions.ProductStepdefs.typeShoesAndSelectAscendingSort()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select the first and cheapest product",
  "keyword": "And "
});
formatter.match({
  "location": "com.mercari.step_definitions.ProductStepdefs.selectTheFirstAndCheapestProduct()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Get the product price and verify it",
  "keyword": "Then "
});
formatter.match({
  "location": "com.mercari.step_definitions.ProductStepdefs.getTheProductPriceAndVerifyIt()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: verify the cheapest price expected:\u003c30[1]\u003e but was:\u003c30[0]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat com.mercari.step_definitions.ProductStepdefs.getTheProductPriceAndVerifyIt(ProductStepdefs.java:81)\r\n\tat ✽.Get the product price and verify it(file:///C:/Users/Aozdemir/IdeaProjects/MercariAutomation/src/test/resources/features/mercari.feature:8)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});