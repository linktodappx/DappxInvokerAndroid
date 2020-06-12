package com.linkto.invoker.dapp_client.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BaseResultModel<T> implements Serializable {
	private int code;
	private T data;
	private String message;
	private String actionId;
}