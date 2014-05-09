package com.thinksns.jkfs.db;



import com.thinksns.jkfs.bean.AccountBean;

import android.database.sqlite.SQLiteDatabase;

public class AccountDBOperate {
	private AccountDBOperate(){
		
	}
	
    private static SQLiteDatabase getWdb() {
        DBHelper databaseHelper = DBHelper.getInstance();
        return databaseHelper.getWritableDatabase();
    }

    private static SQLiteDatabase getRdb() {
        DBHelper databaseHelper = DBHelper.getInstance();
        return databaseHelper.getReadableDatabase();
    }
    
    public static void addOrUpdate(AccountBean account){
    	
    	
    }
    
    /**
     * 返回帐户信息
     * @param uid 
     * @return
     */
    public static AccountBean getAccount(String uid) {
    	return null;
    }
    
    

}
