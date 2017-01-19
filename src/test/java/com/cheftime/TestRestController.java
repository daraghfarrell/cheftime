package com.cheftime;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author dfarrell on 12/12/2016.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestRestController {

    @Autowired
    private TestRestTemplate template;

    @Test
    public void testRestControllerAlive() throws Exception {
        String response = template.getForObject("/rlive", String.class);
        assertThat(response.contains("404"), is(false));
        assertThat(response.contains("rlive"), is(true));
    }
}
