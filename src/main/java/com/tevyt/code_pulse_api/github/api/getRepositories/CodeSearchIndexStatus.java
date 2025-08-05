package com.tevyt.code_pulse_api.github.api.getRepositories;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.processing.Generated;
import java.util.LinkedHashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("jsonschema2pojo")
public class CodeSearchIndexStatus {

    @JsonProperty("lexical_search_ok")
    private Boolean lexicalSearchOk;
    @JsonProperty("lexical_commit_sha")
    private String lexicalCommitSha;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("lexical_search_ok")
    public Boolean getLexicalSearchOk() {
        return lexicalSearchOk;
    }

    @JsonProperty("lexical_search_ok")
    public void setLexicalSearchOk(Boolean lexicalSearchOk) {
        this.lexicalSearchOk = lexicalSearchOk;
    }

    @JsonProperty("lexical_commit_sha")
    public String getLexicalCommitSha() {
        return lexicalCommitSha;
    }

    @JsonProperty("lexical_commit_sha")
    public void setLexicalCommitSha(String lexicalCommitSha) {
        this.lexicalCommitSha = lexicalCommitSha;
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
