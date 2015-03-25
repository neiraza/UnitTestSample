package com.example.togu.unittestsample;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertTrue;

/**
 * Created by togu on 15/03/25.
 */
@RunWith(AndroidJUnit4.class)
public class IntegerTest {
    Integer sut;

    @Before
    public void setUp() throws Exception {
        sut = new Integer(1);
    }

    @Test
    public void 値は1である() throws Exception {
        assertThat(sut, is(1));
    }

    @Test
    public void 値は2である() throws Exception {
        assertThat(sut, is(4));
    }
}
