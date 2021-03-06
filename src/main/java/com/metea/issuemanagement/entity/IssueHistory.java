package com.metea.issuemanagement.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "issue_history")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class IssueHistory extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "description",length = 1000)
    private String description;

    @Column(name = "details",length = 4000)
    private String details;

    @Column(name = "date")
    private Date date;

    @Column(name = "issue_status")
    @Enumerated(EnumType.STRING)
    private IssueStatus issueStatus;

    @JoinColumn(unique = true,name = "issue_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Issue issue;

    @JoinColumn(unique = true,name = "assignee_user_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private User assignee;
}
