package com.example.entity;
import java.io.Serializable;
import java.sql.Date;

public class Record implements Serializable {
    private Integer recordId;
    private Date recordTime;
    private Integer recordScore;
    private Integer userId;
    private String userName;
    private static final long serialVersionUID = 1L;

    public Record() {
    }

    public Integer getRecordId() {
        return recordId;
    }
    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }
    public Date getRecordTime() {
        return recordTime;
    }
    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }
    public Integer getRecordScore() {
        return recordScore;
    }
    public void setRecordScore(Integer recordScore) {
        this.recordScore = recordScore;
    }
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Record [recordId=" + recordId + ", recordScore=" + recordScore + ", recordTime=" + recordTime
                + ", userId=" + userId + ", userName=" + userName + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((recordId == null) ? 0 : recordId.hashCode());
        result = prime * result + ((recordScore == null) ? 0 : recordScore.hashCode());
        result = prime * result + ((recordTime == null) ? 0 : recordTime.hashCode());
        result = prime * result + ((userId == null) ? 0 : userId.hashCode());
        result = prime * result + ((userName == null) ? 0 : userName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Record other = (Record) obj;
        if (recordId == null) {
            if (other.recordId != null)
                return false;
        } else if (!recordId.equals(other.recordId))
            return false;
        if (recordScore == null) {
            if (other.recordScore != null)
                return false;
        } else if (!recordScore.equals(other.recordScore))
            return false;
        if (recordTime == null) {
            if (other.recordTime != null)
                return false;
        } else if (!recordTime.equals(other.recordTime))
            return false;
        if (userId == null) {
            if (other.userId != null)
                return false;
        } else if (!userId.equals(other.userId))
            return false;
        if (userName == null) {
            if (other.userName != null)
                return false;
        } else if (!userName.equals(other.userName))
            return false;
        return true;
    }

}
