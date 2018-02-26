package com.uchitate.apicallsample.core.model;

import lombok.*;

import java.io.Serializable;
import java.time.Instant;

@Getter
@Setter
public class Issue implements Serializable {
	private String url;
	private String repositoryUrl;
	private String labelsUrl;
	private String commentsUrl;
	private String eventsUrl;
	private String htmlUrl;
	private Integer id;
	private Integer number;
	private String title;
	private User user;
//	@JsonProperty("labels")
//	private Labels labels;
	private String state;
	private Boolean locked;
	private User assignee;
//	private List<User> assignees;
	private Milestone milestone;
	private Integer comments;
	private Instant createdAt;
	private Instant updatedAt;
	private Instant closedAt;
	private String authorAssociation;
	private PullRequest pullRequest;
	private String body;
}
