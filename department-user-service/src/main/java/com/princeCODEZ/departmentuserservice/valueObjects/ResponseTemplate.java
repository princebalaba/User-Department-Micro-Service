package com.princeCODEZ.departmentuserservice.valueObjects;

import com.princeCODEZ.departmentuserservice.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplate {
	
	private User user;
	private Department department;

}
