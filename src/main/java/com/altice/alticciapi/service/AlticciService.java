package com.altice.alticciapi.service;

import com.altice.alticciapi.service.exception.BusinessException;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Log4j2
public class AlticciService {

	public List<Integer> alticciSequence(Integer number) {
		validateNumber(number);
		List<Integer> result = new ArrayList<>();

		for (int i = 0; i < number; i++)
			result.add(calculateSequence(i));

		return result;
	}
	private Integer calculateSequence(Integer number) {
		if (number < 2) {
			return number;
		} else if (number == 2) {
			return 1;
		} else {
			return calculateSequence(number -3) + calculateSequence(number - 2);
		}
	}
	private void validateNumber(Integer number) {
		if (number < 0) {
			throw new BusinessException("Invalid number " + number, HttpStatus.BAD_REQUEST.value());
		}
	}
}
