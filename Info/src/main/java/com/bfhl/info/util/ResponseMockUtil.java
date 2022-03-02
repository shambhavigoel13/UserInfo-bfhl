package com.bfhl.info.util;

import com.bfhl.info.response.InfoResponse;

public class ResponseMockUtil {
	public static InfoResponse infoResponse() {
		InfoResponse infoResponse = new InfoResponse();
		infoResponse.setEmail("john@yxz.com");
		infoResponse.setRoll_number("ABCD123");
		infoResponse.setUser_id("john_doe_17091999");
		infoResponse.setIs_success(true);
		return infoResponse;
	}
}
