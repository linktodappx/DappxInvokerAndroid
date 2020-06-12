## Android CocosWallet SDK Access Documentation

### Instructions & Support
-This SDK is used to pull up the Dappx client and complete the interaction between Dapp and Dappx Client for related action operations of cocosbcx.

### Start access

#### Local maven warehouse access

- Add mavenUrl to the project root build.gradle file

```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

- module relys on sdk, build.gralde file adds dependencies as follows

```
implementation 'com.github.linktodappx:CocosbcxInvokerAndroid:1.0.0'
```

### Instructions

### APIs

#### 1.Login Authorize (Authorize)

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

#### 2.Transfer (Transfer)

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

#### 3.Calling contract (Contract)

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

#### 4.SignMessage (Signature)

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
