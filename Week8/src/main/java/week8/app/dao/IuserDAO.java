package week8.app.dao;

import java.util.List;

import week8.app.exception.UserNotFoundException;
import week8.app.model.User;

public interface IuserDAO {

	public Boolean saveUserdb(User u);

	public List<User> getAllUsersdb();

	public Boolean updateUserdb(User u);

	public Boolean deleteUserdb(User u) throws UserNotFoundException;

}
