package cn.tkl.dockTkl.common;

/**
 * @author wpj
 * @since 2020/10/9
 */
public class Result {
    private boolean success;
    private String message;
    private String errorMsg;

    public Result() {
    }

    public Result(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public Result(boolean success, String message, String errorMsg) {
        this.success = success;
        this.message = message;
        this.errorMsg = errorMsg;
    }

    public static Result SUCCESS(String message) {
        return new Result(true, message);
    }

    public static Result FAILED(String message) {
        return new Result(false, message);
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public boolean isFailed() {
        return !this.success;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String toString() {
        return "Result [success=" + this.success + ", message=" + this.message + ", errorMsg=" + this.errorMsg + "]";
    }
}