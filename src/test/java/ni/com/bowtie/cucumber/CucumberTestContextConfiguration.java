package ni.com.bowtie.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import ni.com.bowtie.IntegrationTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@IntegrationTest
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
