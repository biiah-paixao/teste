package com.fcamara.technicalshare.technicalshare.profile.repository;

import com.fcamara.technicalshare.technicalshare.profile.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Integer> {

    Profile findProfileByEmail(String email);
}