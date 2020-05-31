package week8.app.contracts;

import java.util.List;

import week8.app.exception.NametooShortException;
import week8.app.model.User;

public interface IUserService {


	public List<User> getAllUsers();

	public Boolean DeleteUser(User u);

	public Boolean Insertuser(User u) throws NametooShortException;

	public Boolean UpdateUser(User u);

	

}
