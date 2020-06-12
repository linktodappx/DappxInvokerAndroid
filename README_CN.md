## Android CocosWallet SDK接入文档

### 说明&支持
- 该SDK用于拉起大皮皮虾客户端，实现Dapp和大皮皮虾客户端进行相关cocosbcx action操作的交互。

### 开始接入

#### 本地maven仓库方式接入

- 项目根目录build.gradle文件添加 mavenUrl

```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

- 依赖sdk的module, build.gralde文件添加依赖如下

```
implementation 'com.github.linktodappx:CocosbcxInvokerAndroid:1.0.0'
```

### 使用

### APIs

#### 1.授权登录 (Authorize)

```
Authorize authorize = new Authorize();
authorize.setDappName("DappName"); // dapp name
authorize.setDappIcon("https://logoicon.png");// dapp icon
authorize.setActionId("web-99784c28-70f0-49ff-3654-f27b137b3502");// action ID (uuid)
authorize.setExpired(1537157808L); // Expired time
authorize.setDesc("desc content"); // Description
DpInvokerManager.getInstance().authorize(context, authorize, new CocosListener() {
	@Override
	public void onSuccess(String data) {
	}

	@Override
	public void onError(String data) {
	}

	@Override
	public void onCancel(String data) {
	}
});
```

#### 2.转账 (Transfer)

```
Transfer transfer = new Transfer();
transfer.setDappName("Newdex");// dapp name
transfer.setDappIcon("https://newdex.io/static/logoicon.png");
transfer.setActionId("web-99784c28-70f0-49ff-3654-f27b137b3502");
transfer.setExpired(1537157808L);
transfer.setDesc("desc content");
transfer.setFrom("gnkhandsome1");
transfer.setTo("gnkhandsome2");
transfer.setAmount(0.0001);
transfer.setSymbol("COCOS");
transfer.setPrecision(5);
transfer.setMemo("test");
DpInvokerManager.getInstance().transfer(context, transfer, new CocosListener() {
	@Override
	public void onSuccess(String data) {
	}

	@Override
	public void onError(String data) {
	}

	@Override
	public void onCancel(String data) {
	}
});
```

#### 3.合约调用 (Contract)

```
Contract contract = new Contract();
contract.setDappName("Newdex");
contract.setDappIcon("https://newdex.io/static/logoicon.png");
contract.setActionId("web-99784c28-70f0-49ff-3654-f27b137b3502");
contract.setExpired(1537157808L);
contract.setDesc("desc content");
contract.setContractNameOrId("1.16.13");
contract.setFunctionName("1.16.13");
contract.setValueList(new ArrayList());
DpInvokerManager.getInstance().callContract(context, contract, new CocosListener() {
	@Override
	public void onSuccess(String data) {
	}

	@Override
	public void onError(String data) {
	}

	@Override
	public void onCancel(String data) {
	}
});
```

#### 4.签名 (Signature)

```
SignMessage signMessage = new SignMessage();
signMessage.setDappName("Newdex");
signMessage.setDappIcon("https://newdex.io/static/logoicon.png");
signMessage.setActionId("web-99784c28-70f0-49ff-3654-f27b137b3502");
signMessage.setExpired(1537157808L);
signMessage.setDesc("desc content");
signMessage.setMessage("test sign message");
DpInvokerManager.getInstance().callContract(context, signMessage, new CocosListener() {
	@Override
	public void onSuccess(String data) {
	}

	@Override
	public void onError(String data) {
	}

	@Override
	public void onCancel(String data) {
	}
});
```
