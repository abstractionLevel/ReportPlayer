package com.example.ReportPlayer.repository.comment;

import com.example.ReportPlayer.enumerated.Server;
import com.example.ReportPlayer.models.comment.CommentKorea;
import org.springframework.stereotype.Repository;

@Repository("comment_repository_"+ Server.Region.KOREA)
public interface CommentKoreaRepository  extends CommentBaseRepository<CommentKorea>{
}
