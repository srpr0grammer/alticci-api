package com.altice.alticciapi.controller;

import com.altice.alticciapi.service.AlticciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("alticci")
public class AlticciSequenceController {

	@Autowired
	private AlticciService alticciService;

	@GetMapping("/{number}")
	public ResponseEntity<List<Integer>> alticciSequence(@PathVariable("number") Integer number) {
		return ResponseEntity.ok(alticciService.alticciSequence(number));
	}

}
