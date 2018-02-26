package com.uchitate.apicallsample.core.model;

import com.uchitate.apicallsample.support.FormatUtils;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
public class IssueDetail implements Serializable, PrintModel {
	private String title;
	private String body;

	@Override
	public void print() {
		System.out.println(joinProperties());
	}

	public String joinProperties() {
		String title = FormatUtils.substring(this.title, 0, 11);
		String body = FormatUtils.substring(this.body, 0, 31);
		return title + "\t" + body;
	}
}
