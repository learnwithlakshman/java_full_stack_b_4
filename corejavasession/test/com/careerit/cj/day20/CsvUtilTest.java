package com.careerit.cj.day20;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class CsvUtilTest {

			@Test
			void loadDataFromCsv() {
				List<Student> list = CsvUtil.loadDataFromCSV();
				list.stream()
					.map(s->s.getName())
					.collect(Collectors.toList())
					.forEach(System.out::println);
			}
}
