package io.areguig.bootspock.integration

import io.areguig.bootspock.BootSpockSampleAppApplication
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext
import org.springframework.test.context.ActiveProfiles
import spock.lang.Specification

/**
 * Created by akli on 16/01/2017.
 */

@SpringBootTest(classes = BootSpockSampleAppApplication.class,
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
class BootSpockSampleAppIntegrationSpec extends Specification{

    @Autowired
    ApplicationContext context

    def "test context loads"() {
        expect:
        context != null
        context.containsBean("bootSpockSampleAppApplication")
        context.containsBean("rootEndpoint")
    }
}
