package com.thinksns.jkfs.db;

import android.database.sqlite.SQLiteDatabase;
/**
 * 用户资料DB操作类
 *
 */
public class UserInfoDBOperate {
	
	private UserInfoDBOperate(){
		
	}
	
    private static SQLiteDatabase getWdb() {
        DBHelper databaseHelper = DBHelper.getInstance();
        return databaseHelper.getWritableDatabase();
    }

    private static SQLiteDatabase getRdb() {
        DBHelper databaseHelper = DBHelper.getInstance();
        return databaseHelper.getReadableDatabase();
    }
    private static void add(){
    	
    }
    private static void update(){
    	
    }
    

}
