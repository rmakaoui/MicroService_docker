package org.ENSAJ.ClientService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:application-docker.properties")
public class AppConfig {
    private static final Logger logger = LoggerFactory.getLogger(AppConfig.class);
    private final Environment environment;

    public AppConfig(Environment environment) {
        this.environment = environment;
        logger.info("AppConfig initialized with profile: {}", String.join(",", environment.getActiveProfiles()));
    }

    private String getActiveProfile() {
        return String.join(",", environment.getActiveProfiles());
    }
}
