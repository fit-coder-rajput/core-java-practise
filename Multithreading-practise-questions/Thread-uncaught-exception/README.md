1. ThreadUncaughtExceptionHandler

when thread throw exception which is not handled anywhere , in that case we can set an
uncaught exception handler method to handle the exception where we can do all the cleanup that required when exception happened.



2. ThreadPriority
Thread Priority is a mechanism used in operating systems to determine the relative importance of different threads running on a system.
 It helps the operating system allocate CPU time more efficiently, ensuring that critical threads are executed before less important ones.

#Higher Priority Threads:
Receive more CPU time: They are more likely to be scheduled for execution sooner.
Often used for time-sensitive tasks: Like real-time audio or video processing, where delays can be detrimental.

#Lower Priority Threads:
Receive less CPU time: They are less likely to be scheduled for execution.
Often used for background tasks: Like indexing files or checking for updates.

#Priority Levels:
Most operating systems have multiple priority levels: From very high to very low.
The exact number of levels varies: Depending on the specific operating system.

#Factors Affecting Thread Priority:
Thread creation: Threads can be created with a specified priority level.
Dynamic priority adjustment: Some operating systems allow the priority of a thread to be changed dynamically based on its behavior.
Real-time systems: These systems often have a more complex priority scheme to ensure that time-critical tasks are always executed on time.

In summary, thread priority is a crucial concept in operating systems that helps manage the execution of multiple threads efficiently. 
By assigning appropriate priorities to threads, the system can ensure that critical tasks are executed promptly while also allowing for less 
important tasks to be performed in the background.