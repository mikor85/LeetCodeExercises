package multithreading.print_in_order_1114;

import lombok.SneakyThrows;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PrintInOrderTest {

    @Test
    public void checkPrintingOrder() throws InterruptedException {
        var printInOrder = new PrintInOrder();
        var sb = new StringBuilder();

        var thread1 = new Thread(() -> printFirst(printInOrder, () -> sb.append("first")));
        var thread2 = new Thread(() -> printSecond(printInOrder, () -> sb.append("second")));
        var thread3 = new Thread(() -> printThird(printInOrder, () -> sb.append("third")));

        thread3.start();
        thread2.start();
        thread1.start();

        Thread.sleep(50);

        assertThat(sb.toString()).isEqualTo("firstsecondthird");
    }

    @SneakyThrows
    private void printFirst(PrintInOrder printInOrder, Runnable runnable) {
        printInOrder.first(runnable);
    }

    @SneakyThrows
    private void printSecond(PrintInOrder printInOrder, Runnable runnable) {
        printInOrder.second(runnable);
    }

    @SneakyThrows
    private void printThird(PrintInOrder printInOrder, Runnable runnable) {
        printInOrder.third(runnable);
    }
}