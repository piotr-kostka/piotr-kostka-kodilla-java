package com.kodilla.exception.io;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallangeTestSuite {

    @Test
    void testProbablyIWillThrowException() {
        //given
        SecondChallenge secondChallenge = new SecondChallenge();

        //when & then
        Assertions.assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.99, 1.5)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.99, 2)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 1.5)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 2)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.99, 1.5)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 2)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.5, 2)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.99, 2))
        );
    }
}
