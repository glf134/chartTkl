package cn.tkl.dockTkl.common;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;

/**
 * @author wpj
 * @since 2020/10/10
 */
public class JSONTools {
    private static Logger logger = LoggerFactory.getLogger(JSONTools.class);

    public JSONTools() {
    }

    public static boolean isMap(String jsonString) {
        try {
            JSONObject.parseObject(jsonString, HashMap.class);
            return true;
        } catch (Exception var2) {
            logger.error("Param format exception:{}", var2.getMessage());
            return false;
        }
    }

    public static BaseResult<JSONObject> isJSON(String jsonString) {
        if (StringUtils.isEmpty(jsonString)) {
            return new BaseResult(false, "FORMAT ERROR!");
        } else {
            try {
                JSONObject jsonObject = (JSONObject)JSONObject.parseObject(jsonString, JSONObject.class);
                return new BaseResult(true, "SUCCESS", jsonObject);
            } catch (Exception var2) {
                logger.error("Param format exception:{}", var2.getMessage());
                return new BaseResult(false, "FORMAT ERROR!");
            }
        }
    }

    public static BaseResult<List<JSONObject>> isJSONArray(String jsonString) {
        if (StringUtils.isEmpty(jsonString)) {
            return new BaseResult(false, "FORMAT ERROR!");
        } else {
            try {
                List<JSONObject> list = JSONObject.parseArray(jsonString, JSONObject.class);
                return new BaseResult(true, "SUCCESS", list);
            } catch (Exception var2) {
                logger.error("Param format exception:{}", var2.getMessage());
                return new BaseResult(false, "FORMAT ERROR!");
            }
        }
    }

    public static JSONObject isJSONObj(String jsonString) {
        if (StringUtils.isNotEmpty(jsonString)) {
            try {
                return (JSONObject)JSONObject.parseObject(jsonString, JSONObject.class);
            } catch (Exception var2) {
                logger.error("Param format exception: {}", var2.getMessage());
                return null;
            }
        } else {
            return null;
        }
    }

    public static JSONArray parseStr2JsonArray(String jsonString) {
        if (StringUtils.isNotEmpty(jsonString)) {
            try {
                return JSONArray.parseArray(jsonString);
            } catch (Exception var2) {
                logger.error("Param format exception: {}", var2.getMessage());
                return null;
            }
        } else {
            return null;
        }
    }
}
