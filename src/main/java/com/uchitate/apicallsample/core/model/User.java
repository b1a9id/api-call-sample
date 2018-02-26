package com.uchitate.apicallsample.core.model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
public class User implements Serializable {
	private String login;
	private Integer id;
	private String avatarUrl;
	private String gravatar_id;
	private String url;
	private String htmlUrl;
	private String followersUrl;
	private String followingUrl;
	private String gistsUrl;
	private String starredUrl;
	private String subscriptionsUrl;
	private String organizationsUrl;
	private String reposUrl;
	private String eventsUrl;
	private String receivedEventUrl;
	private String type;
	private Boolean siteAdmin;
}
