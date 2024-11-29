package polymorphism;

import java.util.ArrayList;

public class ModArrayList<E> extends ArrayList<E> {

    public E getUsingMod(int index) {
        int modIndex = Math.abs(index) % size();

        return get(modIndex);
    }

}
