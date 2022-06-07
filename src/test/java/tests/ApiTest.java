package tests;

import config.ApiConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ApiTest {

    @Test
    void apiTestCheck() {

        ApiConfig apiconfig = ConfigFactory.create(ApiConfig.class, System.getProperties());
        assertThat(apiconfig.baseUrl()).isEqualTo("https://github.com");
        assertThat(apiconfig.token()).isEqualTo("ea135929105c4f29a0f5117d2960926f");
    }
}
