package coaching.jdbc;

import static org.junit.Assert.assertNotNull;

import org.junit.Ignore;
import org.junit.Test;

@Ignore("Requires MySQL DB availability")
public class MySqlDaoTest {

	@Test
	public void testMySqlDao() {
		final MySqlDao mySqlDao = new MySqlDao();
		assertNotNull(mySqlDao);
	}

	@Test
	public void testCreate() {
		final MySqlDao mySqlDao = new MySqlDao();
		assertNotNull(mySqlDao);
		mySqlDao.create();
	}

	@Test
	public void testRead() {
		final MySqlDao mySqlDao = new MySqlDao();
		assertNotNull(mySqlDao);
		mySqlDao.read();
	}

	@Test
	public void testUpdate() {
		final MySqlDao mySqlDao = new MySqlDao();
		assertNotNull(mySqlDao);
		mySqlDao.update();
	}

	@Test
	public void testDelete() {
		final MySqlDao mySqlDao = new MySqlDao();
		assertNotNull(mySqlDao);
		mySqlDao.delete();
	}

}
