package com.example.interceptingfilter;

/**
 * 项目名称：PropAnimation
 * 应用包名 ：com.example.interceptingfilter
 * 创建人：爬格の瘦書生
 * Email ：1277502644@QQ.com
 * 创建时间：2016/12/30 14:47
 * 修改人：Administrator
 * 修改时间：2016/12/30 14:47
 * 类描述：
 * 修改备注：
 *
 * @version ：
 */

public class AuthenticationFilter implements Filter {
    public void execute(String request){
        System.out.println("Authenticating request: " + request);
    }
}
