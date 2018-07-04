package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.os.AsyncTask;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.InstrumentationTestCase;
import android.util.Log;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;

@RunWith(AndroidJUnit4.class)
public class StringTest extends InstrumentationTestCase {

    Context context;

    @Test
    public void test() throws InterruptedException {
        assertTrue(true);
        final CountDownLatch latch = new CountDownLatch(1);
        context = InstrumentationRegistry.getContext();
        AsyncTask<Context, Void, String> testTask = new JokeEndpointTask() {
            @Override
            protected void onPostExecute(String result) {
                Log.e("TEST", result);
                assertNotNull(result);
                assertTrue(result.length() > 0);
                latch.countDown();
            }
        };
        testTask.execute(context);
        latch.await();
    }
}
