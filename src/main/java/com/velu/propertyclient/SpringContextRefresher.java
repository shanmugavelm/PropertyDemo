package com.velu.propertyclient;

import com.velu.propertyclient.properties.PropertyBinderConfiguration;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.endpoint.RefreshEndpoint;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * Created by GBS03019 on 5/24/2021.
 */
@Service
@RequiredArgsConstructor
public class SpringContextRefresher {

    private final PropertyBinderConfiguration propertyBinderConfiguration;
    private final ApplicationContext applicationContext;
    private final RefreshEndpoint restartEndpoint;

    public void refresh() {
        propertyBinderConfiguration.setApplicationContext(applicationContext);
        restartEndpoint.refresh();
    }
}
