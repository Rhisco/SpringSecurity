package com.rhisco.springsecurity.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.rhisco.springsecurity.model.User;

@Repository("userDao")
public class UserDaoImpl extends AbstractDao<Integer, User> implements UserDao 
{
	@Override
	public void save(User user) {
		persist(user);
	}
	
	@Override
	public User findByIdUser(int id) {
		return getByKey(id);
	}
	
	@Override
	public User findByUsername(String id) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("username", id));
		return (User) crit.uniqueResult();
	}

}
