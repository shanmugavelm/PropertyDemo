package com.velu.propertyclient.services;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by GBS03019 on 5/19/2021.
 */
@Service
@RequiredArgsConstructor
public class PropertyService {

    //private final PropertyRestClient client;

    public Map<String, Object> getMappedProperties() {
        /*System.out.println("inside 1");
        ResponseEntity<ConfiguratorResponse> mappedProperties = client.getMappedProperties("Basic YWRtaW46cHJvdmE=");
        System.out.println("mappedProperties : " + mappedProperties);
        ConfiguratorResponse response =  mappedProperties.getBody();
        return response.getPayload();*/


        Map<String, Object> propertyMap = new HashMap<String, Object>();
        propertyMap.put("PROPERTY_1", "config_value1");
        propertyMap.put("PROPERTY_2", "2");
        propertyMap.put("PROPERTY_3", "config_value3");

        return propertyMap;
    }
}
