
package com.redis.om.spring.tuple.getter;

/**
 * Specialization of {@link TupleGetter} that always returns the 8th element.
 * <p>
 * Generated by com.speedment.sources.pattern.tuple.TupleGetterPattern
 *
 * @param <T>  the type of the tuple to get a value from
 * @param <T8> the type of the element to return
 *

 *
 */
@FunctionalInterface
public interface TupleGetter8<T, T8> extends TupleGetter<T, T8> {

    @Override
    default int index() {
        return 8;
    }
}