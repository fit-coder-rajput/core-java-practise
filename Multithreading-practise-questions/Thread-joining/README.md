Understanding Thread.join() in Java
The join() method in Java is a thread synchronization mechanism that allows one thread to wait for the completion of another thread.
 This method is particularly useful when you need to ensure that a thread has completed its execution before continuing with the execution of another thread.

Motivation
In a multithreaded application, there are often situations where one thread depends on the result of another thread’s execution. 
For example, consider a scenario where you start multiple threads to perform parallel tasks, but you need to aggregate their results 
or perform a final action only after all the threads have finished. In such cases, you can use the join() method to make one thread 
wait for the completion of another.

How Thread.join() Works
When you call join() on a thread:

The current thread (the one that calls join()) will pause its execution until the thread on which join() was called has finished executing.
If the target thread is already finished when join() is called, the method returns immediately.
You can also specify a timeout for the join() method, making the current thread wait for a specified amount of time.