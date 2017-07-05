
package io.ph.restwrappers.overwatch.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OverwatchPlayer {

	@SerializedName("us")
	@Expose
	private Us us;
	@SerializedName("eu")
	@Expose
	private Eu eu;
	@SerializedName("_request")
	@Expose
	private Request request;
	@SerializedName("kr")
	@Expose
	private Kr kr;
	@SerializedName("any")
	@Expose
	private Object any;
	@SerializedName("msg")
	@Expose
	private String msg;
	@SerializedName("error")
	@Expose
	private int error;

	public String getMsg() {
		return this.msg;
	}

	public int getError() {
		return this.error;
	}

	public Us getUs() {
		return us;
	}

	public void setUs(Us us) {
		this.us = us;
	}

	public Eu getEu() {
		return eu;
	}

	public void setEu(Eu eu) {
		this.eu = eu;
	}

	public Request getRequest() {
		return request;
	}

	public void setRequest(Request request) {
		this.request = request;
	}

	public Kr getKr() {
		return kr;
	}

	public void setKr(Kr kr) {
		this.kr = kr;
	}

	public Object getAny() {
		return any;
	}

	public void setAny(Object any) {
		this.any = any;
	}

}
