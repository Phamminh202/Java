package bai10;

abstract class bai10vd8 {
    private final float  PI=3.14F;

    /**
     * Returns the value of PI
     *
     * @return float
     */
    public float getPI() {
        return PI;
    }
    /**
     * Abstract method
     * @param val a float variable storing the value specified by user
     *
     * @return float
     */
    abstract void calculate(float val);
}
