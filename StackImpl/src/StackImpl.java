public class StackImpl<T> {

    // 栈顶元素的位置
    private int mTop;

    // 栈的容量
    private int mCapacity;

    // 存放栈元素的数组
    private Object[] mElements;

    public StackImpl(int capacity) {
        this.mCapacity = capacity;
        mTop = 0;
        mElements = new Object[mCapacity];
    }

    /**
     * 清空栈中的元素
     */
    public void clearStack() {
        mTop = 0;
    }

    /**
     * 获得栈中元素的个数
     *
     * @return
     */
    public int getStackSize() {
        return mTop;
    }

    /**
     * 入栈
     *
     * @param element
     * @return
     */
    public boolean push(T element) {
        if (isFull()) {
            return false;
        }

        mElements[mTop++] = element;
        return true;
    }

    /**
     * 出栈
     *
     * @return
     */
    public T pop() {
        if (isEmpty()) {
            return null;
        }

        T element = (T) mElements[--mTop];
        return element;
    }

    /**
     * 从栈底到栈顶，依次遍历栈中的元素
     */
    public void traverseStack() {
        for (int i = 0; i < mTop; i++) {
            if (i == mTop - 1) {
                System.out.print(mElements[i]);
                break;
            }
            System.out.print(mElements[i] + ",");
        }
    }

    /**
     * 判断栈是否为空
     *
     * @return
     */
    private boolean isEmpty() {
        return mTop == 0;
    }

    /**
     * 判断栈是否为满的
     *
     * @return
     */
    private boolean isFull() {
        return mTop == mCapacity;
    }

    // 验证
    public static void main(String[] args) {
        StackImpl stack = new StackImpl(5);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

}
