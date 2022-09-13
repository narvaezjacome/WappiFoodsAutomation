package com.narvaez.qa.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/"
        , glue = "com.narvaez.qa.stepsdefinitions"
        , snippets = SnippetType.CAMELCASE)
public class loginRunners {
}