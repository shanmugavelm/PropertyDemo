package com.velu.propertyclient.types;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Map;

@XmlRootElement
public class ConfiguratorResponse {

    private Errors errors;
    private Map<String, Object> payload;

    public Errors getErrors() {
        return errors;
    }

    public void setErrors(Errors errors) {
        this.errors = errors;
    }

    public Map<String, Object> getPayload() {
        return payload;
    }

    public void setPayload(Map<String, Object> payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "ConfiguratorResponse{" +
                "errors=" + errors +
                ", payload=" + payload +
                '}';
    }

}
