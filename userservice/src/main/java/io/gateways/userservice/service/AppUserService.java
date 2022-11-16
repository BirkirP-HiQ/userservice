package io.gateways.userservice.service;

import io.gateways.userservice.model.AppRole;
import io.gateways.userservice.model.AppUser;

import java.util.List;

public interface AppUserService {
    AppUser saveAppUser(AppUser appUser);
    AppRole saveAppRole(AppRole appRole);
    void addRoleToUser(String username, String roleName);
    AppUser getUser(String username);
    List<AppUser> getUsers();

}
