package exceptions;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ArrayActionsTest {
    @Test
    void checkIndex() {
        int arr[] = {1, 2, 3, 4};
        Assertions.assertThat(ArrayActions.checkIndex(arr, 3)).isTrue();
        Assertions.assertThat(ArrayActions.checkIndex(arr, 5)).isFalse();
    }
}