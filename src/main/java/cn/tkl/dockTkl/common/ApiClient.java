package cn.tkl.dockTkl.common;


import java.net.URISyntaxException;
import java.util.TreeMap;

/**
 * @projectName:dtk-items-openapi
 * @createTime: 2019年11月28日14:13:21
 * @description:
 */
public class ApiClient {

    public static String sendReqNew(String url, String secret, TreeMap<String, String> paraMap){
        if(null == url || "".equals(url)){
            return "请求地址不能为空";
        }
        if(null == secret || "".equals(secret)){
            return "secret不能为空";
        }
        if(null == paraMap || paraMap.size() < 1){
            return "参数不能为空";
        }

        String timer = String.valueOf(System.currentTimeMillis());
        paraMap.put("timer", timer);
        paraMap.put("nonce", "110505");
        paraMap.put("signRan", SignMD5Util.getSignStrNew(paraMap, secret));
        String data = "";
        try {
            data = HttpUtil.httpGetRequest(url, paraMap);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        return data;
    }

    public static String sendReq(String url, String secret, TreeMap<String, String> paraMap){
        if(null == url || "".equals(url)){
            return "请求地址不能为空";
        }
        if(null == secret || "".equals(secret)){
            return "secret不能为空";
        }
        if(null == paraMap || paraMap.size() < 1){
            return "参数不能为空";
        }

        paraMap.put("sign", SignMD5Util.getSignStr(paraMap, secret));
        String data = "";
        try {
            data = HttpUtil.httpGetRequest(url, paraMap);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        return data;
    }

//    public static void main(String[] args) {
//
//        String uri = "https://openapi.dataoke.com/api/tb-service/twd-to-twd";
//        String appKey = "5f807b99042f0";
//        String appSecurity = "d6f19d8eed4c655ef40902cb2f4dff5f";
//        String version = "v1.0.0";
//        String pid = "mm_127672914_39278482_146236599";
//        String content = "9幅治这行话 Http:/T₳QcZ4c6Pu1HY₳打開ta0寶【拖把杆旋转通用式免手洗地拖家用自动甩水懒人拖地神器墩布桶拖布】";
//
//
//
//        TreeMap<String, String> paraMap = new TreeMap<>();
//        paraMap.put("version", version);
//        paraMap.put("appKey", appKey);
//        paraMap.put("content",content);
//        paraMap.put("pid",pid);
//        String data = ApiClient.sendReq(uri, appSecurity, paraMap);
//        System.out.println(data);
//    }

}
