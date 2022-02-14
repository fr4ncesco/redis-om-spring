
package com.redis.om.spring.tuple.getter;

/**
 * Specialization of {@link TupleGetter} that always returns the 19th element.
 * <p>
 * Generated by com.speedment.sources.pattern.tuple.TupleGetterPattern
 *
 * @param <T>   the type of the tuple to get a value from
 * @param <T19> the type of the element to return
 *

 *
 */
@FunctionalInterface
public interface TupleGetter19<T, T19> extends TupleGetter<T, T19> {

    @Override
    default int index() {
        return 19;
    }
}