package com.example.bookmanagementproject.persistance.repository;

import com.example.bookmanagementproject.persistance.entity.Setting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SettingRepository extends JpaRepository<Setting, Long> {
    Setting findByName(String settingName);

}
