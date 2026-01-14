package com.bomrautft.common_util.util.error;

import java.lang.reflect.Array;
import java.util.Arrays;

public enum SysErrMgs {
    SUCCESS(0, "acknowledge");

    private final int code;
    private final String message;

    SysErrMgs(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static SysErrMgs find(String code) {
        try {
            return get(Integer.parseInt(code.trim()));
        } catch (NumberFormatException e) {
            return SUCCESS;
        }
    }

    public static SysErrMgs get(String mgs) {
        return Arrays.stream(SysErrMgs.values())
                .filter(z -> z.getMessage().equalsIgnoreCase(mgs))
                .findFirst().orElse(SUCCESS);
    }

    public static SysErrMgs get(int code) {
        return Arrays.stream(SysErrMgs.values())
                .filter(z -> Integer.compare(code, z.getCode()) == 0)
                .findFirst().orElse(SUCCESS);
    }


    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}