package com.frank.dagger2demo.enity;

/**
 * Created by Frank on 2017/7/19.
 */

public class DBManager {

    private static DBManager instance;

    private DBManager() {
    }

    public static DBManager getInstance() {
        if ( instance == null ) {
            synchronized ( DBManager.class ) {
                if ( instance == null ) {
                    instance = new DBManager();
                }
            }
        }

        return instance;
    }
}
