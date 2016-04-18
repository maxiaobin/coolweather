package com.coolweather.app.receiver;



import com.coolweather.app.service.AutoUpdateService;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * @author  作者 E-mail: 
 * @date 创建时间：2016-4-18 下午4:00:18 
 * @version 1.0 
 * @parameter  
 * @since  * @return  
 */
public class AutoUpdateReceiver extends BroadcastReceiver { 
	 
	  @Override 
	  public void onReceive(Context context, Intent intent) { 
	    Intent i = new Intent(context, AutoUpdateService.class); 
	    context.startService(i); 
	  } 
	 
	} 
