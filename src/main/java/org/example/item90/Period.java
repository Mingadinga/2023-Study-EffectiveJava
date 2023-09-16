package org.example.item90;

import java.util.*;
import java.io.*;

public final class Period implements Serializable {
    private final Date start;
    private final Date end;

    public Period(Date start, Date end) {
        this.start = new Date(start.getTime());
        this.end   = new Date(end.getTime());
        if (this.start.compareTo(this.end) > 0)
            throw new IllegalArgumentException(
                    start + " after " + end);
    }

    public Date start () { return new Date(start.getTime()); }

    public Date end () { return new Date(end.getTime()); }

    public String toString() { return start + " - " + end; }


    // Serialization proxy for Period class
    private static class SerializationProxy implements Serializable {
        private final Date start;
        private final Date end;

        SerializationProxy(Period p) {
            this.start = p.start;
            this.end = p.end;
        }

        private Object readResolve() {
            return new Period(start, end);
        }

        private static final long serialVersionUID =
                234098243823485285L; // Any number will do (Item 87)
    }

    // writeReplace method for the serialization proxy pattern
    private Object writeReplace() {
        return new SerializationProxy(this);
    }

    // readObject method for the serialization proxy pattern
    private void readObject(ObjectInputStream stream)
            throws InvalidObjectException {
        throw new InvalidObjectException("Proxy required");
    }
}
