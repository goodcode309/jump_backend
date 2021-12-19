package com.example.dao;

import java.util.List;
import com.example.entity.RecordExample;
import com.example.entity.Record;
import org.apache.ibatis.annotations.Param;

public interface RecordDao {
    //long countByExample(RecordExample example);

    //int deleteByExample(RecordExample example);

    int deleteByPrimaryKey(Integer recordId);

    int insert(Record record);

    //int insertSelective(Record record);

    //List<Instruction> selectByExample(InstructionExample example);

    Record selectByPrimaryKey(Integer recordId);

    //int updateByExampleSelective(@Param("record") Instruction record, @Param("example") InstructionExample example);

    //int updateByExample(@Param("record") Instruction record, @Param("example") InstructionExample example);

    //int updateByPrimaryKeySelective(Record record);

    int updateByPrimaryKey(Record record);

    List<Record> order();

    List<Record> selectByUserId(Integer userId);
}
