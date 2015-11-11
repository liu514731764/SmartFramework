package org.smart4j.framework.util;

/**
 * Created by liuping on 15/11/8.
 */
public class CastUtil {

    /**
     * 转为String
     * @param obj
     * @return
     */
    public static String castString(Object obj) {
        return castString(obj,"");
    }

    /**
     * 转为String (可提供默认值)
     * @param obj
     * @param defaultValue
     * @return
     */
    public static String castString(Object obj,String defaultValue) {
        return obj != null ? String.valueOf(obj) : defaultValue;
    }

    /**
     * 转为Double
     * @param obj
     * @return
     */
    public static double castDouble(Object obj) {
        return CastUtil.castDouble(obj,0);
    }

    public static double castDouble(Object obj,double defaultVlaue) {
        double doubleValue = defaultVlaue;
        if (obj != null) {
            String strValue = castString(obj);
            if (StringUtil.isNotEmpty(strValue))
                try {
                    doubleValue = Double.parseDouble(strValue);
                } catch (NumberFormatException e) {
                    doubleValue = defaultVlaue;
                }
        }
        return doubleValue;
    }

    public static Long castLong(Object obj) {

        return  CastUtil.castLong(obj,0);
    }

    public static Long castLong(Object obj,long defaultValue) {
        long longValue = defaultValue;
        if (obj != null) {
            String strValue = castString(obj);
            if (StringUtil.isNotEmpty(strValue)) {
                try{
                    longValue = Long.parseLong(strValue);
                } catch (NumberFormatException e) {
                    longValue = defaultValue;
                }
            }
        }
        return longValue;
    }

    public static int castInt(Object obj) {

        return  castInt(obj,0);
    }

    public static int castInt(Object obj,int defaultVale) {
        int intValue = defaultVale;
        if (obj != null) {
            String strValue = castString(obj);
            if (StringUtil.isNotEmpty(strValue)) {
                try {
                    intValue = Integer.parseInt(strValue);
                } catch (NumberFormatException e) {
                    intValue = defaultVale;
                }
            }
        }
        return intValue;
    }



    public static boolean castBoolean(Object obj) {
        return castBoolean(obj,false);
    }

    public static boolean castBoolean(Object obj,boolean defaultValue) {
        boolean booleanValue = defaultValue;
        if (obj != null) {

            String strValue = castString(obj);
            if (StringUtil.isNotEmpty(strValue)) {
                try {
                    booleanValue = Boolean.parseBoolean(strValue);
                } catch (Exception e) {
                    booleanValue = defaultValue;
                }
            }
        }
        return  booleanValue;
    }
}
