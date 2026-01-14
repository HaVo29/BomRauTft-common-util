package com.bomrautft.common_util.util.error;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SysErrField{
    private String name;
    private Object value;

    public SysErrField() {
    }

    public SysErrField(String name) {
        this.name = name;
    }

    public SysErrField(String name, Object value) {
        this.name = name;
        this.value = value;
    }


}
