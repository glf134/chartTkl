package cn.tkl.dockTkl.common;

/**
 * @author wpj
 * @since 2020/10/9
 */


import com.alibaba.fastjson.JSONObject;

public class BocloudResult extends Result {
    private Object data;
    private String status;
    private String solution;

    public static BocloudResult FAILED(String message) {
        return new BocloudResult(false, message);
    }

    public BocloudResult() {
    }

    public BocloudResult(boolean success, String message) {
        super(success, message);
    }

    public BocloudResult(boolean success, Object data, String message) {
        super(success, message);
        this.data = data;
    }

    public BocloudResult(boolean success, String message, String code, String solution) {
        super(success, message);
        this.status = code;
        this.solution = solution;
    }

    public BocloudResult(boolean success, Object data, String message, String status, String solution) {
        super(success, message);
        this.data = data;
        this.status = status;
        this.solution = solution;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSolution() {
        return this.solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
