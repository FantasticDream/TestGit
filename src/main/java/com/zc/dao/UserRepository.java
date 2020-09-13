package com.zc.dao;

import com.zc.entity.User;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/*
 *   @创建人  zc
 *   @创建时间 2020/9/13 2:14
 *   @包名: com.zc.dao
 *   @描述：
 */
@EntityScan("com.zc.entity")
public interface UserRepository extends JpaSpecificationExecutor<User>, CrudRepository<User,Long> {
    List<User> findByName(String name);
}
