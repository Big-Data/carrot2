package org.carrot2.util.attribute;

import org.apache.commons.lang.ObjectUtils;

/**
 * An immutable pair of objects.
 */
final class Pair<I, J>
{
    public final I objectA;
    public final J objectB;

    public Pair(I clazz, J parameter)
    {
        this.objectA = clazz;
        this.objectB = parameter;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (!(obj instanceof Pair))
        {
            return false;
        }

        final Pair<?, ?> other = (Pair<?, ?>) obj;

        return ObjectUtils.equals(other.objectA, objectA)
            && ObjectUtils.equals(other.objectB, objectB);
    }

    @Override
    public int hashCode()
    {
        return ObjectUtils.hashCode(objectA) ^ ObjectUtils.hashCode(objectB);
    }
}
