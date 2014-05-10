package com.thinksns.jkfs.db;

import android.database.sqlite.SQLiteDatabase;

/**
 * user_info表操作类
 * 
 * @author wangjia
 * 
 */
public class UserInfoOperator {
	public static final String TABLE_NAME = "user_info_table";
	public static final String UID = "uid";
	public static final String UNAME = "uname";
	public static final String EMAIL = "email";
	public static final String SEX = "sex";
	public static final String PROVINCE = "province";
	public static final String CITY = "city";
	public static final String AVATAR_URL = "avatar_url";

	private UserInfoOperator() {

	}

	private static SQLiteDatabase getWdb() {
		DBHelper databaseHelper = DBHelper.getInstance();
		return databaseHelper.getWritableDatabase();
	}

	private static SQLiteDatabase getRdb() {
		DBHelper databaseHelper = DBHelper.getInstance();
		return databaseHelper.getReadableDatabase();
	}

	private static void add() {

	}

	private static void update() {

	}

}
