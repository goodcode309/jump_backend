package com.example.service;

import java.sql.Date;

public interface RecordService {

    String getRecords();

    String setScore(Date recordTime, Integer recordScore, Integer userId, String userName);
    
}
