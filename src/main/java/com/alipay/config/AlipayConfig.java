package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

import org.springframework.context.annotation.Configuration;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

@Configuration
public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016101100657403";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCLzy2AnS9fHaFOE2IUIrgu5llbo3UareN1jvJE74O5MB444rPGlKy6jwdkjFdAvKUJiwW5YK4ISlZVCMYXF6WcwrX4I4soo3fOFtPnbPuwRNb0GPsNYsc9BrBMOKL45oSOT36o5kF3vXkM1WqoThfXu8fAZxEB1Sj0hCEHMzEPzm9211hPEbhEdIUw0JN4Vj5H+Kfirb+0llzuh5nboVrY3JV6bCthGOuZ5RiAMRFKreevLactrRPEI/MldIlCkqP/7KwPk2XqBdBejfWR6kas7nV9R5I+qiluq/G0Y/k1eEURj/GX7+QhcqYuoMQR7pfPtA5MSgRN0g+507Dwb7hvAgMBAAECggEAayI7UA8jOdPOw7F+usdQNEA3wU0kc2lEn9UGOWUAn2wL/LNb55QOOHdZxub0BZuJLCLoJAG92oR8W3T5tsBcHB/oqVkzTdTV/YronrKYu55EyZBK8Rr8afsyJXZRDEI42YR5HpwzFrqOhBMWRBpzktFGZF2WXr0lQRnu5UGJGv6Bytzt554rAqaSITZ8IDk7wq/6GOW8PtU1YlTpDgKIJ4OV88rohEoFb9VCwecnLHKXFYhL69BDaN4BOQ2KspRXAbSgWfbGsduMcn+HAdwlqPJfkcfltTSAHLz4sdlpfFXs1I5+6/ifJXr28VPTU5KL5OtvjoYQ1y3kXVhmTO/KgQKBgQDoIw6LlsYrWOWsJbrthu6ny8a2pGtrvdX9OtamtW9b4vdb5juDjgSUIn8zO1gp1i3807hU72jcGWEX/M9qaixEwJvontvgSf+ycjZ4EuMYajwFoCbzoKPUvPVEIh89qLe/BVZGeKf1Evee57ArSsR4V0S/bLGXUbJ/KJAWxexGfwKBgQCaLmpeTcFpzczuqHlZkUxd7ELsZ/+1BMr+/j8s1ryJcN7bDXzKktuGicGELLdBMdrxKEBRy0jkCmzW10DXpE7AhNkkv/p1vOKV0/m6X+BCEwY9B69FyqXWWYUkiMa5W/DSf6h4zomtNKPzFthuVBe2leb0spX2NIJGwi0suX/2EQKBgBKhna0+cLFR9T0X2iTuS4FULaLDF4wSNHaanlfLACET2l6Z3/TzFRL+oc7u2GijNBWyuHy4qmXf85cFR3B3DQ6HlvvYpDUgO1GLMSv5+Bghjqe07utm3T9Z2yWYx4EfZYADYaVOUcyttQof9lfDLHmsJ2xlwOswN29VRhtNz2TpAoGAJqtfiDluOhAgxvbAQMOdaK0Z99r5mjgShbPUunU9IieJ7VzLoK8Gmg6w12qzp4lOhU94GkunA3LN63BfVfZivgxTvdDci20NU1CwAJuNTmUhGmtz/UgfIcygBRK87L5vfwv/gBUlGKjsOcrQC5PRwryECXlE/VQcHI0U8XOw8VECgYEAvpM1slwVZ3Pe9WzSbzWGkq10HT+3IVYRyy9bc/YY8G/yDrb1iysB8kZhBZxqawr/6BCqAwZH/E5nhOYhPX9hPHDn5C1qIG9PTboGMapyhhX+jAUZWDa4f2UT0F3Q3JzLH8NQuZ7FxqlqcpYKF5O1lWIXB/pBJc50W4rVitJFAS8=";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAlhiamLu0Opt0gWNGPwIzwMCd2jYAJSdNnivbdCqx5ZP0aj+gJdfNTNlqNLvyfHfsZNG5xNht1J/AocecrPTo+V4wnQpVd07H8ggP1XJGfq4fMh7lfgm4qvKURnau565nejYBpqHFkbv38k+CPCavchSDGdaR1cI5xdTipnULnj7tIl1Z8kyHvCwpB/fvX3j5gCO0taMIOgc+nVMcXLKPt5Kqqp4lHx0wG+IsxtNB5ncCC9rDaAqOpepSeqOenjSxHGdRz0PsB0CjGEgnAMcMGpz/zeA7aKWN+wHB563DhhDpeuF2URpfQGpm4hNT2NAQPvTBFgO7ILxp5hhFIrORtwIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://127.0.0.1:8080/reading/notify_url";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://127.0.0.1:8080/reading/return_url";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


/*//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    *//** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     *//*
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }*/
}

