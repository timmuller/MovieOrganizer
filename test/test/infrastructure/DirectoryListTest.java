package test.infrastructure;

import test.JUnitWrapper;
import Infrastructure.DirectoryList;

public class DirectoryListTest extends JUnitWrapper{

	private DirectoryList directoryList;
	
	public void setUp(){
		directoryList = new DirectoryList();
	}
	
	public void testCreateObjectTest() {
		assertNotNull(new DirectoryList());
	}
	
	public void testAddPath(){
		assertTrue(directoryList.addPath("C:/"));
	}
	
	public void testAddDuplicatedPath(){
		String path = "C:";
		assertTrue(directoryList.addPath(path));
		assertFalse(directoryList.addPath(path));
	}
	
	public void testAddEmptyPath(){
		String path = "";
		assertFalse(directoryList.addPath(path));
	}
	
	public void testAddNullPath(){
		assertFalse(directoryList.addPath(null));
	}
	
	
	
}
