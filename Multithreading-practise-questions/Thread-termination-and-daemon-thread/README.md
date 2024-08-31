Thread termination 
why?
1. Thread consume resources memory and kernel resources, and cpu cycle and cache memory
   when thread finished its work and application is still running then we want to clear the thread resources.
2. When thread misbehaving in that case also we want to terminate the thread.

Thread Termination in Java: Using interrupt() and Daemon Threads
In Java, thread termination can be managed using different approaches depending on whether you need to terminate the thread gracefully or forcefully.
 Two common mechanisms for handling thread termination are using the interrupt() method and daemon threads.

1. Thread Termination Using interrupt()
Motivation
In a multithreaded application, it’s often necessary to terminate a thread that’s running an infinite loop or a long-running task. However, forcefully stopping
 a thread using deprecated methods like Thread.stop() is unsafe and can leave shared resources in an inconsistent state. Instead, a more controlled way of terminating 
 a thread is by using the interrupt() method.

How interrupt() Works
Interrupting a Thread: 
When you call the interrupt() method on a thread, it sets the thread’s interrupt flag, signaling that the thread has been interrupted.
 However, this doesn't immediately stop the thread. The thread must be programmed to check the interrupt flag and terminate gracefully.

Handling Interruption:
 A thread can periodically check its interrupt status using Thread.interrupted() or isInterrupted() and handle the interruption by performing cleanup tasks and then exiting.

InterruptedException: 
If a thread is blocked on methods like sleep(), wait(), or join(), calling interrupt() will throw an InterruptedException. 
The thread can catch this exception and terminate or take appropriate action.

2. Daemon Threads
Motivation
In some scenarios, you might have background tasks that should only run as long as the main application is running. For example, background logging, monitoring, 
or cleanup tasks should not prevent the application from exiting. This is where daemon threads come into play.

What is a Daemon Thread?
Background Service: A daemon thread is a background thread that runs continuously and performs auxiliary tasks. The JVM does not wait for daemon threads to finish before exiting.
When all non-daemon threads in a Java application complete, the JVM terminates, and any remaining daemon threads are abruptly stopped.

Setting a Thread as Daemon: You can set a thread as a daemon by calling setDaemon(true) before the thread starts. Once set as a daemon, the thread will not prevent 
the JVM from exiting.