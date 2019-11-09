package ru.spbstu.pipeline;

/**
 * Represents executor working on a pipeline.
 * <p>
 * Should have ctor with params:
 * String confPath (path to executor config file)
 * ru.spbstu.pipeline.logging.Logger logger
 * </p>
 */
public interface Executor extends Producer, Consumer, RunnableWithStatus {
}

interface Producer {

    void addConsumer(Runnable consumer);

    byte[] get();
}

interface Consumer {

    void addProducer(Executor producer);
}

interface RunnableWithStatus extends Runnable {

    Status status();
}