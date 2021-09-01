package com.example.support.domain;

import java.util.Objects;

public class NewOperation implements OperationBase{
    private final OperationType operationType;
    private final String attr1;
    private final String attr2;

    public NewOperation(
            OperationType operationType,
            String unsafeAttr1,
            String unsafeAttr2
    ) {
        this.operationType = Objects.requireNonNull(operationType, "operationType can not be null in NewOperation");
        this.attr1 = Objects.requireNonNull(unsafeAttr1, "unsafeAttr1 can not be null in NewOperation");
        this.attr2 = Objects.requireNonNull(unsafeAttr2, "unsafeAttr2 can not be null in NewOperation");
    }

    @Override
    public OperationType getOperationType() {
        return operationType;
    }
}
