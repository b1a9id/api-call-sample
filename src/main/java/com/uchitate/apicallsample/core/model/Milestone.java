package com.uchitate.apicallsample.core.model;

import lombok.*;

import java.io.Serializable;
import java.time.Instant;

@Getter
@Setter
public class Milestone implements Serializable {
	private String url;
	private String htmlUrl;
	private String labelsUrl;
	private Integer id;
	private Integer number;
	private String title;
	private String description;
	private User creator;
	private Integer openIssues;
	private Integer closedIssues;
	private String state;
	private Instant createdAt;
	private Instant updatedAt;
	private Integer dueOn;
	private Instant closedAt;
}
