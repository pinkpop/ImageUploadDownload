package com.tang.awsimageupload.profile;

import com.tang.awsimageupload.datastore.FakeUserProfileDataStore;
import org.apache.http.entity.ContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import static org.apache.http.entity.ContentType.*;

@Repository
public class UserProfileDataAccessService {


    private final FakeUserProfileDataStore fakeUserProfileDataStore;

    @Autowired
    public UserProfileDataAccessService(FakeUserProfileDataStore fakeUserProfileDataStore){
        this.fakeUserProfileDataStore = fakeUserProfileDataStore;
    }

    public List<UserProfile> getUserProfiles() {

        return fakeUserProfileDataStore.getUserProfiles();
    }

}

