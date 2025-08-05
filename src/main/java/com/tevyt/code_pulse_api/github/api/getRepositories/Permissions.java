package com.tevyt.code_pulse_api.github.api.getRepositories;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.processing.Generated;
import java.util.LinkedHashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "admin",
        "pull",
        "triage",
        "push",
        "maintain"
})
@Generated("jsonschema2pojo")
public class Permissions {

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("admin")
    private Boolean admin;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("pull")
    private Boolean pull;
    @JsonProperty("triage")
    private Boolean triage;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("push")
    private Boolean push;
    @JsonProperty("maintain")
    private Boolean maintain;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("admin")
    public Boolean getAdmin() {
        return admin;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("admin")
    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("pull")
    public Boolean getPull() {
        return pull;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("pull")
    public void setPull(Boolean pull) {
        this.pull = pull;
    }

    @JsonProperty("triage")
    public Boolean getTriage() {
        return triage;
    }

    @JsonProperty("triage")
    public void setTriage(Boolean triage) {
        this.triage = triage;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("push")
    public Boolean getPush() {
        return push;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("push")
    public void setPush(Boolean push) {
        this.push = push;
    }

    @JsonProperty("maintain")
    public Boolean getMaintain() {
        return maintain;
    }

    @JsonProperty("maintain")
    public void setMaintain(Boolean maintain) {
        this.maintain = maintain;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
