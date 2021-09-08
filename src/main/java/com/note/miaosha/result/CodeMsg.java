package com.note.miaosha.result;

public class CodeMsg {

    private int code;

    private String msg;

    /**
     * 成功时的调用
     */
    public static final CodeMsg SUCCESS = new CodeMsg(200, "success");
    public static final CodeMsg SERVER_ERROR = new CodeMsg(500, "server error");

    private CodeMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
