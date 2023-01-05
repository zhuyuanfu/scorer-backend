package cn.edu.njfu.zyf.dao;

import org.springframework.data.repository.CrudRepository;

import cn.edu.njfu.zyf.model.User;
 
public interface UserRepository extends CrudRepository<User, Long>{
 
}
