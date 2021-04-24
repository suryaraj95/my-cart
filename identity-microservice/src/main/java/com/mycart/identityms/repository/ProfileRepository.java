package com.mycart.identityms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycart.identityms.domain.Profile;

public interface ProfileRepository extends JpaRepository<Profile, String> {

}
