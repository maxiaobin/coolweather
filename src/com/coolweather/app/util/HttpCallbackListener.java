package com.coolweather.app.util;

import java.io.IOException;

/**
 * @author  ���� E-mail: 
 * @date ����ʱ�䣺2016-4-14 ����4:02:53 
 * @version 1.0 
 * @parameter  
 * @since  * @return  
 */
public interface HttpCallbackListener {

	void onFinish(String response);

	void onError(Exception e);

}
