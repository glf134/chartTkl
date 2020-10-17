package cn.tkl.dockTkl.common;

/**
 * @author wpj
 * @since 2020/10/10
 */
public class ResultTools {
    public ResultTools() {
    }

    public static BocloudResult formatErrResult() {
        return new BocloudResult(false, "参数格式错误", "400", "修改参数格式");
    }

    public static BocloudResult queryErrResult(String message, String solution) {
        return new BocloudResult(false, message, "404", solution);
    }

    public static BocloudResult noImplementedResult() {
        return new BocloudResult(false, "暂未实现", "450", "等待开发完成");
    }

    public static BocloudResult serverErrorResult() {
        return new BocloudResult(false, "服务器异常！", "505", "请查看服务器日志！");
    }

    public static BocloudResult timeoutResult() {
        return new BocloudResult(false, "请求时间失效", "505", "");
    }

    public static BocloudResult noPermissionResult() {
        return new BocloudResult(false, "您没有访问权限", "401", "");
    }

    public static BocloudResult sessionTimeoutResult() {
        return new BocloudResult(false, "会话失效！", "509", "请重新登录！");
    }
}
