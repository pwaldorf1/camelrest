package com.pw.camel.camelrest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccessResponseToken {

    @Getter
    @Setter
    private String access_token;

    @Getter
    @Setter
    private Integer expires_in;

    @Getter
    @Setter
    private Integer refresh_expires_in;

    @Getter
    @Setter
    private String token_type;

    @Getter
    @Setter
    private String scope;
}
