package com.velu.propertyclient.restclient;

import com.velu.propertyclient.types.ConfiguratorResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

/**
 * Created by GBS03019 on 5/19/2021.
 */
@FeignClient(name = "PropertyRestClient",
        url = "http://localhost:8080/config/"

)
public interface PropertyRestClient {

    @GetMapping(value = "v1.0/properties/mapped", produces = "application/hal+json")
    ResponseEntity<ConfiguratorResponse> getMappedProperties(@RequestHeader("Authorization") String authorization);
}
