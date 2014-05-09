package com.thinksns.jkfs.support.util;

import com.thinksns.jkfs.bean.AccountBean;

import android.app.Activity;
import android.app.Application;

public final class ThinkSNSApplication extends Application {
	private static ThinkSNSApplication globalContext = null;

	private AccountBean accountBean;

	private Activity activity;

	@Override
	public void onCreate() {
		super.onCreate();
		globalContext = this;
	}

	public static ThinkSNSApplication getInstance() {
		return globalContext;
	}

	public AccountBean getAccountBean() {
		return accountBean;
	}

	public void setAccountBean(AccountBean accountBean) {
		this.accountBean = accountBean;
	}

	public Activity getActivity() {
		return activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}
}