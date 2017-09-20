package com.jason.account.web;

import junit.framework.Assert;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Created by MengDexin.
 * Date : 17/9/20.
 * Time : 13:19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath*:config/spring/common/appcontext-*.xml",
        "classpath*:config/spring/local/appcontext-*.xml" })
@Ignore
public abstract class AbstractTest {

    public void notNull(Object obj) {
        assertNotNull(obj);
    }

    public void isNull(Object obj) {
        assertNull(obj);
    }

    public void equal(Object expected, Object actual) {
        Assert.assertEquals(expected, actual);
    }

}