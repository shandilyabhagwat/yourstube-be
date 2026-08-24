package com.yourstube.yourstube_be.repo;

import com.yourstube.yourstube_be.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserEntity, Long> {
}
