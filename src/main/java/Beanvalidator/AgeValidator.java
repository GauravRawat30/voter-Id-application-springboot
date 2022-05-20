package Beanvalidator;

import java.time.LocalDate;
import java.time.Period;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Validator, String> {

	@Override
	public void initialize(Validator constraintAnnotation) {
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {

		LocalDate birthDate = LocalDate.parse(value);

		LocalDate curDate = LocalDate.of(2022, 01, 01);
		int age = Period.between(birthDate, curDate).getYears();
		System.out.println("age :" + age);
		return age >= 18;

	}

}
