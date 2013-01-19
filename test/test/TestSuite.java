package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import test.infrastructure.DirectoryListTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ 
	DirectoryListTest.class
})

public class TestSuite {

}
