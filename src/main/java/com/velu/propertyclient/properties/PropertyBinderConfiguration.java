package com.velu.propertyclient.properties;

import com.velu.propertyclient.services.PropertyService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySource;
import org.springframework.web.context.ConfigurableWebApplicationContext;

import java.util.Map;

/**
 * Created by GBS03019 on 5/23/2021.
 */
@Configuration
@RequiredArgsConstructor
public class PropertyBinderConfiguration implements ApplicationContextAware {

    private final PropertyService propertyService;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ConfigurableWebApplicationContext context = (ConfigurableWebApplicationContext) applicationContext;
        Map<String, Object> props =  propertyService.getMappedProperties();
        MutablePropertySources propertySources = context.getEnvironment().getPropertySources();
        PropertySource<?> axGatewayProperties = propertySources.get("AxGatewayProperties");
        if (axGatewayProperties != null) {
            context.getEnvironment().getPropertySources().remove("AxGatewayProperties");
        }
        MapPropertySource mapprop = new MapPropertySource("AxGatewayProperties", props);
        context.getEnvironment().getPropertySources().addFirst(mapprop);
    }
}
