package cn.tkl.dockTkl.common;


import com.alibaba.fastjson.JSONObject;

public class BaseResult<T> extends Result {
    private T data;

    public BaseResult(T data) {
        this.data = data;
    }

    public BaseResult() {
    }

    public BaseResult(boolean success, String message) {
        super(success, message);
    }

    public BaseResult(boolean success, String message, T data) {
        super(success, message);
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
