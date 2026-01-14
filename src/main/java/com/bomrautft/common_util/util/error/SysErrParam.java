package com.bomrautft.common_util.util.error;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SysErrParam implements Serializable {
    private static long serialVersionUID = 2647419933714044108L;

    /* Field Name got Exception */
    private String field;

    private Object value;

    private List<SysErrField> fieldList;

    private Integer minLength;

    private Integer maxLength;

    public SysErrParam() {
    }

    public SysErrParam(String field) {
        this.field = field;
    }

    public SysErrParam(String field, Object value) {
        this.field = field;
        this.value = value;
    }

    public SysErrParam(Object value) {
        this.value = value;
    }

    public SysErrParam(List<SysErrField> fieldList) {
        this.fieldList = fieldList;
    }
}
