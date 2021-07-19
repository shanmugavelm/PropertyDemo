package com.velu.propertyclient.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by GBS03019 on 5/21/2021.
 */
@Service
@RefreshScope
public class PropertyHolder {

    @Value("${PROPERTY_1}")
    private String value1;

    @Value("${PROPERTY_2}")
    private Long value2;

    @Value("${PROPERTY_3: default}")
    private String value3;

    @Value("${PROPERTY_4: defaultproperty4}")
    private String value4;


    public Map getProperties() {
        Map<String, Object> propertyMap = new HashMap<>();
        propertyMap.put("PROPERTY_1", value1);
        propertyMap.put("PROPERTY_2", value2);
        propertyMap.put("PROPERTY_3", value3);
        propertyMap.put("PROPERTY_4", value4);
        return propertyMap;
    }
}
