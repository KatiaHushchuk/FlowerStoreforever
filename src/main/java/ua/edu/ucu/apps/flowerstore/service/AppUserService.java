package ua.edu.ucu.apps.flowerstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.edu.ucu.apps.flowerstore.model.AppUser;
import ua.edu.ucu.apps.flowerstore.repository.AppUserRepository;

@Service
public class AppUserService {

    private AppUserRepository appUserRepository;

    @Autowired
    public AppUserService(AppUserRepository userRepository) {
        this.appUserRepository = userRepository;
    }
    
    public List<AppUser> getUsers() {
        return appUserRepository.findAll();
    }

    public AppUser creatUser(AppUser user) {
        return appUserRepository.save(user);
    }

    public AppUser getUserByEmail(String email) {
        return appUserRepository.findUserByEmail(email);
    }
}
