package io.gateways.userservice.repository;

import io.gateways.userservice.model.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole,Long> {

    AppRole findByName(String name);
}
