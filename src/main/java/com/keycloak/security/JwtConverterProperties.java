package com.keycloak.security;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

@Data
@Validated
@Configuration
@ConfigurationProperties(prefix = "jwt.auth.converter")
@Getter
@Setter
public class JwtConverterProperties {

    private String resourceId;
    private String principalAttribute;


}