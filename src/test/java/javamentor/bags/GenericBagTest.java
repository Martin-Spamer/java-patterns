package javamentor.bags;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javamentor.bags.GenericBag;

public class GenericBagTest {

	private static final Logger LOG = LoggerFactory.getLogger(GenericBagTest.class);
	private static final String[] VALUES = { "Heads", "Tails" };

	@Test
	public void testGenericBag() {
		final GenericBag<String> genericBag = new GenericBag<String>();
		assertNotNull(genericBag);
		LOG.debug("genericBag = {}", genericBag);
	}

	@Test
	public void testGenericBagNull() {
		final GenericBag<String> genericBag = new GenericBag<String>(null);
		assertNotNull(genericBag);
		LOG.debug("genericBag = {}", genericBag);
	}

	@Test
	public void testGenericBagStringArray() {
		final GenericBag<String> genericBag = new GenericBag<String>(VALUES);
		assertNotNull(genericBag);
		LOG.debug("genericBag = {}", genericBag);
	}

	@Test
	public void testGenericBagVargs() {
		final GenericBag<String> genericBag = new GenericBag<String>("Heads", "Tails");
		assertNotNull(genericBag);
		LOG.debug("genericBag = {}", genericBag);
	}

	@Test
	public void testGenericBagTArray() {
		final GenericBag<Boolean> genericBag = new GenericBag<Boolean>(true, false);
		assertNotNull(genericBag);
		LOG.debug("genericBag = {}", genericBag);
	}

	@Test
	public void testFillVargs() {
		final GenericBag<String> genericBag = new GenericBag<String>();
		assertNotNull(genericBag);
		genericBag.fill("Heads", "Tails");
		LOG.debug("genericBag = {}", genericBag);
	}

	@Test
	public void testFillNull() {
		final GenericBag<String> genericBag = new GenericBag<String>();
		assertNotNull(genericBag);
		genericBag.fill(null);
		LOG.debug("genericBag = {}", genericBag);
	}

	@Test
	public void testFillStringArray() {
		final GenericBag<String> genericBag = new GenericBag<String>();
		assertNotNull(genericBag);
		genericBag.fill(VALUES);
		LOG.debug("genericBag = {}", genericBag);
	}

	@Test
	public void testPick() {
		final GenericBag<String> genericBag = new GenericBag<String>("Heads", "Tails");
		assertNotNull(genericBag);
		LOG.debug("genericBag = {}", genericBag.pick());
	}

	@Test
	public void testChoose() {
		final GenericBag<String> genericBag = new GenericBag<String>("Heads", "Tails");
		assertNotNull(genericBag);
		LOG.debug("genericBag = {}", genericBag.choose());
	}

	@Test
	public void testAddT() {
		final GenericBag<String> genericBag = new GenericBag<String>("Heads", "Tails");
		assertNotNull(genericBag);
		genericBag.add("Edge");
		LOG.debug("genericBag = {}", genericBag.choose());
		LOG.debug("genericBag = {}", genericBag.choose());
		LOG.debug("genericBag = {}", genericBag.choose());
		LOG.debug("genericBag = {}", genericBag.choose());
	}

	@Test
	public void testReset() {
		final GenericBag<String> genericBag = new GenericBag<String>("Heads", "Tails");
		assertNotNull(genericBag);
		LOG.debug("genericBag = {}", genericBag);
		LOG.debug("genericBag = {}", genericBag.choose());
		LOG.debug("genericBag = {}", genericBag.choose());
		genericBag.reset();
		LOG.debug("genericBag = {}", genericBag);
		LOG.debug("genericBag = {}", genericBag.choose());
		LOG.debug("genericBag = {}", genericBag.choose());
	}

}
