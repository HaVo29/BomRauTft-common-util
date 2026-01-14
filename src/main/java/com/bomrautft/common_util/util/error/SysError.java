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
public class SysError implements Serializable {

    private static long serialVersionUID = 1657251328901151248L;

    private String code;

    private SysErrParam params;

    public SysError() {
    }

    public SysError(String code) {
        this.code = code;
    }

    public SysError(String code, SysErrParam params) {
        this.code = code;
        this.params = params;
    }

    public SysError(String code, Object value) {
        this.code = code;
        this.params = new SysErrParam(value);
    }

}
