package coaching.jdbc;

import static org.junit.Assert.assertNotNull;

import org.junit.Ignore;
import org.junit.Test;

@Ignore("Requires Oracle DB availability")
public class OracleDaoTest {

	@Test
	public void testOracleDao() {
		DaoInterface dao = new OracleDao();
		assertNotNull(dao);
	}

	@Test
	public void testCreate() {
		final OracleDao oracleDao = new OracleDao();
		assertNotNull(oracleDao);
		oracleDao.create();
	}

	@Test
	public void testRead() {
		final OracleDao oracleDao = new OracleDao();
		assertNotNull(oracleDao);
		oracleDao.read();
	}

	@Test
	public void testUpdate() {
		final OracleDao oracleDao = new OracleDao();
		assertNotNull(oracleDao);
		oracleDao.update();
	}

	@Test
	public void testDelete() {
		final OracleDao oracleDao = new OracleDao();
		assertNotNull(oracleDao);
		oracleDao.delete();
	}

}
