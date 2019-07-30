/*
 * This file is generated by jOOQ.
*/
package com.mt.demo.db.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


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
public class UsersInfo implements Serializable {

    private static final long serialVersionUID = 239105260;

    private Long      id;
    private String    name;
    private String    idCardNumber;
    private Integer   gender;
    private String    phoneNo;
    private String    email;
    private Integer   status;
    private String    department;
    private Timestamp createTime;

    public UsersInfo() {}

    public UsersInfo(UsersInfo value) {
        this.id = value.id;
        this.name = value.name;
        this.idCardNumber = value.idCardNumber;
        this.gender = value.gender;
        this.phoneNo = value.phoneNo;
        this.email = value.email;
        this.status = value.status;
        this.department = value.department;
        this.createTime = value.createTime;
    }

    public UsersInfo(
        Long      id,
        String    name,
        String    idCardNumber,
        Integer   gender,
        String    phoneNo,
        String    email,
        Integer   status,
        String    department,
        Timestamp createTime
    ) {
        this.id = id;
        this.name = name;
        this.idCardNumber = idCardNumber;
        this.gender = gender;
        this.phoneNo = phoneNo;
        this.email = email;
        this.status = status;
        this.department = department;
        this.createTime = createTime;
    }

    public Long getId() {
        return this.id;
    }

    public UsersInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public UsersInfo setName(String name) {
        this.name = name;
        return this;
    }

    public String getIdCardNumber() {
        return this.idCardNumber;
    }

    public UsersInfo setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
        return this;
    }

    public Integer getGender() {
        return this.gender;
    }

    public UsersInfo setGender(Integer gender) {
        this.gender = gender;
        return this;
    }

    public String getPhoneNo() {
        return this.phoneNo;
    }

    public UsersInfo setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }

    public String getEmail() {
        return this.email;
    }

    public UsersInfo setEmail(String email) {
        this.email = email;
        return this;
    }

    public Integer getStatus() {
        return this.status;
    }

    public UsersInfo setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public String getDepartment() {
        return this.department;
    }

    public UsersInfo setDepartment(String department) {
        this.department = department;
        return this;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public UsersInfo setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final UsersInfo other = (UsersInfo) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        }
        else if (!name.equals(other.name))
            return false;
        if (idCardNumber == null) {
            if (other.idCardNumber != null)
                return false;
        }
        else if (!idCardNumber.equals(other.idCardNumber))
            return false;
        if (gender == null) {
            if (other.gender != null)
                return false;
        }
        else if (!gender.equals(other.gender))
            return false;
        if (phoneNo == null) {
            if (other.phoneNo != null)
                return false;
        }
        else if (!phoneNo.equals(other.phoneNo))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        }
        else if (!email.equals(other.email))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        }
        else if (!status.equals(other.status))
            return false;
        if (department == null) {
            if (other.department != null)
                return false;
        }
        else if (!department.equals(other.department))
            return false;
        if (createTime == null) {
            if (other.createTime != null)
                return false;
        }
        else if (!createTime.equals(other.createTime))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((idCardNumber == null) ? 0 : idCardNumber.hashCode());
        result = prime * result + ((gender == null) ? 0 : gender.hashCode());
        result = prime * result + ((phoneNo == null) ? 0 : phoneNo.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        result = prime * result + ((department == null) ? 0 : department.hashCode());
        result = prime * result + ((createTime == null) ? 0 : createTime.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UsersInfo (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(idCardNumber);
        sb.append(", ").append(gender);
        sb.append(", ").append(phoneNo);
        sb.append(", ").append(email);
        sb.append(", ").append(status);
        sb.append(", ").append(department);
        sb.append(", ").append(createTime);

        sb.append(")");
        return sb.toString();
    }
}