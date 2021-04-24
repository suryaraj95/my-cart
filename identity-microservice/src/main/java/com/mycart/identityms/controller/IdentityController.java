package com.mycart.identityms.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycart.identityms.models.ProfileDetails;
import com.mycart.identityms.service.ProfileService;

@RestController
@RequestMapping("/identity")
public class IdentityController {

	@Autowired
	ProfileService profileService;

	@GetMapping("getprofile/{mobile}")
	public ProfileDetails getProfile(@PathVariable(value = "mobile") String mobile) {
		return profileService.getProfile(mobile);
	}

	@PostMapping(path = "/createprofile", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ProfileDetails createProfile(@RequestBody ProfileDetails profile) {
		ProfileDetails profileDetails = profileService.createProfile(profile);
		return profileDetails;
	}

}
