package com.dsp.springevent.event;

import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * 
Starting with Spring 4.2, an event listener is not required to be a 
bean implementing the ApplicationListener interface – it
 can be registered on any public method of a managed 
 bean via the @EventListener annotation
 *
 */

@Component
public class AnnotationDrivenContextStartedListener {
    @Async
    @EventListener
    public void handleContextStart(ContextStartedEvent cse) {
        System.out.println("Handling context started event.");
    }
}
