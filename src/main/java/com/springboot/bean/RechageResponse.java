package com.springboot.bean;

public class RechageResponse {

	private String requestId;
	private String orderId;
	private String ts;
	private String rs;
	private String ver;
	private String method;
	private String result;
	private String voucherContent;
	private String sign;
	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getTs() {
		return ts;
	}
	public void setTs(String ts) {
		this.ts = ts;
	}
	public String getRs() {
		return rs;
	}
	public void setRs(String rs) {
		this.rs = rs;
	}
	public String getVer() {
		return ver;
	}
	public void setVer(String ver) {
		this.ver = ver;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getVoucherContent() {
		return voucherContent;
	}
	public void setVoucherContent(String voucherContent) {
		this.voucherContent = voucherContent;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	
}
