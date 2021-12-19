package com.example.serviceImpl;

import com.example.service.RecordService;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.fastjson.JSONObject;
import com.example.dao.UserDao;
import com.example.entity.User;
import com.example.dao.RecordDao;
import com.example.entity.Record;

import java.util.List;
import java.sql.Date;

@Service
public class RecordServiceImpl implements RecordService{
    
    @Autowired
    private UserDao userDao;
    @Autowired
    private RecordDao recordDao;

    public String getRecords() {
        JSONObject jsonObject = new JSONObject();
        List<Record> records = this.recordDao.order();
        if (records.isEmpty()) {
            jsonObject.put("result", false);
            jsonObject.put("message", "还没有记录");
            return jsonObject.toJSONString();
        } else {
            jsonObject.put("result", true);
            jsonObject.put("message", "获取记录成功");
            jsonObject.put("records", records);
            return jsonObject.toJSONString();
        }
    }

    public String setScore(Date recordTime, Integer recordScore, Integer userId, String userName) {
        JSONObject jsonObject = new JSONObject();
        List<Record> recordTmp = this.recordDao.selectByUserId(userId);
        if(recordTmp.isEmpty()) {
            Record recordInserted = new Record();
            recordInserted.setRecordTime(recordTime);
            recordInserted.setRecordScore(recordScore);
            recordInserted.setUserId(userId);
            recordInserted.setUserName(userName);
            this.recordDao.insert(recordInserted);
            jsonObject.put("result", true);
            jsonObject.put("message", "插入记录成功");
            return jsonObject.toJSONString();
        } else {
            Record recordUpdated = (Record) recordTmp.get(0);
            if(recordUpdated.getRecordScore() < recordScore){
                recordUpdated.setRecordTime(recordTime);
                recordUpdated.setRecordScore(recordScore);
                this.recordDao.updateByPrimaryKey(recordUpdated);
                jsonObject.put("result", true);
                jsonObject.put("message", "更新记录成功");
                return jsonObject.toJSONString();
            } else {
                jsonObject.put("result", false);
                jsonObject.put("message", "没有创造新的记录");
                return jsonObject.toJSONString();
            }
            
        }
        
    }
    
}
