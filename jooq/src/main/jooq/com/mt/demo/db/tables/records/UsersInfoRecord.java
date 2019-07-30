/*
 * This file is generated by jOOQ.
*/
package com.mt.demo.db.tables.records;


import com.mt.demo.db.tables.USERS_TABLE;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


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
public class UsersInfoRecord extends UpdatableRecordImpl<UsersInfoRecord> implements Record9<Long, String, String, Integer, String, String, Integer, String, Timestamp> {

    private static final long serialVersionUID = 1375462627;

    /**
     * Setter for <code>person_service_schema.users.id</code>.
     */
    public UsersInfoRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>person_service_schema.users.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>person_service_schema.users.name</code>.
     */
    public UsersInfoRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>person_service_schema.users.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>person_service_schema.users.id_card_number</code>.
     */
    public UsersInfoRecord setIdCardNumber(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>person_service_schema.users.id_card_number</code>.
     */
    public String getIdCardNumber() {
        return (String) get(2);
    }

    /**
     * Setter for <code>person_service_schema.users.gender</code>.
     */
    public UsersInfoRecord setGender(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>person_service_schema.users.gender</code>.
     */
    public Integer getGender() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>person_service_schema.users.phone_no</code>.
     */
    public UsersInfoRecord setPhoneNo(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>person_service_schema.users.phone_no</code>.
     */
    public String getPhoneNo() {
        return (String) get(4);
    }

    /**
     * Setter for <code>person_service_schema.users.email</code>.
     */
    public UsersInfoRecord setEmail(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>person_service_schema.users.email</code>.
     */
    public String getEmail() {
        return (String) get(5);
    }

    /**
     * Setter for <code>person_service_schema.users.status</code>.
     */
    public UsersInfoRecord setStatus(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>person_service_schema.users.status</code>.
     */
    public Integer getStatus() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>person_service_schema.users.department</code>.
     */
    public UsersInfoRecord setDepartment(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>person_service_schema.users.department</code>.
     */
    public String getDepartment() {
        return (String) get(7);
    }

    /**
     * Setter for <code>person_service_schema.users.create_time</code>.
     */
    public UsersInfoRecord setCreateTime(Timestamp value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>person_service_schema.users.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Long, String, String, Integer, String, String, Integer, String, Timestamp> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Long, String, String, Integer, String, String, Integer, String, Timestamp> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return USERS_TABLE.USERS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return USERS_TABLE.USERS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return USERS_TABLE.USERS.ID_CARD_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return USERS_TABLE.USERS.GENDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return USERS_TABLE.USERS.PHONE_NO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return USERS_TABLE.USERS.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return USERS_TABLE.USERS.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return USERS_TABLE.USERS.DEPARTMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return USERS_TABLE.USERS.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getIdCardNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getGender();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getPhoneNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getDepartment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersInfoRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersInfoRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersInfoRecord value3(String value) {
        setIdCardNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersInfoRecord value4(Integer value) {
        setGender(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersInfoRecord value5(String value) {
        setPhoneNo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersInfoRecord value6(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersInfoRecord value7(Integer value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersInfoRecord value8(String value) {
        setDepartment(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersInfoRecord value9(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersInfoRecord values(Long value1, String value2, String value3, Integer value4, String value5, String value6, Integer value7, String value8, Timestamp value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UsersInfoRecord
     */
    public UsersInfoRecord() {
        super(USERS_TABLE.USERS);
    }

    /**
     * Create a detached, initialised UsersInfoRecord
     */
    public UsersInfoRecord(Long id, String name, String idCardNumber, Integer gender, String phoneNo, String email, Integer status, String department, Timestamp createTime) {
        super(USERS_TABLE.USERS);

        set(0, id);
        set(1, name);
        set(2, idCardNumber);
        set(3, gender);
        set(4, phoneNo);
        set(5, email);
        set(6, status);
        set(7, department);
        set(8, createTime);
    }
}
