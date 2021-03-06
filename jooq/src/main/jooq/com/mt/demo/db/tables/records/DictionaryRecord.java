/*
 * This file is generated by jOOQ.
*/
package com.mt.demo.db.tables.records;


import com.mt.demo.db.tables.DICTIONARY_TABLE;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 字典表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DictionaryRecord extends UpdatableRecordImpl<DictionaryRecord> implements Record8<String, String, String, String, String, String, String, Integer> {

    private static final long serialVersionUID = -706008963;

    /**
     * Setter for <code>person_service_schema.sys_dictionary.dic_id</code>.
     */
    public DictionaryRecord setDicId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>person_service_schema.sys_dictionary.dic_id</code>.
     */
    public String getDicId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>person_service_schema.sys_dictionary.parent_key</code>. 父项key
     */
    public DictionaryRecord setParentKey(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>person_service_schema.sys_dictionary.parent_key</code>. 父项key
     */
    public String getParentKey() {
        return (String) get(1);
    }

    /**
     * Setter for <code>person_service_schema.sys_dictionary.key</code>.
     */
    public DictionaryRecord setKey(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>person_service_schema.sys_dictionary.key</code>.
     */
    public String getKey() {
        return (String) get(2);
    }

    /**
     * Setter for <code>person_service_schema.sys_dictionary.value</code>.
     */
    public DictionaryRecord setValue(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>person_service_schema.sys_dictionary.value</code>.
     */
    public String getValue() {
        return (String) get(3);
    }

    /**
     * Setter for <code>person_service_schema.sys_dictionary.value_jp</code>. value值简拼
     */
    public DictionaryRecord setValueJp(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>person_service_schema.sys_dictionary.value_jp</code>. value值简拼
     */
    public String getValueJp() {
        return (String) get(4);
    }

    /**
     * Setter for <code>person_service_schema.sys_dictionary.category</code>. 字典类型
     */
    public DictionaryRecord setCategory(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>person_service_schema.sys_dictionary.category</code>. 字典类型
     */
    public String getCategory() {
        return (String) get(5);
    }

    /**
     * Setter for <code>person_service_schema.sys_dictionary.summary</code>. 字典说明
     */
    public DictionaryRecord setSummary(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>person_service_schema.sys_dictionary.summary</code>. 字典说明
     */
    public String getSummary() {
        return (String) get(6);
    }

    /**
     * Setter for <code>person_service_schema.sys_dictionary.sort_num</code>. 字典排序
     */
    public DictionaryRecord setSortNum(Integer value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>person_service_schema.sys_dictionary.sort_num</code>. 字典排序
     */
    public Integer getSortNum() {
        return (Integer) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, String, String, String, String, String, String, Integer> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, String, String, String, String, String, String, Integer> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return DICTIONARY_TABLE.DICTIONARY.DIC_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return DICTIONARY_TABLE.DICTIONARY.PARENT_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return DICTIONARY_TABLE.DICTIONARY.KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return DICTIONARY_TABLE.DICTIONARY.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return DICTIONARY_TABLE.DICTIONARY.VALUE_JP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return DICTIONARY_TABLE.DICTIONARY.CATEGORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return DICTIONARY_TABLE.DICTIONARY.SUMMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return DICTIONARY_TABLE.DICTIONARY.SORT_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getDicId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getParentKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getValueJp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getCategory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getSummary();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getSortNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictionaryRecord value1(String value) {
        setDicId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictionaryRecord value2(String value) {
        setParentKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictionaryRecord value3(String value) {
        setKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictionaryRecord value4(String value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictionaryRecord value5(String value) {
        setValueJp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictionaryRecord value6(String value) {
        setCategory(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictionaryRecord value7(String value) {
        setSummary(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictionaryRecord value8(Integer value) {
        setSortNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictionaryRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, Integer value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DictionaryRecord
     */
    public DictionaryRecord() {
        super(DICTIONARY_TABLE.DICTIONARY);
    }

    /**
     * Create a detached, initialised DictionaryRecord
     */
    public DictionaryRecord(String dicId, String parentKey, String key, String value, String valueJp, String category, String summary, Integer sortNum) {
        super(DICTIONARY_TABLE.DICTIONARY);

        set(0, dicId);
        set(1, parentKey);
        set(2, key);
        set(3, value);
        set(4, valueJp);
        set(5, category);
        set(6, summary);
        set(7, sortNum);
    }
}
