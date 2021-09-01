package com.example.support.domain;

import java.util.Objects;

public class UpdateOperation implements OperationBase {
    private final OperationType operationType;
    private final String attr2;
    private final String attr4;
    private final String attr5;

    public UpdateOperation(
            OperationType operationType,
            String attr2,
            String attr4,
            String attr5
    ) {
        this.operationType = Objects.requireNonNull(operationType, "operationType can not be null in UpdateOperation");
        this.attr2 = Objects.requireNonNull(attr2, "attr2 can not be null in UpdateOperation");
        this.attr4 = Objects.requireNonNull(attr4, "attr4 can not be null in UpdateOperation");
        this.attr5 = Objects.requireNonNull(attr5, "attr5 can not be null in UpdateOperation");
    }

    @Override
    public OperationType getOperationType() {
        return null;
    }
}
