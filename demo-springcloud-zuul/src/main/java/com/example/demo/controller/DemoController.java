package com.example.demo.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
public class DemoController {

	@RequestMapping(value = "demo", method = RequestMethod.GET)
	public String demo() {
		String aaString = "{ \"accessToken\": \"be327fafc4be4a54a1d33557f13626e7\", \"appVersion\": \"1.0.0\", \"osType\": \"android\", \"serviceData\": \"{\\\"info\\\":\\\"W3siY29udGFjdG9yX25hbWUiOiIxMzM2MDA2NDU4MiIsInJlY2VpdmVfbW9iaWxlIjoiMTMzNjAwNjQ1ODIiLCJzZW5kX21vYmlsZSI6IjY2NjY2NjU1NTUiLCJzZW5kX3RpbWUiOiIyMDIwLTA2LTA0Iiwic21zX2NvbnRlbnQiOiLml6nnnaHml6notbfouqvkvZPlpb0iLCJ1c2VyX2lkIjozNX0seyJjb250YWN0b3JfbmFtZSI6IjEzNDg5MTc1Mjk2IiwicmVjZWl2ZV9tb2JpbGUiOiI2NjY2NjY1NTU1Iiwic2VuZF9tb2JpbGUiOiIxMzQ4OTE3NTI5NiIsInNlbmRfdGltZSI6IjIwMjAtMDYtMDQiLCJzbXNfY29udGVudCI6Iue6oue6oueBq+eBq+aZg+aZg+aCoOaCoCIsInVzZXJfaWQiOjM1fSx7ImNvbnRhY3Rvcl9uYW1lIjoiMTc2ODg1MzY4MTkiLCJyZWNlaXZlX21vYmlsZSI6IjE3Njg4NTM2ODE5Iiwic2VuZF9tb2JpbGUiOiI2NjY2NjY1NTU1Iiwic2VuZF90aW1lIjoiMjAyMC0wNi0wNCIsInNtc19jb250ZW50Ijoi5Zyo5bmy5ZibIiwidXNlcl9pZCI6MzV9LHsiY29udGFjdG9yX25hbWUiOiIxNzY4ODUzNjgxOCIsInJlY2VpdmVfbW9iaWxlIjoiNjY2NjY2NTU1NSIsInNlbmRfbW9iaWxlIjoiMTc2ODg1MzY4MTgiLCJzZW5kX3RpbWUiOiIyMDIwLTA2LTA0Iiwic21zX2NvbnRlbnQiOiLlk4jlk4jlk4giLCJ1c2VyX2lkIjozNX0seyJjb250YWN0b3JfbmFtZSI6IjE3NzIyNDMzODQ0IiwicmVjZWl2ZV9tb2JpbGUiOiIxNzcyMjQzMzg0NCIsInNlbmRfbW9iaWxlIjoiNjY2NjY2NTU1NSIsInNlbmRfdGltZSI6IjIwMjAtMDYtMDQiLCJzbXNfY29udGVudCI6IuWTiOWTiOWTiCIsInVzZXJfaWQiOjM1fV0u003d\\\"}\", \"sign\": \"B6FBF12A3D10862392916091A723A8FC\", \"timeStamp\": \"1591253355289\" }";
		return aaString;
	}

	@ApiOperation(value = "", notes = "")
	@RequestMapping(value = "", method = RequestMethod.GET)
	public void index(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.sendRedirect(request.getContextPath() + "/swagger-ui.html");
	}

}
