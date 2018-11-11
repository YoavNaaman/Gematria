package com.yoav.gematria;

import java.util.Objects;

import org.apache.commons.lang3.StringUtils;

public class GematrisCalculator implements IGematria{

	public GematrisCalculator() {
		super();
	}

	public GematriaResult gematria(String value) {
		Objects.requireNonNull(value, "Gematria input value is required.");
		GematriaResult result = new GematriaResult();
		int caclulatedBigGematria = this.caclulateBigGematria(value);
		result.setResult(caclulatedBigGematria);
		result.setSmallResult(this.caclulateSmallGematria(caclulatedBigGematria));
		return result;

	}

	private int caclulateBigGematria(String value) {
		int sum = 0;
		sum += StringUtils.countMatches(value,"א") * 1;
		sum += StringUtils.countMatches(value,"ב") * 2;
		sum += StringUtils.countMatches(value,"ג") * 3;
		sum += StringUtils.countMatches(value,"ד") * 4;
		sum += StringUtils.countMatches(value,"ה") * 5;
		sum += StringUtils.countMatches(value,"ו") * 6;
		sum += StringUtils.countMatches(value,"ז") * 7;
		sum += StringUtils.countMatches(value,"ח") * 8;
		sum += StringUtils.countMatches(value,"ט") * 9;
		sum += StringUtils.countMatches(value,"י") * 10;
		sum += StringUtils.countMatches(value,"כ") * 20;
		sum += StringUtils.countMatches(value,"ל") * 30;
		sum += StringUtils.countMatches(value,"מ") * 40;
		sum += StringUtils.countMatches(value,"נ") * 50;
		sum += StringUtils.countMatches(value,"ס") * 60;
		sum += StringUtils.countMatches(value,"ע") * 70;
		sum += StringUtils.countMatches(value,"פ") * 80;
		sum += StringUtils.countMatches(value,"צ") * 90;
		sum += StringUtils.countMatches(value,"ק") * 100;
		sum += StringUtils.countMatches(value,"ר") * 200;
		sum += StringUtils.countMatches(value,"ש") * 300;
		sum += StringUtils.countMatches(value,"ת") * 400;
		
		sum += StringUtils.countMatches(value,"ם") * 40;
		sum += StringUtils.countMatches(value,"ץ") * 90;
		sum += StringUtils.countMatches(value,"ן") * 50;
		sum += StringUtils.countMatches(value,"ף") * 80;
		sum += StringUtils.countMatches(value,"ך") * 20;
		
		return sum;
	}

	private int caclulateSmallGematria(int gematria) {
		gematria = sumOfAllDigits(gematria);
		while (gematria > 9) {
			return caclulateSmallGematria(gematria);
		}
		return gematria;
	}

	private int sumOfAllDigits(int num) {
		int sum = 0;
		while (num > 0) {
			sum = sum + num % 10;
			num = num / 10;
		}
		return sum;
	}

	

}
