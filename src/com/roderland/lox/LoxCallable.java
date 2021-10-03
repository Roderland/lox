package com.roderland.lox;

import java.util.List;

/**
 * @author Roderland
 * @since 1.0
 */
interface LoxCallable {
    int arity();
    Object call(Interpreter interpreter, List<Object> arguments);
}
