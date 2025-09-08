package com.example.profiles;

import java.util.Objects;

/**
 * Assembles profiles with scattered, inconsistent validation.
 */
public class ProfileService {

    public UserProfile createMinimal(String id, String email) {
        return UserProfile.builder(id, email).build();
    }

    public UserProfile updateDisplayName(UserProfile p, String displayName) {
        return UserProfile.builder(p.getId(), p.getEmail())
                .phone(p.getPhone())
                .displayName(displayName)
                .address(p.getAddress())
                .marketingOptIn(p.isMarketingOptIn())
                .twitter(p.getTwitter())
                .github(p.getGithub())
                .build();
    }
}
