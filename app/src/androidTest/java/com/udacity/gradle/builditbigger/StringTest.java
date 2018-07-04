package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;

public class StringTest extends AndroidTestCase {
    public void test(){
        JokeEndpointTask task = new JokeEndpointTask();
        task.execute();
    }
}
