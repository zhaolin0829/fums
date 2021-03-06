package com.fums.system_management.dao;

import com.fums.pojo.FormOverview;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @outher: Huangdebao
 * @Date: 2020/7/15 0015 下午 2:18
 * Desc: 描述
 */
@Mapper
@Repository
public interface FormOverviewDAO {

    List<FormOverview> seleForm(@Param("followUpName") String followUpName,
                                @Param("creationDate") Date creationDate,
                                @Param("updatedDate") Date updatedDate,
                                @Param("templateName") String templateName,
                                @Param("theReator") String theReator);

}
