package com.velu.propertyclient.services;

import com.velu.propertyclient.SpringContextRefresher;
import com.velu.propertyclient.properties.PropertyHolder;
import com.velu.propertyclient.types.ConfiguratorResponse;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by GBS03019 on 5/19/2021.
 */
@RestController
public class TestController {

    @Autowired
    PropertyHolder propertyHolder;

    @Autowired
    SpringContextRefresher springContextRefresher;

    @GetMapping("/properties")
    public Map getProperties() {
        return propertyHolder.getProperties();
    }

    @GetMapping("/refresh")
    public Map doRefresh() {
        springContextRefresher.refresh();
        return propertyHolder.getProperties();
    }
}
