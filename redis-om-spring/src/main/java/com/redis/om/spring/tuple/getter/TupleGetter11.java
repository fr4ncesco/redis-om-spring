
package com.redis.om.spring.tuple.getter;

/**
 * Specialization of {@link TupleGetter} that always returns the 11st element.
 * <p>
 * Generated by com.speedment.sources.pattern.tuple.TupleGetterPattern
 *
 * @param <T>   the type of the tuple to get a value from
 * @param <T11> the type of the element to return
 *

 *
 */
@FunctionalInterface
public interface TupleGetter11<T, T11> extends TupleGetter<T, T11> {

    @Override
    default int index() {
        return 11;
    }
}