/*
 * This file is generated by jOOQ.
*/
package com.mt.demo.db.tables.daos;


import com.mt.demo.db.tables.DICTIONARY_TABLE;
import com.mt.demo.db.tables.pojos.Dictionary;
import com.mt.demo.db.tables.records.DictionaryRecord;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


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
public class DictionaryDaoSupper extends DAOImpl<DictionaryRecord, Dictionary, String> {

    /**
     * Create a new DictionaryDaoSupper without any configuration
     */
    public DictionaryDaoSupper() {
        super(DICTIONARY_TABLE.DICTIONARY, Dictionary.class);
    }

    /**
     * Create a new DictionaryDaoSupper with an attached configuration
     */
    public DictionaryDaoSupper(Configuration configuration) {
        super(DICTIONARY_TABLE.DICTIONARY, Dictionary.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(Dictionary object) {
        return object.getDicId();
    }

    /**
     * Fetch records that have <code>dic_id IN (values)</code>
     */
    public List<Dictionary> fetchByDicId(String... values) {
        return fetch(DICTIONARY_TABLE.DICTIONARY.DIC_ID, values);
    }

    /**
     * Fetch a unique record that has <code>dic_id = value</code>
     */
    public Dictionary fetchOneByDicId(String value) {
        return fetchOne(DICTIONARY_TABLE.DICTIONARY.DIC_ID, value);
    }

    /**
     * Fetch records that have <code>parent_key IN (values)</code>
     */
    public List<Dictionary> fetchByParentKey(String... values) {
        return fetch(DICTIONARY_TABLE.DICTIONARY.PARENT_KEY, values);
    }

    /**
     * Fetch records that have <code>key IN (values)</code>
     */
    public List<Dictionary> fetchByKey(String... values) {
        return fetch(DICTIONARY_TABLE.DICTIONARY.KEY, values);
    }

    /**
     * Fetch records that have <code>value IN (values)</code>
     */
    public List<Dictionary> fetchByValue(String... values) {
        return fetch(DICTIONARY_TABLE.DICTIONARY.VALUE, values);
    }

    /**
     * Fetch records that have <code>value_jp IN (values)</code>
     */
    public List<Dictionary> fetchByValueJp(String... values) {
        return fetch(DICTIONARY_TABLE.DICTIONARY.VALUE_JP, values);
    }

    /**
     * Fetch records that have <code>category IN (values)</code>
     */
    public List<Dictionary> fetchByCategory(String... values) {
        return fetch(DICTIONARY_TABLE.DICTIONARY.CATEGORY, values);
    }

    /**
     * Fetch records that have <code>summary IN (values)</code>
     */
    public List<Dictionary> fetchBySummary(String... values) {
        return fetch(DICTIONARY_TABLE.DICTIONARY.SUMMARY, values);
    }

    /**
     * Fetch records that have <code>sort_num IN (values)</code>
     */
    public List<Dictionary> fetchBySortNum(Integer... values) {
        return fetch(DICTIONARY_TABLE.DICTIONARY.SORT_NUM, values);
    }
}