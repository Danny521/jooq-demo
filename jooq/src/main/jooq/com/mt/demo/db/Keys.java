/*
 * This file is generated by jOOQ.
*/
package com.mt.demo.db;


import com.mt.demo.db.tables.DICTIONARY_TABLE;
import com.mt.demo.db.tables.USERS_TABLE;
import com.mt.demo.db.tables.USER_TABLE;
import com.mt.demo.db.tables.records.DictionaryRecord;
import com.mt.demo.db.tables.records.UserRecord;
import com.mt.demo.db.tables.records.UsersInfoRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>person_service_schema</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<UserRecord, Long> IDENTITY_USER = Identities0.IDENTITY_USER;
    public static final Identity<UsersInfoRecord, Long> IDENTITY_USERS = Identities0.IDENTITY_USERS;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<DictionaryRecord> KEY_SYS_DICTIONARY_PRIMARY = UniqueKeys0.KEY_SYS_DICTIONARY_PRIMARY;
    public static final UniqueKey<UserRecord> KEY_SYS_USER_PRIMARY = UniqueKeys0.KEY_SYS_USER_PRIMARY;
    public static final UniqueKey<UsersInfoRecord> KEY_USERS_PRIMARY = UniqueKeys0.KEY_USERS_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<UserRecord, Long> IDENTITY_USER = createIdentity(USER_TABLE.USER, USER_TABLE.USER.ID);
        public static Identity<UsersInfoRecord, Long> IDENTITY_USERS = createIdentity(USERS_TABLE.USERS, USERS_TABLE.USERS.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<DictionaryRecord> KEY_SYS_DICTIONARY_PRIMARY = createUniqueKey(DICTIONARY_TABLE.DICTIONARY, "KEY_sys_dictionary_PRIMARY", DICTIONARY_TABLE.DICTIONARY.DIC_ID);
        public static final UniqueKey<UserRecord> KEY_SYS_USER_PRIMARY = createUniqueKey(USER_TABLE.USER, "KEY_sys_user_PRIMARY", USER_TABLE.USER.ID);
        public static final UniqueKey<UsersInfoRecord> KEY_USERS_PRIMARY = createUniqueKey(USERS_TABLE.USERS, "KEY_users_PRIMARY", USERS_TABLE.USERS.ID);
    }
}