package com.princeCODEZ.departmentuserservice.valueObjects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
	private String departmentId;
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;
	

}
