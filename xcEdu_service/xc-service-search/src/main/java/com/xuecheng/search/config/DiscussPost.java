package com.xuecheng.search.config;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

/**
 * @Author fulg
 * @Date 2022/1/20 15:47
 * @Version 1.0
 */
@Document(indexName = "discusspost", type = "_doc", shards = 6, replicas = 3)
public class DiscussPost {
    
    @Id
    private int id;
    
    @Field(type = FieldType.Integer)
    private int userId;
    
    @Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_smart")
    private String title;
    
    @Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_smart")
    private String content;
    
    @Field(type = FieldType.Integer)
    private int type;
    
    @Field(type = FieldType.Integer)
    private int status;
    
    @Field(type = FieldType.Date, format= DateFormat.date_optional_time)
    private Date createTime;
    
    @Field(type = FieldType.Integer)
    private int commentCount;
    
    @Field(type = FieldType.Double)
    private double score;
    
    // 下面省略了get和set方法，也省略了toString()方法，自行补充
    
}