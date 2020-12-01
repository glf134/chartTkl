package cn.tkl.dockTkl.service;

import cn.tkl.dockTkl.pojo.User;

import java.util.List;
import java.util.Set;


/**
 * 用户管理
 * @author Louis
 * @date Jun 29, 2019
 */
public interface UserService {

	/**
	 * 根据用户名查找用户
	 * @param username
	 * @return
	 */
	User findByUsername(String username);

	/**
	 * 查找用户的菜单权限标识集合
	 * @param username
	 * @return
	 */
	Set<String> findPermissions(String username);

	/**
	 *
	 * @param id
	 * @return
	 */
	User queryById(Long id);

	/**
	 *
	 * @param id
	 */
	void deleteById(Long id);
	/**
	 *
	 * @param id
	 */
	List<User> queryAll();
}
