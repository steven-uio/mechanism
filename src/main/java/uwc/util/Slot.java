package uwc.util;

abstract class Slot<T> {
    protected long mTs = System.nanoTime();

    protected <z extends Slot<T>> z duplicate(z slot) {
        if (null != slot) mTs = slot.mTs;
        return (z) this;
    }
}
