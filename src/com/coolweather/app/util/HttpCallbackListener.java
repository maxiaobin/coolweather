package com.coolweather.app.util;

import java.io.IOException;

/**
 * @author  作者 E-mail: 
 * @date 创建时间：2016-4-14 下午4:02:53 
 * @version 1.0 
 * @parameter  
 * @since  * @return  
 */
public interface HttpCallbackListener {

	void onFinish(String response);

	void onError(Exception e);

}
