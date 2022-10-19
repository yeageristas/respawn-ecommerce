package com.respawn;

import com.respawn.entities.GenericModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface GenericRepository <E extends GenericModel> extends JpaRepository<E, Long> {
}