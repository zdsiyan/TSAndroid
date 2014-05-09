package com.thinksns.jkfs.db;

import com.thinksns.jkfs.support.util.ThinkSNSApplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;

public class DBHelper extends SQLiteOpenHelper {

	private static DBHelper singleton = null;

	private static final String DATABASE_NAME = "thinksns.db";

	private static final int DATABASE_VERSION = 1;

	static final String CREATE_ACCOUNT_TABLE_SQL = "create table "
			+ AccountTable.TABLE_NAME + "(" + AccountTable.UID
			+ " text primary key," + AccountTable.OAUTH_TOKEN + " text,"
			+ AccountTable.OAUTH_TOKEN_SECRET + " text," + ");";

	static final String CREATE_USER_INFO_TABLE_SQL = "create table "
			+ UserInfoTable.TABLE_NAME + "(" + UserInfoTable.UID
			+ " text primary key," + UserInfoTable.UNAME + " text,"
			+ UserInfoTable.EMAIL + " text," + UserInfoTable.SEX + " text,"
			+ UserInfoTable.PROVINCE + " text," + UserInfoTable.CITY + " text,"
			+ UserInfoTable.AVATAR_URL + " text," + ");";

	public DBHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		// TODO Auto-generated constructor stub
	}

	public static synchronized DBHelper getInstance() {
		if (singleton == null) {
			singleton = new DBHelper(ThinkSNSApplication.getInstance());
		}
		return singleton;
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL(CREATE_ACCOUNT_TABLE_SQL);
		db.execSQL(CREATE_USER_INFO_TABLE_SQL);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
	}

}
