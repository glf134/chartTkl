package cn.tkl.dockTkl.service.impl;

import cn.tkl.dockTkl.common.ApiClient;
import cn.tkl.dockTkl.service.TaoKouLingService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;

import java.util.TreeMap;

/**
 * @author wpj
 * @since 2020/10/9
 */
@Service("TaoKouLing")
public class TaoKouLingServiceImpl implements TaoKouLingService {
    static String uri = "https://openapi.dataoke.com/api/tb-service/twd-to-twd";
    static String appKey = "5f807b99042f0";
    static String appSecurity = "d6f19d8eed4c655ef40902cb2f4dff5f";
    static String version = "v1.0.0";
    static String pid = "mm_127672914_39278482_146236599";

    @Override
    public String operation(String TaoKouLing) {
        TreeMap<String, String> paraMap = new TreeMap<>();
        paraMap.put("version", version);
        paraMap.put("appKey", appKey);
        paraMap.put("content", TaoKouLing);
        paraMap.put("pid", pid);
        String data = ApiClient.sendReq(uri, appSecurity, paraMap);
//        JSONObject jsonObject1 = new JSONObject();

        if (null != data) {
            JSONObject jsonObject = JSONObject.parseObject(data);
            if (null != jsonObject.get("data")) {
                JSONObject data1 = JSONObject.parseObject(jsonObject.get("data").toString());
                String longTpwd = data1.getString("longTpwd");
                if (null != longTpwd) {
//                    jsonObject1.put("111",longTpwd);
                    return longTpwd;
                } else {
                    return "此商品没有优惠劵或佣金";
                }
            } else {
                return "此商品没有优惠劵或佣金";
            }
        } else {
            return "此商品没有优惠劵或佣金";
        }
    }
}
