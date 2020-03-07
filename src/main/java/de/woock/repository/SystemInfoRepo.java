package de.woock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.woock.entity.SystemInfo;

@Repository
public interface SystemInfoRepo extends JpaRepository<SystemInfo, Long> {

}
