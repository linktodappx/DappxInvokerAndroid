package com.linkto.invoker.dapp_client;

import android.app.Activity;
import android.os.Bundle;

import com.linkto.invoker.dapp_client.manage.DpInvokerManager;

public class CocosAssistActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//在回调的activity处理逻辑
		DpInvokerManager.getInstance().parseIntent(getIntent());
		this.finish();
	}
}