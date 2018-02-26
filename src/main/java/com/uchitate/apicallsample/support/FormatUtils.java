package com.uchitate.apicallsample.support;

import org.springframework.util.StringUtils;

public class FormatUtils {

	public static String substring(String value, int begin, int end) {
		if (StringUtils.isEmpty(value)) {
			return "";
		}
		int parsedEnd = value.length() < end ? value.length() : end;
		return removeNewLine(value)
				.substring(begin, parsedEnd);
	}

	public static String removeNewLine(String value) {
		if (StringUtils.isEmpty(value)) {
			return "";
		}
		return value.replaceAll("[\r\n]", "");
	}
}
