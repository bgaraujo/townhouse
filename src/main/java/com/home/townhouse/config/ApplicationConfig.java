package com.home.townhouse.config;

import com.home.security.SecurityConfigurations;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(SecurityConfigurations.class)
public class ApplicationConfig {
}
