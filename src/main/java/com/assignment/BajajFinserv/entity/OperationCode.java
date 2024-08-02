package com.assignment.BajajFinserv.entity;

import lombok.Data;

@Data
public class OperationCode {
    private int operationCode;

    public OperationCode(int operationCode) {
        this.operationCode = operationCode;
    }

    // Getter
    public int getOperationCode() {
        return operationCode;
    }

    // Setter
    public void setOperationCode(int operationCode) {
        this.operationCode = operationCode;
    }
}

