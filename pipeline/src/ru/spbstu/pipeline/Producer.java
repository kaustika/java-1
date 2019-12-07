package ru.spbstu.pipeline;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface Producer {

    @NotNull byte[] get();
}

interface InitializableProducer {

    void addConsumer(@NotNull Consumer consumer);
    void addConsumers(@NotNull List<Consumer> consumers);
}
