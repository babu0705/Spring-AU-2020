package mockito;

import org.junit.Test;

import com.practice.models.Employee;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import dao.EmployeeDao;

public class mock {
	@Test
	public void testusing_Mocks() throws ClassNotFoundException, NoSuchFieldException, SecurityException
	{
		EmployeeDao employeeDAO=mock(EmployeeDao.class);
		Employee  employee=new Employee();
		employee.setEmail("babuvignesh@gmail.com");
		employee.setId(2);
		employee.setFname("BABU");
		employee.setLname("VIGNESH");
		employee.setPhone("7598214070");
		when(employeeDAO.getById(1)).thenReturn(employee);
		System.out.println(employeeDAO.getById(1).getEmail());
		assertEquals("babuvnesh@gmail.com",employeeDAO.getById(1).getEmail());
	}

}

