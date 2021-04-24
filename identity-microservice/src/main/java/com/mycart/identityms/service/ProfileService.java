package com.mycart.identityms.service;

import com.mycart.identityms.models.ProfileDetails;

public interface ProfileService {

	public ProfileDetails getProfile(String mobile);

	public ProfileDetails createProfile(ProfileDetails profile);

}
