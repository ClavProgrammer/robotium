package com.vogella.android.test.robotuim.testys.test;

import android.test.ActivityInstrumentationTestCase2;

import com.vogella.android.test.robotuim.testys.MainActivity;

public class SimpleActivityTest extends ActivityInstrumentationTestCase2 {

    public SimpleActivityTest() {
        super(MainActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
