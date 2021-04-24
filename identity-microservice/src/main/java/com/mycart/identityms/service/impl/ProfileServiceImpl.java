package com.mycart.identityms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycart.identityms.domain.Profile;
import com.mycart.identityms.models.ProfileDetails;
import com.mycart.identityms.repository.ProfileRepository;
import com.mycart.identityms.service.ProfileService;

@Service
public class ProfileServiceImpl implements ProfileService {

	@Autowired
	ProfileRepository profileRepo;

	@Override
	public ProfileDetails getProfile(String mobile) {
		Profile profile = profileRepo.getOne(mobile);
		return ProfileDetails.builder().withAddress(profile.getAddress()).withMobile(profile.getMobile())
				.withName(profile.getName()).build();
	}

	@Override
	public ProfileDetails createProfile(ProfileDetails profileDetails) {
		Profile profile = new Profile();
		profile.setAddress(profileDetails.getAddress());
		profile.setMobile(profileDetails.getMobile());
		profile.setName(profileDetails.getName());
		profileRepo.save(profile);
		return profileDetails;
	}

}
