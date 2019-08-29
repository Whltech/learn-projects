package dev.ngai.fantastic.data.source.local.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import dev.ngai.fantastic.data.Collect;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "COLLECT".
*/
public class CollectDao extends AbstractDao<Collect, Long> {

    public static final String TABLENAME = "COLLECT";

    /**
     * Properties of entity Collect.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Type = new Property(1, String.class, "type", false, "TYPE");
        public final static Property Data = new Property(2, String.class, "data", false, "DATA");
        public final static Property Tag = new Property(3, String.class, "tag", false, "TAG");
        public final static Property LoginUnique = new Property(4, String.class, "loginUnique", false, "LOGIN_UNIQUE");
    }


    public CollectDao(DaoConfig config) {
        super(config);
    }
    
    public CollectDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"COLLECT\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"TYPE\" TEXT," + // 1: type
                "\"DATA\" TEXT," + // 2: data
                "\"TAG\" TEXT," + // 3: tag
                "\"LOGIN_UNIQUE\" TEXT);"); // 4: loginUnique
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"COLLECT\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Collect entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String type = entity.getType();
        if (type != null) {
            stmt.bindString(2, type);
        }
 
        String data = entity.getData();
        if (data != null) {
            stmt.bindString(3, data);
        }
 
        String tag = entity.getTag();
        if (tag != null) {
            stmt.bindString(4, tag);
        }
 
        String loginUnique = entity.getLoginUnique();
        if (loginUnique != null) {
            stmt.bindString(5, loginUnique);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Collect entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String type = entity.getType();
        if (type != null) {
            stmt.bindString(2, type);
        }
 
        String data = entity.getData();
        if (data != null) {
            stmt.bindString(3, data);
        }
 
        String tag = entity.getTag();
        if (tag != null) {
            stmt.bindString(4, tag);
        }
 
        String loginUnique = entity.getLoginUnique();
        if (loginUnique != null) {
            stmt.bindString(5, loginUnique);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Collect readEntity(Cursor cursor, int offset) {
        Collect entity = new Collect( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // type
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // data
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // tag
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4) // loginUnique
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Collect entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setType(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setData(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setTag(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setLoginUnique(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Collect entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Collect entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Collect entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
