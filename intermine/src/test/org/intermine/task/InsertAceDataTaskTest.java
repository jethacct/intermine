package org.flymine.task;

import junit.framework.TestCase;

import org.apache.tools.ant.BuildException;

public class InsertAceDataTaskTest extends TestCase
{
    public InsertAceDataTaskTest(String arg) {
        super(arg);
    }

    private InsertAceDataTask task;

    public void setUp() {
        task = new InsertAceDataTask();
        task.setObjectStore("os.test");
        task.setUser("user");
        task.setPassword("secret");
        task.setHost("host");
        task.setPort(23100);
    }

    public void testNoStore() {
        task.setObjectStore(null);
        try {
            task.execute();
            fail("Expected: BuildException");
        } catch (BuildException e) {
        }
    }


    public void testNoUser() {
        task.setUser(null);
        try {
            task.execute();
            fail("Expected: BuildException");
        } catch (BuildException e) {
        }
    }

    public void testNoPassword() {
        task.setPassword(null);
        try {
            task.execute();
            fail("Expected: BuildException");
        } catch (BuildException e) {
        }
    }

    public void testNoHost() {
        task.setHost(null);
        try {
            task.execute();
            fail("Expected: BuildException");
        } catch (BuildException e) {
        }
    }

    public void testNoPort() {
        task.setPort(0);
        try {
            task.execute();
            fail("Expected: BuildException");
        } catch (BuildException e) {
        }
    }

}
