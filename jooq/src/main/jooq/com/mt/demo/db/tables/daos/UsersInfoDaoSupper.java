/*
 * This file is generated by jOOQ.
*/
package com.mt.demo.db.tables.daos;


import com.mt.demo.db.tables.USERS_TABLE;
import com.mt.demo.db.tables.pojos.UsersInfo;
import com.mt.demo.db.tables.records.UsersInfoRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


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
public class UsersInfoDaoSupper extends DAOImpl<UsersInfoRecord, UsersInfo, Long> {

    /**
     * Create a new UsersInfoDaoSupper without any configuration
     */
    public UsersInfoDaoSupper() {
        super(USERS_TABLE.USERS, UsersInfo.class);
    }

    /**
     * Create a new UsersInfoDaoSupper with an attached configuration
     */
    public UsersInfoDaoSupper(Configuration configuration) {
        super(USERS_TABLE.USERS, UsersInfo.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(UsersInfo object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<UsersInfo> fetchById(Long... values) {
        return fetch(USERS_TABLE.USERS.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public UsersInfo fetchOneById(Long value) {
        return fetchOne(USERS_TABLE.USERS.ID, value);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<UsersInfo> fetchByName(String... values) {
        return fetch(USERS_TABLE.USERS.NAME, values);
    }

    /**
     * Fetch records that have <code>id_card_number IN (values)</code>
     */
    public List<UsersInfo> fetchByIdCardNumber(String... values) {
        return fetch(USERS_TABLE.USERS.ID_CARD_NUMBER, values);
    }

    /**
     * Fetch records that have <code>gender IN (values)</code>
     */
    public List<UsersInfo> fetchByGender(Integer... values) {
        return fetch(USERS_TABLE.USERS.GENDER, values);
    }

    /**
     * Fetch records that have <code>phone_no IN (values)</code>
     */
    public List<UsersInfo> fetchByPhoneNo(String... values) {
        return fetch(USERS_TABLE.USERS.PHONE_NO, values);
    }

    /**
     * Fetch records that have <code>email IN (values)</code>
     */
    public List<UsersInfo> fetchByEmail(String... values) {
        return fetch(USERS_TABLE.USERS.EMAIL, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<UsersInfo> fetchByStatus(Integer... values) {
        return fetch(USERS_TABLE.USERS.STATUS, values);
    }

    /**
     * Fetch records that have <code>department IN (values)</code>
     */
    public List<UsersInfo> fetchByDepartment(String... values) {
        return fetch(USERS_TABLE.USERS.DEPARTMENT, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<UsersInfo> fetchByCreateTime(Timestamp... values) {
        return fetch(USERS_TABLE.USERS.CREATE_TIME, values);
    }
}
