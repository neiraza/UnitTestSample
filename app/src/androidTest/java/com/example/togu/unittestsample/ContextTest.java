package com.example.togu.unittestsample;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by togu on 15/03/25.
 */
@RunWith(AndroidJUnit4.class)
public class ContextTest {

    Integer sut;
    private Context mContext;

    @Before
    public void setUp() throws Exception {
        sut = new Integer(1);
        mContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
    }

    @Test
    public void 値は1である() throws Exception {
        assertThat(sut, is(1));
    }

    @Test
    public void Contextを使ったテスト() {
        assertThat(mContext.getString(R.string.app_name), is("AndroidTestSample"));
    }
}
