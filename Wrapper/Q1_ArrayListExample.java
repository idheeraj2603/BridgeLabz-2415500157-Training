ArrayList in Java is a generic class that works only with objects, not with primitive data types.

Primitives like int, char, double are not objects, so they cannot be used directly with generics.

That’s why this is not allowed:

ArrayList<int> list = new ArrayList<int>(); // ERROR


But this is allowed:

ArrayList<Integer> list = new ArrayList<Integer>();