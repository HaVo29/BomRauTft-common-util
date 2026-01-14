package com.bomrautft.common_util.util.constant;

import com.bomrautft.common_util.util.error.SysError;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultJson {
    private String message;
    private SysError error;
    private Object data;

    public ResultJson() {
    }

    public ResultJson(String message, SysError error, Object data) {
        this.message = message;
        this.error = error;
        this.data = data;
    }

    public ResultJson(String message) {
        this(message, null, null);
    }

    public ResultJson(Object data) {
        this(Constants.SUCCESS, null, data);
    }

    public ResultJson(SysError error, String message) {
        this(message, error, null);
    }

    public String getMessage() {
        return message;
    }

    public SysError getError() {
        return error;
    }

    public Object getData() {
        return data;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setError(SysError error) {
        this.error = error;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
