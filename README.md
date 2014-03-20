Patterns
========

Sample code for design patterns

## Chain of responsibility

### Category

**Behavioral pattern**

### Intent

"Avoid coupling the sender of a request of its receiver by giving more than one object a chance to handle the request" (GoF)

### Motivation

"The idea of this pattern is to decouple senders and receivers by giving multiple objects a chance to handle a request" (GoF).
Receivers must handle the object or forward it to the next receiver. The object that created the request has no knowledge
of who will handle it.

### Applicability

Use a Chain of responsibility when

* more than one object may handle a request
* you want to issue request to one of several objects without specifying the receiver explicitly
* the set of objects that can handle a request should be specified dynamically

### Structure

You need

* a client
* an abstract handler: defines the interface and is called by the client
* concrete handlers: handles request whereas each knows if it is responsible for the request

### Consequences

1 Reduced coupling
1 Added flexibility in assigning responsibilities for objects
1 Receipt isn't guaranteed