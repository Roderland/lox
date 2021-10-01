package com.roderland.lox;

/**
 * @author Roderland
 * @since 1.0
 */
class RuntimeError extends RuntimeException {
    final Token token;

    RuntimeError(Token token, String message) {
        super(message);
        this.token = token;
    }
}
