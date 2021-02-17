package com.example.ReportPlayer.models.comment;


import com.example.ReportPlayer.enumerated.Server;
import com.example.ReportPlayer.models.report.description.DescriptionReport;
import com.example.ReportPlayer.models.report.description.DescriptionReportTurkey;
import com.example.ReportPlayer.models.user.User;

import javax.persistence.*;

@Entity
@Table(name = "comment_"+ Server.Region.TURKEY)
public class CommentTurkey  extends  Comment{

    @ManyToOne(fetch = FetchType.LAZY, optional=false)
    @JoinColumn(name = "description_report_turkey_id", nullable = false)
    private DescriptionReportTurkey descriptionReport;

    public CommentTurkey() {}


    @Override
    public DescriptionReportTurkey getDescriptionReport() {
        return descriptionReport;
    }

    @Override
    public void setDescriptionReport(DescriptionReport descriptionReport) {
        this.descriptionReport = (DescriptionReportTurkey ) descriptionReport;
    }
}
