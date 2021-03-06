/*
 * This file is generated by jOOQ.
*/
package com.mt.demo.db;


import com.mt.demo.db.tables.DICTIONARY_TABLE;
import com.mt.demo.db.tables.USERS_TABLE;
import com.mt.demo.db.tables.USER_TABLE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PersonServiceSchema extends SchemaImpl {

    private static final long serialVersionUID = 1340091797;

    /**
     * The reference instance of <code>person_service_schema</code>
     */
    public static final PersonServiceSchema PERSON_SERVICE_SCHEMA = new PersonServiceSchema();

    /**
     * 字典表
     */
    public final DICTIONARY_TABLE DICTIONARY = com.mt.demo.db.tables.DICTIONARY_TABLE.DICTIONARY;

    /**
     * The table <code>person_service_schema.sys_user</code>.
     */
    public final USER_TABLE USER = com.mt.demo.db.tables.USER_TABLE.USER;

    /**
     * The table <code>person_service_schema.users</code>.
     */
    public final USERS_TABLE USERS = com.mt.demo.db.tables.USERS_TABLE.USERS;

    /**
     * No further instances allowed
     */
    private PersonServiceSchema() {
        super("person_service_schema", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            DICTIONARY_TABLE.DICTIONARY,
            USER_TABLE.USER,
            USERS_TABLE.USERS);
    }
}
