package com.example.support.domain;

import com.example.support.model.RequestBodyDTO;

public interface OperationBase {
    OperationType getOperationType();


    // factory
    static OperationBase fromDTO(RequestBodyDTO bodyDTO) {
        String unsafeOperationType = bodyDTO.getOperationType();
        OperationType operationType = OperationType.fromString(unsafeOperationType);

        switch (operationType) {
            case NEW:
                return new NewOperation(operationType, bodyDTO.getAttr1(), bodyDTO.getAttr2());
            case UPDATE:
                return new UpdateOperation(operationType, bodyDTO.getAttr2(), bodyDTO.getAttr4(), bodyDTO.getAttr5());
            default:
                throw new UnsupportedOperationException();
        }
    }
}
