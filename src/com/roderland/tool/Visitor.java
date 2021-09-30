package com.roderland.tool;

/**
 * @author Roderland
 * @since 1.0
 *
 * The Visitor pattern
 */
public class Visitor {
    abstract class Pastry {
        abstract void accept(PastryVisitor visitor);
    }

    class Beignet extends Pastry {
        @Override
        void accept(PastryVisitor visitor) {
            visitor.visitBeignet(this);
        }
    }

    class Cruller extends Pastry {
        @Override
        void accept(PastryVisitor visitor) {
            visitor.visitCruller(this);
        }
    }

    interface PastryVisitor {
        void visitBeignet(Beignet beignet);
        void visitCruller(Cruller cruller);
    }
}
