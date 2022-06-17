package com.koreait.action;

public class ActionForward {
	// 데이터가 반드시 프론트 영역까지 넘어갈 때는 forward <-> 데이터가 남아있지 않을 때는 redirect
	
	private boolean isRedirect;
	private String path;
	
	public ActionForward() {}
	
	public ActionForward(boolean isRedirect, String path) {
		super();
		this.isRedirect = isRedirect;
		this.path = path;
	}

	public boolean isRedirect() {
		return isRedirect;
	}
	public void setRedirect(boolean isRedirect) {
		this.isRedirect = isRedirect;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	
	
}
