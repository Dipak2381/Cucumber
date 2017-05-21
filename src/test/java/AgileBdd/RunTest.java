package AgileBdd;

import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by DIPAK on 4/23/2017.
 */
@RunWith(Cucumber.class)
@Cucumber.Options(features = ".",format = "html:target/CucumberReports",tags = "@SmokeTest1")
public class RunTest
{
}
