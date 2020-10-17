package cn.tkl.dockTkl.common;

import com.alibaba.fastjson.JSONObject;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConvertorParams {

	public static JSONObject getJSONParam(HttpServletRequest request){
	    JSONObject jsonParam = null;
	    try {
	        // 获取输入流
	        BufferedReader streamReader = new BufferedReader(new InputStreamReader(request.getInputStream(), "UTF-8"));

	        // 写入数据到Stringbuilder
	        StringBuilder sb = new StringBuilder();
	        String line = null;
	        while ((line = streamReader.readLine()) != null) {
	            sb.append(line);
	        }
	        jsonParam = JSONObject.parseObject(sb.toString());
	    } catch (Exception e) {
//	        e.printStackTrace();
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("-1","输入参数有误");
			jsonParam = jsonObject;
	    }
	    return jsonParam;
	}
}
