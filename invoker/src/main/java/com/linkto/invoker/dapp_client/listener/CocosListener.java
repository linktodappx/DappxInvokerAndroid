package com.linkto.invoker.dapp_client.listener;

public interface CocosListener {
	void onSuccess(String data);

	void onError(String data);

	void onCancel(String data);
}