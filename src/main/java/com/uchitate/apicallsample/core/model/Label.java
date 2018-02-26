package com.uchitate.apicallsample.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
public class Label implements Serializable {
	private Integer id;
	private String url;
	private String name;
	private String color;
	@JsonProperty("default")
	private Boolean defaultFlag;
}
