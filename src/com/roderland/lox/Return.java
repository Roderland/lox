package com.roderland.lox;

/**
 * @author Roderland
 * @since 1.0
 */
class Return extends RuntimeException {

    final Object value;

    Return(Object value) {
        super(null, null, false, false);
        this.value = value;
    }
}
