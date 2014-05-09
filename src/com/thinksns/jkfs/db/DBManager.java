package com.thinksns.jkfs.db;

import android.database.sqlite.SQLiteDatabase;

public class DBManager {
	private static DBManager singleton = null;

	private SQLiteDatabase wsd = null;

	private SQLiteDatabase rsd = null;

	private DBHelper databaseHelper = null;

	private DBManager() {

	}

	public synchronized static DBManager getInstance() {

		if (singleton == null) {
			DBHelper databaseHelper = DBHelper.getInstance();
			SQLiteDatabase wsd = databaseHelper.getWritableDatabase();
			SQLiteDatabase rsd = databaseHelper.getReadableDatabase();

			singleton = new DBManager();
			singleton.wsd = wsd;
			singleton.rsd = rsd;
			singleton.databaseHelper = databaseHelper;
		}

		return singleton;
	}

	public static void close() {
		if (singleton != null) {
			singleton.databaseHelper.close();
		}
	}

}
