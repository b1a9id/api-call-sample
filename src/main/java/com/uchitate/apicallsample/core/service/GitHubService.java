package com.uchitate.apicallsample.core.service;

import com.uchitate.apicallsample.core.model.IssueDetail;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
public class GitHubService {

	@Value("${github.api.url}")
	public String gitHubUrl;

	private static final RestTemplate restTemplate = new RestTemplate();

	public List<IssueDetail> getIssueDetails() {
		IssueDetail[] issueArray = restTemplate.getForObject(gitHubUrl + "/issues", IssueDetail[].class);
		return Arrays.asList(issueArray);
	}
}
