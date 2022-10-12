package com.employee.data.dto.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;


import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EmployeeUpdate {
	@NotBlank
	String name;

	@NotBlank
	String surname;

	@Email
	String email;

}
