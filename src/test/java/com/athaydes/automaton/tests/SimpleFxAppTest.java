package com.athaydes.automaton.tests;

import com.athaydes.automaton.FXApp;
import com.athaydes.automaton.cli.AutomatonScriptRunner;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class SimpleFxAppTest {


    static class Writer {
        List<String> strings = new ArrayList<>();

        public void write( String s ) {
            strings.add( s );
        }
    }

    @Before
    public void setup() {
        FXApp.startApp( new SimpleFxApp() );
    }

    @Test
    public void runScript() {
        Writer writer = new Writer();
        AutomatonScriptRunner.getInstance().run( "src/test/groovy/", writer );

        System.out.println("Writer: " + writer.strings);

    }

}
