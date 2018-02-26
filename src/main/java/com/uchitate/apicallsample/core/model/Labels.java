package com.uchitate.apicallsample.core.model;

import lombok.*;

import java.util.*;

@Getter
@Setter
public class Labels {

	private List<Label> labels;

	public Labels(Label[] labels) {
		this.labels = Arrays.asList(labels);
	}
}
