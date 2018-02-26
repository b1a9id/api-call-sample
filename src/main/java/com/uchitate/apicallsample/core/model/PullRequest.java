package com.uchitate.apicallsample.core.model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
public class PullRequest implements Serializable {
	private String url;
	private String htmlUrl;
	private String diffUrl;
	private String patchUrl;
}
