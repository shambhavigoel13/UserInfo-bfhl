package com.bfhl.info.controller.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bfhl.info.request.InfoRequest;
import com.bfhl.info.response.InfoResponse;
import com.bfhl.info.util.ResponseMockUtil;

@Service
public class InfoService {
	public InfoResponse getInformation(InfoRequest req) {
		String data[] = req.getData();
		List<String> numbers = new ArrayList<>();
		List<String> alphabets = new ArrayList<>();

		for (String str : data) {
			if (isNumeric(str)) {
				numbers.add(str);
			} else
				alphabets.add(str);
		}
		String[] allpha = new String[alphabets.size()];
		int i = 0;
		for (String str : alphabets) {
			allpha[i] = str;
			i++;
		}
		String[] nums = new String[numbers.size()];
		int j = 0;
		for (String str : numbers) {
			nums[j] = str;
			j++;
		}
		InfoResponse response = ResponseMockUtil.infoResponse();
		response.setAlphabets(allpha);
		response.setNumbers(nums);
		return response;
	}

	private boolean isNumeric(String str) {
		boolean isNumeric = false;
		if (str == null || str.equals(""))
			return isNumeric;
		try {
			Integer.parseInt(str);
			isNumeric = true;
		} catch (NumberFormatException exc) {
			isNumeric = false;
		}
		return isNumeric;
	}
}
