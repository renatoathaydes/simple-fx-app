package com.athaydes.automaton.tests;

import com.athaydes.automaton.FXApp;
import com.athaydes.automaton.tests.fxml.FXMLFxApp;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static com.athaydes.automaton.tests.SimpleFxAppTest.runScript;

/**
 *
 */
public class FXMLFxAppTest {

    @BeforeClass
    public static void setup() {
        FXApp.startApp(new FXMLFxApp());
    }

    @Test
    public void firstTest() {
        runScript("src/test/groovy/firstAScript.groovy");
    }

    @Test
    public void secondTest() {
        runScript("src/test/groovy/secondAScript.groovy");
    }


}
