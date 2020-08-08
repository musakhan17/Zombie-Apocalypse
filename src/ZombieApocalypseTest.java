import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ZombieApocalypseTest {
	ZombieApocalypse zombie;

	@Before
    public void setUp() throws Exception {
        zombie = new ZombieApocalypse();
    }
	
	@Test
	public void addTest() {
        assertEquals(true, zombie.addZombie("Crawler", "Cant Run"));
        assertEquals(true, zombie.addZombie("Ninja", "Moves slow"));
    }
	
	@Test
    public void removeTest() {
		assertEquals(true, zombie.addZombie("Crawler", "Can't Run"));
        assertEquals(false, zombie.addZombie("Crawler", "Can't Run"));
        zombie.removeZombie("Crawler");
        assertEquals(true, zombie.addZombie("Crawler", "Can't Run"));
    }
	
	@Test
	public void getTest() {
		assertEquals(true, zombie.addZombie("Crawler", "Can't Run"));
        assertEquals(true, zombie.addZombie("Ninja", "Moves slow"));
        assertEquals("Moves slow", zombie.getZombie("Ninja"));
        assertEquals("Can't Run", zombie.getZombie("Crawler"));
	}
}
