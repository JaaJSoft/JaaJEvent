package dev.jaaj.event;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EventInvokerTest {
    private final static String test = "aaaa";
    private final EventInvoker<TestEvent> testEventEventInvoker = new EventInvoker<>();
    private String out;

    @Before
    public void setUp() throws Exception {
        testEventEventInvoker.addListener(event -> out = event.getSource());
    }

    @Test
    public void test() {
        testEventEventInvoker.invoke(new TestEvent(test));
        assertEquals(test, out);
    }
}
