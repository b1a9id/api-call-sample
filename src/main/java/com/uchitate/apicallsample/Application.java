package com.uchitate.apicallsample;

import com.uchitate.apicallsample.core.model.*;
import com.uchitate.apicallsample.core.service.GitHubService;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.io.*;
import java.util.*;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args)) {
			GitHubService gitHubService = ctx.getBean(GitHubService.class);
			List<IssueDetail> issueDetails = gitHubService.getIssueDetails();
			issueDetails.forEach(IssueDetail::print);
			outputText(issueDetails);
			System.exit(SpringApplication.exit(ctx));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Bean
	public ExitCodeGenerator exitCodeGenerator() {
		return () -> 0;
	}

	public static void outputText(List<IssueDetail> issueDetails) {
		String dir = System.getProperty("user.dir");

		File file = new File(dir + "/issues.txt");
		PrintWriter writer = null;

		try {
			writer = new PrintWriter(new OutputStreamWriter(new FileOutputStream(file)));
			for (IssueDetail issueDetail : issueDetails) {
				writer.println(issueDetail.joinProperties());
			}
		} catch (FileNotFoundException e) {
			System.out.println("file not found.");
		} finally {
			Optional.ofNullable(writer).ifPresent(PrintWriter::close);
		}
	}
}
