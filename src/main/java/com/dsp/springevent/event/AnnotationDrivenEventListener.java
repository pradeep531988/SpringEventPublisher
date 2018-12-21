package com.dsp.springevent.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;


/**
 * 
 * 
his paragraph is about using the @TransactionalEventListener annotation. To learn more about transaction management check out the Transactions with Spring and JPA tutorial.

Since Spring 4.2, the framework provides a new @TransactionalEventListener annotation, which is an extension of @EventListener, that allows binding the listener of an event to a phase of the transaction. Binding is possible to the following transaction phases:

AFTER_COMMIT (default) is used to fire the event if the transaction has completed successfully
AFTER_ROLLBACK – if the transaction has rolled back
AFTER_COMPLETION – if the transaction has completed (an alias for AFTER_COMMIT and AFTER_ROLLBACK)
BEFORE_COMMIT is used to fire the event right before transaction commit
Here’s a quick example of transactional event listener:

1
2
3
4
@TransactionalEventListener(phase = TransactionPhase.BEFORE_COMMIT)
public void handleCustom(CustomSpringEvent event) {
    System.out.println("Handling event inside a transaction BEFORE COMMIT.");
}
 *
 */
@Component
public class AnnotationDrivenEventListener {
    @EventListener(condition = "#event.success")
    public void handleSuccessful(GenericSpringEvent<String> event) {
        System.out.println("Handling generic event (conditional).");
    }
}