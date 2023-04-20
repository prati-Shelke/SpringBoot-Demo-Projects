package com.pratiksha.socialfeed.models;

import java.util.ArrayList;
import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

// @Document()
@Data
@AllArgsConstructor
public class CommentModel 
{
    @Id
    private String _id;
    private String comment;

    private ArrayList<String> likes = new ArrayList<>();

    private ArrayList<ReplyModel> reply = new ArrayList<>();

    @CreatedBy
    private String createdBy;

    @CreatedDate
    private Date createdAt;

    
    public CommentModel() 
    {
        this._id = new ObjectId().toString();
    }

    
}
