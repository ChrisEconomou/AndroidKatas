package com.greenlifesoftware.simple1;

import com.greenlifesoftware.support.RobolectricGradleTestRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;

import static org.junit.Assert.assertNotNull;

@RunWith(RobolectricGradleTestRunner.class)

public class WelcomeActivityTest
{
    @Test
    public void shouldNotBeNull() throws Exception
    {
        WelcomeActivity activity = Robolectric.buildActivity( WelcomeActivity.class )
                                              .create()
                                              .resume()
                                              .get();
        assertNotNull( activity );
    }
}
